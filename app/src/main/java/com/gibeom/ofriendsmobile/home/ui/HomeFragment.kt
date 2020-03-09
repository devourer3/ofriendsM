package com.gibeom.ofriendsmobile.home.ui

import android.os.Bundle
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import com.gibeom.ofriendsmobile.R
import com.gibeom.ofriendsmobile.databinding.FragmentHomeBinding
import com.gibeom.ofriendsmobile.di.Injectable
import com.gibeom.ofriendsmobile.di.injectViewModel
import com.gibeom.ofriendsmobile.home.ui.adapter.*
import com.gibeom.ofriendsmobile.utils.hideKeyboard
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.toolbar_home.view.*
import javax.inject.Inject

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [HomeFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment(), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding

    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>

    private val cAdapter: CategoryAdapter by lazy { CategoryAdapter(viewModel) } // 라이프, 메이저 탭 어댑터 - 리스트 어댑터
    private val lLAdatper: LifeCategoryAdapter by lazy { LifeCategoryAdapter(viewModel) } // 라이프, 마이너 탭 어댑터 - 리스트 어댑터

    private val rAdapterAwesome: AwesomeRisingAdapter by lazy { AwesomeRisingAdapter(viewModel) } // 멋진 - 리스트 어댑터

    private val lAdapter: LifeRisingAdapter by lazy { LifeRisingAdapter(homeViewModel = viewModel) } // 라이프 - 페이지드 리스트 어댑터
    private val sAdapter: LifeRisingAdapter by lazy { LifeRisingAdapter(homeViewModel = viewModel) } // 검색결과 - 페이지드 리스트 어댑터

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        viewModel = injectViewModel(viewModelFactory)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        bind()
        setListener()
        subscribeUi()
    }

    private fun bind() {
        bottomSheetBehavior = BottomSheetBehavior.from(binding.cLBottomSheet)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.iCLife.vmHome = viewModel
        binding.iCawesome.vmHome = viewModel
        binding.homeVm = viewModel
        binding.iCNoContent.noContentFormat = "S0011"
    }

    private fun setListener() {
        binding.aBHome.main_toolbar.eTSearch.setOnEditorActionListener(object : TextView.OnEditorActionListener{
            override fun onEditorAction(view: TextView?, action: Int, event: KeyEvent?): Boolean {
                if(action == EditorInfo.IME_ACTION_SEARCH) {
                    val viewText = view?.text.toString()
                    if(viewText.isBlank() || viewText.isEmpty()) return false
                    viewModel.setSearchQuery(viewText)
                    hideKeyboard(view)
                    binding.cLBottomSheet.visibility = View.VISIBLE
                    bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
                    return true
                }
                return false
            }
        })

        binding.iCawesome.tVRiseEntire.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_promoFragment)
        }
//        bottomSheetBehavior.addBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
//            override fun onSlide(bottomSheet: View, slideOffset: Float) {
//            }
//
//            override fun onStateChanged(bottomSheet: View, newState: Int) {
//            }
//        })
    }



    private fun subscribeUi() {

        viewModel.searchQueryItems.observe(viewLifecycleOwner) {
            binding.rVSearch.apply {
                adapter = sAdapter
                sAdapter.submitList(it)
            }
        }

        viewModel.getAwesomeCategory().observe(viewLifecycleOwner) {
            binding.iCawesome.rVCategory.apply {
                adapter = cAdapter
                cAdapter.submitList(it)
            }
        }

        viewModel.getBanners().observe(viewLifecycleOwner) {
            binding.iCawesome.vPMainBanner.apply {
                clipToPadding = false
                pageMargin = 12
                adapter = AwesomeBannerAdapter(it)
            }
            binding.iCawesome.tLIndicator.setupWithViewPager(binding.iCawesome.vPMainBanner)
        }

        viewModel.getRisingItem().observe(viewLifecycleOwner) {
            binding.iCawesome.rVRisingLife.apply {
                adapter = rAdapterAwesome
                rAdapterAwesome.submitList(it)
            }
        }

        viewModel.selectedLifeMajorTab.observe(viewLifecycleOwner) {
            viewModel.getLifeTabList(it).observe(viewLifecycleOwner) { it2 ->
                binding.iCLife.rVLifeList.apply {
                    adapter = lLAdatper
                    itemAnimator = null
                    lLAdatper.submitList(it2)
                }
            }
        }

        viewModel.selectedLifeMinorTab.observe(viewLifecycleOwner) {
            binding.iCLife.rVLifeList.apply {
                adapter = lLAdatper
                lLAdatper.notifyDataSetChanged()
            }
        }

        viewModel.lifeQuery.observe(viewLifecycleOwner) {
            viewModel.lifeQueryItems.observe(viewLifecycleOwner) {
                binding.iCLife.rVFilteredPrd.apply {
                    adapter = lAdapter
                    itemAnimator = null
                    lAdapter.submitList(it)
                }
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()


    }

}

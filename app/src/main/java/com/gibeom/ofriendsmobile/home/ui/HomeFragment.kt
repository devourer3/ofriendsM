package com.gibeom.ofriendsmobile.home.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import com.gibeom.ofriendsmobile.R
import com.gibeom.ofriendsmobile.databinding.FragmentHomeBinding
import com.gibeom.ofriendsmobile.di.Injectable
import com.gibeom.ofriendsmobile.di.injectViewModel
import com.gibeom.ofriendsmobile.home.ui.adapter.*
import timber.log.Timber
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

    private val cAdapter: CategoryAdapter by lazy { CategoryAdapter(viewModel) } // 라이프 - 메이저 탭 어댑터
    private val lLAdatper: LifeCategoryAdapter by lazy { LifeCategoryAdapter(viewModel) } // 라이프 - 마이너 탭 어댑터
    private val rAdapterAwesome: AwesomeRisingAdapter by lazy { AwesomeRisingAdapter(viewModel) } // 멋진 - 리스트 어댑터
    private val lAdapter: LifeRisingAdapter by lazy { LifeRisingAdapter(homeViewModel = viewModel) } // 라이프 - 페이지드 리스트 어댑터

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        viewModel = injectViewModel(viewModelFactory)
        return binding.root
        // context ?: binding.root
        // Inflate the layout for this fragment
//    return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        bind()
        setListener()
        subscribeUi()
    }

    private fun setListener() {
        binding.iCawesome.tVRiseEntire.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_promoFragment)
        }
    }

    private fun bind() {
        binding.lifecycleOwner = viewLifecycleOwner
        binding.iCLife.vmHome = viewModel
        binding.iCawesome.vmHome = viewModel
        binding.homeVm = viewModel
    }

    private fun subscribeUi() {

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
            viewModel.queryItems.observe(viewLifecycleOwner) {
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

    // TODO: Rename method, update argument and hook method into UI event
//    fun onButtonPressed(uri: Uri) {
//        listener?.onFragmentInteraction(uri)
//    }


}

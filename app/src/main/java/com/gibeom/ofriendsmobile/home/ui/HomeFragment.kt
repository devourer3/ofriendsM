package com.gibeom.ofriendsmobile.home.ui

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import com.gibeom.ofriendsmobile.databinding.FragmentHomeBinding
import com.gibeom.ofriendsmobile.di.Injectable
import com.gibeom.ofriendsmobile.di.injectViewModel
import timber.log.Timber
import javax.inject.Inject

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [HomeFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment(), Injectable {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: HomeViewModel

    private val cAdapter: CategoryAdapter by lazy { CategoryAdapter() }
    private val rAdapter: RisingLifeAdapter by lazy { RisingLifeAdapter() } // 멋진 - 리스트 어댑터
    private val fAdapter: RisingLifeAdapter by lazy { RisingLifeAdapter() } // 라이프 - 필터 리스트 어댑터
    private val lLAdatper: LifeCategoryAdapter by lazy { LifeCategoryAdapter(viewModel) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)
        context ?: binding.root
        viewModel = injectViewModel(viewModelFactory)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.homeVm = viewModel
        binding.iCLife.hmVM = viewModel
        subscribeUi(binding)
        return binding.root
        // Inflate the layout for this fragment
//    return inflater.inflate(R.layout.fragment_home, container, false)
    }

    private fun subscribeUi(binding: FragmentHomeBinding) {
        viewModel.getAwesomeCategory().observe(viewLifecycleOwner) {
            binding.iCawesome.rVCategory.apply {
                adapter = cAdapter
                cAdapter.submitList(it)
            }
        }

        viewModel.getBanners()?.observe(viewLifecycleOwner) {
            //      pager.adapter = BannerPagerAdapter(it.data?.banners)
            binding.iCawesome.vPMainBanner.apply {
                clipToPadding = false
                pageMargin = 14
                adapter = BannerPagerAdapter(it)
            }
            binding.iCawesome.tLIndicator.setupWithViewPager(binding.iCawesome.vPMainBanner)
        }

        viewModel.getRisingItem()?.observe(viewLifecycleOwner) {
            binding.iCawesome.rVRisingLife.apply {
                adapter = rAdapter
                rAdapter.submitList(it)
            }
        }

        viewModel.selectedLifeMajorTab.observe(viewLifecycleOwner) {
            viewModel.getLifeTabList(it).observe(viewLifecycleOwner) { it2 ->
                binding.iCLife.rVLifeList.apply {
                    adapter = lLAdatper
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
            viewModel.getFilteredPrd(it[0], it[1]).observe(viewLifecycleOwner) {
                binding.iCLife.rVFilteredPrd.apply {
                    adapter = fAdapter
                    fAdapter.submitList(it)
                }
            }
        }


//        viewModel.getLifeTabList(0).observe(viewLifecycleOwner) {
//            binding.iCLife.rVLifeList.apply {
//                adapter = lLAdatper
//                lLAdatper.submitList(it)
//            }
//        }
    }

    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {
        listener?.onFragmentInteraction(uri)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Timber.d("ON_ACTIVITY_CREATED_FROM_HOME")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Timber.d("ATTACH_FROM_HOME")
    }

    override fun onDetach() {
        super.onDetach()
        Timber.d("DETACH_FROM_HOME")
        listener = null
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

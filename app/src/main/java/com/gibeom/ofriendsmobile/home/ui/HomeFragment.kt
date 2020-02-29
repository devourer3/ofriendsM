package com.gibeom.ofriendsmobile.home.ui

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import com.gibeom.ofriendsmobile.databinding.FragmentHomeBinding
import com.gibeom.ofriendsmobile.di.Injectable
import com.gibeom.ofriendsmobile.di.injectViewModel
import com.gibeom.ofriendsmobile.home.data.Banners
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
  private val rAdapter: RisingLifeAdapter by lazy { RisingLifeAdapter() }

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
    subscribeUi(binding)
    return binding.root
    // Inflate the layout for this fragment
//    return inflater.inflate(R.layout.fragment_home, container, false)
  }

  private fun subscribeUi(binding: FragmentHomeBinding) {

    viewModel.getCategory().observe(viewLifecycleOwner) {
      binding.rVCategory.apply {
        adapter = cAdapter
        cAdapter.submitList(it)
      }
    }

    viewModel.getBanners()?.observe(viewLifecycleOwner) {
      //      pager.adapter = BannerPagerAdapter(it.data?.banners)
      binding.vPMainBanner.apply {
        clipToPadding = false
        pageMargin = 14
        adapter = BannerPagerAdapter(it)
      }

      binding.tLIndicator.setupWithViewPager(binding.vPMainBanner)
//      var asd = resources.getStringArray(R.array.categoryName)
//      for(item in asd) {
//        Timber.d("items: %s", item)
//      }
//      binding.vPMainBanner.setCurrentItem(2, true)
//      binding.vPMainBanner.startAutoScroll(true)
//      binding.tLIndicator.setupWithViewPager(binding.vPMainBanner)
//      binding.executePendingBindings()
    }

    viewModel.getRisingItem()?.observe(viewLifecycleOwner) {
      binding.rVRisingLife.apply {
        adapter = rAdapter
        rAdapter.submitList(it)
      }
    }

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


//    if (context is OnFragmentInteractionListener) {
//      listener = context
//    } else {
//      throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
//    }
  }

//  private fun subscribeUi(adapter: BannerPagerAdapter) {
//  }

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

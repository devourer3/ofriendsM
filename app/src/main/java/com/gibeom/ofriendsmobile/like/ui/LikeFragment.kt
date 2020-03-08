package com.gibeom.ofriendsmobile.like.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import com.gibeom.ofriendsmobile.databinding.FragmentLikeBinding
import com.gibeom.ofriendsmobile.di.Injectable
import com.gibeom.ofriendsmobile.di.injectViewModel
import com.gibeom.ofriendsmobile.like.ui.adapter.LikeProductAdapter
import timber.log.Timber
import javax.inject.Inject

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [LikeFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [LikeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LikeFragment : Fragment(), Injectable {


    @Inject
    lateinit var viewModelFactory:ViewModelProvider.Factory

    private lateinit var binding:FragmentLikeBinding
    private lateinit var viewModel:LikeViewModel

    private val pAdapter by lazy { LikeProductAdapter(viewModel) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLikeBinding.inflate(inflater, container, false)
        viewModel = injectViewModel(viewModelFactory)
        return binding.root
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        bind()
        subscribeUi()
    }


    private fun bind() {
        binding.lifecycleOwner = viewLifecycleOwner
        binding.iCNoContent.noContentFormat = "S0009"
    }


    private fun subscribeUi() {
        viewModel.observeLocalProduct().observe(viewLifecycleOwner) {
            Timber.w("SIZE: ${it.size}")
            binding.total = it.size
            binding.rVLike.apply {
                adapter = pAdapter
                pAdapter.submitList(it)
            }
        }

    }

}

package com.gibeom.ofriendsmobile.home.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.adapters.ViewGroupBindingAdapter.setListener
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import com.gibeom.ofriendsmobile.R
import com.gibeom.ofriendsmobile.databinding.FragmentPromoBinding
import com.gibeom.ofriendsmobile.di.Injectable
import com.gibeom.ofriendsmobile.di.injectViewModel
import com.gibeom.ofriendsmobile.home.ui.adapter.LifeRisingAdapter
import javax.inject.Inject

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PromoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PromoFragment : Fragment(), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewModel: PromoViewModel

    private val prAdapter: LifeRisingAdapter by lazy { LifeRisingAdapter() } // 라이프 - 페이지드 리스트 어댑터

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentPromoBinding.inflate(inflater, container, false)
        viewModel = injectViewModel(viewModelFactory)
        setBind(binding)
        setListener(binding)
        subscribeUi(binding)
        return binding.root
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_promo, container, false)
    }

    private fun setListener(binding: FragmentPromoBinding?) {
        binding?.iCPromoTB?.iVBackBtn?.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun setBind(binding: FragmentPromoBinding?) {
        binding?.lifecycleOwner = viewLifecycleOwner
        binding?.vmPr = viewModel
    }

    private fun subscribeUi(binding: FragmentPromoBinding?) {
        viewModel.getTotalItem().observe(viewLifecycleOwner, onChanged = {
            binding?.iCPromoTB?.tVTitle?.text = getString(R.string.S0006, it)
        })
        viewModel.getFilteredPrd("[0,19]","{\"promo\":\"1\"}").observe(viewLifecycleOwner) {
            binding?.rVPromo?.apply {
                adapter = prAdapter
                prAdapter.submitList(it)
            }
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PromoFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PromoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

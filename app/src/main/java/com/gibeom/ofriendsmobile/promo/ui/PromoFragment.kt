package com.gibeom.ofriendsmobile.promo.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import com.gibeom.ofriendsmobile.R
import com.gibeom.ofriendsmobile.databinding.FragmentPromoBinding
import com.gibeom.ofriendsmobile.di.Injectable
import com.gibeom.ofriendsmobile.di.injectViewModel
import com.gibeom.ofriendsmobile.home.ui.adapter.LifeRisingAdapter
import com.gibeom.ofriendsmobile.promo.data.PromoViewModel
import javax.inject.Inject

/**
 * A simple [Fragment] subclass.
 * Use the [PromoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PromoFragment : Fragment(), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewModel: PromoViewModel

    private val prAdapter: LifeRisingAdapter by lazy { LifeRisingAdapter(promoViewModel = viewModel) } // 라이프 - 페이지드 리스트 어댑터

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
        viewModel.totalItems?.observe(viewLifecycleOwner) {
            binding?.rVPromo?.apply {
                adapter = prAdapter
                prAdapter.submitList(it)
            }
        }
    }

}

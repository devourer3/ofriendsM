package com.gibeom.ofriendsmobile.home.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.gibeom.ofriendsmobile.databinding.FragmentProductDetailBinding
import com.gibeom.ofriendsmobile.di.Injectable
import com.gibeom.ofriendsmobile.di.injectViewModel
import com.gibeom.ofriendsmobile.home.ui.adapter.ProductDetailBannerAdapter
import javax.inject.Inject

/**
 * A simple [Fragment] subclass.
 * Use the [ProductDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProductDetailFragment : Fragment(), Injectable {

    private val args: ProductDetailFragmentArgs by navArgs()
    private val isInternal: Boolean by lazy { args.isInternal }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: ProductDetailViewModel
    private lateinit var binding: FragmentProductDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductDetailBinding.inflate(inflater, container, false)
        return binding.root
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_product_detail, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        bind()
        setListener(binding)
        subscribeUi(binding)
    }

    private fun bind() {
        viewModel = injectViewModel(viewModelFactory)
    }

    private fun setListener(binding: FragmentProductDetailBinding?) {
        binding?.iCToolbar?.iVBackBtn?.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun subscribeUi(binding: FragmentProductDetailBinding) {
        if (isInternal) {
            binding.scVDetail.visibility = View.VISIBLE
            viewModel.getProductDetail(args.id)
            viewModel.observeProduct().observe(viewLifecycleOwner, onChanged = {
                binding.iCToolbar.tVTitle.text = it?.title
                binding.productInfo = it
                binding.vPDetailBanner.apply {
                    clipToPadding = false
                    adapter = ProductDetailBannerAdapter(it?.imageList)
                }
            })
        } else {
            binding.wVEvent.visibility = View.VISIBLE
            val webSetting = binding.wVEvent.settings.apply {
                //            javaScriptEnabled = true
                useWideViewPort = true
                loadWithOverviewMode = true
                builtInZoomControls = true
                setSupportZoom(true)
            }
            binding.wVEvent.apply{
                settings.let { webSetting }
                webViewClient = MyWebClient()
                loadUrl(args.url)
            }
        }
    }

    private class MyWebClient: WebViewClient() {
        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            return super.shouldOverrideUrlLoading(view, request)
        }
    }

}

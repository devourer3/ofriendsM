package com.gibeom.ofriendsmobile.home.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.viewpager.widget.PagerAdapter
import com.gibeom.ofriendsmobile.R
import com.gibeom.ofriendsmobile.home.data.Banners
import com.gibeom.ofriendsmobile.home.ui.HomeFragmentDirections
import com.gibeom.ofriendsmobile.utils.bindImageFromUrl
import kotlinx.android.synthetic.main.list_item_banner.view.*

class AwesomeBannerAdapter(
    private val banners: MutableList<Banners>?
) : PagerAdapter() {
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view =
            LayoutInflater.from(container.context)
                .inflate(R.layout.list_item_banner, container, false)
        val imageUrl:String? = banners?.get(position)?.image_mobile ?: ""
        view.apply {
            setOnClickListener {
                val isInternal = banners?.get(position)?.type == "internal"
                if (isInternal) {
                    val linkId = banners?.get(position)?.link?.split('/')?.get(2)
                    val action = HomeFragmentDirections.actionHomeFragmentToProductDetailFragment(
                        id = Integer.parseInt(linkId ?: "0"), isInternal = true
                    )
                    it.findNavController().navigate(action)
                } else {
                    val linkUrl = banners?.get(position)?.link
                    val action = HomeFragmentDirections.actionHomeFragmentToProductDetailFragment(
                        url = linkUrl ?: "", isInternal = false
                    )
                    it.findNavController().navigate(action)
                }
            }
            bindImageFromUrl(view.iVBanners, imageUrl)
            container.addView(view)
            return view
        }
    }

    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
        container.removeView(obj as View?)
//    super.destroyItem(container, position, obj)
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean {
        return view == obj
    }

    override fun getCount(): Int {
        return banners?.size ?: 1
    }
}
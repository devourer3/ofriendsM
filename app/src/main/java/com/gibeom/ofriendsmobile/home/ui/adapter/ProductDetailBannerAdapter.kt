package com.gibeom.ofriendsmobile.home.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.gibeom.ofriendsmobile.R
import com.gibeom.ofriendsmobile.utils.bindImageFromUrl
import kotlinx.android.synthetic.main.list_item_banner.view.*

class ProductDetailBannerAdapter(
    private val banners: MutableList<String>?
) : PagerAdapter() {
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater
            .from(container.context)
            .inflate(R.layout.list_item_banner, container, false)
        val imageUrl: String? = banners?.get(position) ?: ""
        view.apply {
            bindImageFromUrl(view.iVBanners, imageUrl)
            container.addView(view)
            return view
        }
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }

    override fun getCount(): Int {
        return banners?.size ?: 0
    }
}
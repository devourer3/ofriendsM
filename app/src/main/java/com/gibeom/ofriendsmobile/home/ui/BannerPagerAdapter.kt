package com.gibeom.ofriendsmobile.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.gibeom.ofriendsmobile.R
import com.gibeom.ofriendsmobile.home.data.Banners
import com.gibeom.ofriendsmobile.utils.bindImageFromUrl
import kotlinx.android.synthetic.main.list_item_banner.view.*
import timber.log.Timber

class BannerPagerAdapter(
  private val banners: MutableList<Banners>?) : PagerAdapter() {
  override fun instantiateItem(container: ViewGroup, position: Int): Any {
//    val inflater = LayoutInflater.from(container.context)
    val view =
      LayoutInflater.from(container.context).inflate(R.layout.list_item_banner, container, false)
//    val binding = CardItemBannerBinding.inflate(inflater, container, false)
//    val realPos: Int = position % (banners?.size ?: 1)
    view.apply {
      setOnClickListener {
        Timber.d("%s번째 아이템 클릭", position)
      }

      bindImageFromUrl(view.iVBanners, banners?.get(position)?.image_mobile ?: "")
      container.addView(view)
      //      return instantiateItem(container, position)
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
//    return Integer.MAX_VALUE
  }
}
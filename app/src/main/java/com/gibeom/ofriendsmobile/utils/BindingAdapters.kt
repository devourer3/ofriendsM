package com.gibeom.ofriendsmobile.utils

import android.content.res.Resources
import android.graphics.Color
import android.graphics.Typeface
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.annotation.IdRes
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.core.text.HtmlCompat
import androidx.databinding.BindingAdapter
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.gibeom.ofriendsmobile.GlideApp
import com.gibeom.ofriendsmobile.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import timber.log.Timber
import java.text.DecimalFormat

// https://medium.com/@joongwon/android-aac%EB%A5%BC-%ED%99%9C%EC%9A%A9%ED%95%9C-mvvm-%ED%8C%A8%ED%84%B4-e24a685fc25d


@BindingAdapter("isGone")
fun bindIsGone(view: View, isGone: Boolean) {
    view.visibility = if (isGone) {
        View.GONE
    } else {
        View.VISIBLE
    }
}

@BindingAdapter("isGone")
fun bindIsGone(view: FloatingActionButton, isGone: Boolean?) {
    if (isGone == null || isGone) {
        view.hide()
    } else {
        view.show()
    }
}

@BindingAdapter("isLoading")
fun bindLoading(view: ProgressBar, status: String? = "LOADING") {
    view.visibility = if (status == "LOADING") {
        View.VISIBLE
    } else {
        View.GONE
    }
}

@BindingAdapter("imageFromUrl")
fun bindImageFromUrl(view: ImageView, imageUrl: String?) {
    if (!imageUrl.isNullOrEmpty()) {
        GlideApp.with(view.context)
            .load(imageUrl)
            .apply {
                placeholder(R.drawable.ic_placeholder).error(R.drawable.profile)
            }
//            .transition(DrawableTransitionOptions.withCrossFade())
            .into(view)
    }
}

@BindingAdapter("radiusImageFromUrl", "radiusValue", requireAll = false)
fun bindRadiusImageFromUrl(view: ImageView, radiusImageFromUrl: String?, radiusValue: Int = 20) {
    radiusImageFromUrl?.let {
        GlideApp.with(view.context)
            .load(it)
            .apply {
                placeholder(R.drawable.ic_placeholder).error(R.drawable.profile)
                    .transform(RoundedCorners(radiusValue))
            }
            .transform(MultiTransformation(CenterCrop(), RoundedCorners(radiusValue)))
            // https://github.com/bumptech/glide/issues/3195
//            .transition(DrawableTransitionOptions.withCrossFade())
            .into(view)
    }
}

@BindingAdapter("textStyle")
fun bindTextStyle(view: AppCompatTextView, style: String) {
    when (style) {
        "bold" -> {
            view.setTypeface(null, Typeface.BOLD)
        }
        "normal" -> {
            view.setTypeface(null, Typeface.NORMAL)
        }
        else -> {
            view.setTypeface(null, Typeface.NORMAL)
        }
    }
}

@BindingAdapter("setBorderBackground")
fun bindBorderBackground(view: AppCompatTextView, selected: Boolean) {
    if (selected) view.setBackgroundResource(R.drawable.bottom_border_selected)
    else view.setBackgroundResource(R.drawable.bottom_border_unselected)
}

@BindingAdapter("setWhRadBackground")
fun bindWhiteRdBg(view: AppCompatTextView, selected: Boolean) {
    if (selected) view.setBackgroundResource(R.drawable.white_radius_bg)
//    else view.setBackgroundColor(Color.TRANSPARENT)
}

@BindingAdapter("setLcTextColor")
fun bindLcTextColor(view: AppCompatTextView, selected: Boolean) {
    if (selected) view.setTextColor(Color.parseColor("#212121"))
    else view.setTextColor(Color.parseColor("#ffffff"))
//    else view.setBackgroundColor(Color.TRANSPARENT)
}

@BindingAdapter("renderHtml")
fun bindRenderHtml(view: TextView, description: String?) {
    if (description != null) {
        view.text = HtmlCompat.fromHtml(description, HtmlCompat.FROM_HTML_MODE_COMPACT)
        view.movementMethod = LinkMovementMethod.getInstance()
    } else {
        view.text = ""
    }
}

@BindingAdapter("formatName", "formatText", "formatText2", requireAll = false)
fun bindTextFormat(view: TextView, formatName: String?, formatText: Any? = "", formatText2: Any? = "") {
    val res: Resources = view.context.resources
    val format = res.getIdentifier(formatName, "string", view.context.packageName)
    view.text = view.context.getString(format, formatText.toString(), formatText2.toString())
}

@BindingAdapter("setMoney")
fun bindSetMoney(view: AppCompatTextView, value: Int) {
    val decimalFormat = DecimalFormat("###,###")
    view.text = view.context.getString(R.string.money, decimalFormat.format(value))
}
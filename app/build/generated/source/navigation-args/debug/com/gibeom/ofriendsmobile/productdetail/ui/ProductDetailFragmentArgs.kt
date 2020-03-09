package com.gibeom.ofriendsmobile.productdetail.ui

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.jvm.JvmStatic

data class ProductDetailFragmentArgs(
  val id: Int = 0,
  val url: String = "0",
  val isInternal: Boolean = false
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("id", this.id)
    result.putString("url", this.url)
    result.putBoolean("isInternal", this.isInternal)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): ProductDetailFragmentArgs {
      bundle.setClassLoader(ProductDetailFragmentArgs::class.java.classLoader)
      val __id : Int
      if (bundle.containsKey("id")) {
        __id = bundle.getInt("id")
      } else {
        __id = 0
      }
      val __url : String?
      if (bundle.containsKey("url")) {
        __url = bundle.getString("url")
        if (__url == null) {
          throw IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.")
        }
      } else {
        __url = "0"
      }
      val __isInternal : Boolean
      if (bundle.containsKey("isInternal")) {
        __isInternal = bundle.getBoolean("isInternal")
      } else {
        __isInternal = false
      }
      return ProductDetailFragmentArgs(__id, __url, __isInternal)
    }
  }
}

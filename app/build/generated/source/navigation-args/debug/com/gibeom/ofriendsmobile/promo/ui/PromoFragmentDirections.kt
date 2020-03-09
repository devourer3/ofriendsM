package com.gibeom.ofriendsmobile.promo.ui

import android.os.Bundle
import androidx.navigation.NavDirections
import com.gibeom.ofriendsmobile.R
import kotlin.Boolean
import kotlin.Int
import kotlin.String

class PromoFragmentDirections private constructor() {
  private data class ActionPromoFragmentToProductDetailFragment(
    val id: Int = 0,
    val url: String = "0",
    val isInternal: Boolean = false
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_promoFragment_to_productDetailFragment

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("id", this.id)
      result.putString("url", this.url)
      result.putBoolean("isInternal", this.isInternal)
      return result
    }
  }

  companion object {
    fun actionPromoFragmentToProductDetailFragment(
      id: Int = 0,
      url: String = "0",
      isInternal: Boolean = false
    ): NavDirections = ActionPromoFragmentToProductDetailFragment(id, url, isInternal)
  }
}

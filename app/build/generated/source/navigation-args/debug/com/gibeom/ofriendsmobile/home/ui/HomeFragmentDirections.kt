package com.gibeom.ofriendsmobile.home.ui

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.gibeom.ofriendsmobile.R
import kotlin.Boolean
import kotlin.Int
import kotlin.String

class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToProductDetailFragment(
    val id: Int = 0,
    val url: String = "0",
    val isInternal: Boolean = false
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_homeFragment_to_productDetailFragment

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("id", this.id)
      result.putString("url", this.url)
      result.putBoolean("isInternal", this.isInternal)
      return result
    }
  }

  companion object {
    fun actionHomeFragmentToPromoFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_promoFragment)

    fun actionHomeFragmentToProductDetailFragment(
      id: Int = 0,
      url: String = "0",
      isInternal: Boolean = false
    ): NavDirections = ActionHomeFragmentToProductDetailFragment(id, url, isInternal)
  }
}

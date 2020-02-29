package com.gibeom.ofriendsmobile.home.data

import com.google.gson.annotations.SerializedName

data class Main(
  @SerializedName("banners")
  val banners: MutableList<Banners>,
  @SerializedName("event_banners")
  val evBanners: MutableList<EventBanners>,
  @SerializedName("collaboration_banners")
  val crBanners: MutableList<CollaborationBanners>,
  @SerializedName("products")
  val products: MutableList<RisingLife>,
  @SerializedName("magazines")
  val Magazines: MutableList<Magazines>)

data class Category(
  @SerializedName("cat_id")
  val id:Int,
  @SerializedName("cat_name")
  val name:String,
  @SerializedName("cat_image")
  val imageUrl:String,
  @SerializedName("cat_bg")
  val background:String
)

data class Banners(
  @SerializedName("id")
  val id: Int,
  @SerializedName("type")
  val type: String,
  @SerializedName("name")
  val name: String,
  @SerializedName("link")
  val link: String,
  @SerializedName("image_link")
  val image_link: String,
  @SerializedName("image_desktop")
  val image_desktop: String,
  @SerializedName("image_mobile")
  val image_mobile: String)

data class EventBanners(
  @SerializedName("id")
  val id: Int,
  @SerializedName("type")
  val type: String,
  @SerializedName("name")
  val name: String,
  @SerializedName("link")
  val link: String,
  @SerializedName("image_link")
  val image_link: String)

data class CollaborationBanners(
  @SerializedName("id")
  val id: Int,
  @SerializedName("type")
  val type: String,
  @SerializedName("name")
  val name: String,
  @SerializedName("link")
  val link: String,
  @SerializedName("image_link")
  val image_link: String,
  @SerializedName("image_desktop")
  val image_desktop: String,
  @SerializedName("image_mobile")
  val image_mobile: String)

data class RisingLife(
  @SerializedName("id")
  val id: Int,
  @SerializedName("frip_type")
  val type: String,
  @SerializedName("title")
  val title: String,
  @SerializedName("catch_phrase")
  val catchPhrase: String,
  @SerializedName("price")
  val price: String,
  @SerializedName("original_price")
  val originPrice: String,
  @SerializedName("rating")
  val rating: Int,
  @SerializedName("location")
  val location: String,
  @SerializedName("is_hot")
  val isHot: Int,
  @SerializedName("is_only")
  val isOnly: Int,
  @SerializedName("is_new")
  val isNew: Int,
  var image_link: String)

data class Magazines(
  @SerializedName("id")
  val id: Int,
  @SerializedName("type")
  val type: String,
  @SerializedName("name")
  val name: String,
  @SerializedName("link")
  val link: String,
  @SerializedName("image_link")
  val image_link: String,
  @SerializedName("image_desktop")
  val image_desktop: String,
  @SerializedName("image_mobile")
  val image_mobile: String)
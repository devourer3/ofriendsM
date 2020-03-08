package com.gibeom.ofriendsmobile.home.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class Main(
    @SerializedName("banners")
    val banners: MutableList<Banners>,
    @SerializedName("event_banners")
    val evBanners: MutableList<EventBanners>,
    @SerializedName("collaboration_banners")
    val crBanners: MutableList<CollaborationBanners>,
    @SerializedName("products")
    val products: MutableList<Product>,
    @SerializedName("magazines")
    val Magazines: MutableList<Magazines>
)

data class Category(
    @SerializedName("cat_id")
    val id: Int,
    @SerializedName("cat_name")
    val name: String,
    @SerializedName("cat_image")
    val imageUrl: String,
    @SerializedName("cat_bg")
    val background: String,
    @SerializedName("cat_major")
    val cat: String
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
    val image_mobile: String
)

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
    val image_link: String
)

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
    val image_mobile: String
)

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
    val image_mobile: String
)

@Entity(tableName = "product")
data class Product(
    @PrimaryKey(autoGenerate = true)
    @field:SerializedName("id")
    val id: Int,
    @field:SerializedName("frip_type")
    val type: String? = "",
    @field:SerializedName("title")
    val title: String? = "",
    @field:SerializedName("catch_phrase")
    val catchPhrase: String? = "",
    @field:SerializedName("price")
    val price: Int? = 0,
    @field:SerializedName("original_price")
    val originPrice: String? = "",
    @field:SerializedName("rating")
    val rating: Int? = 0,
    @field:SerializedName("location")
    val location: String? = "",
    @field:SerializedName("is_hot")
    val isHot: Int? = 0,
    @field:SerializedName("is_only")
    val isOnly: Int? = 0,
    @field:SerializedName("is_new")
    val isNew: Int? = 0,
    @field:SerializedName("like")
    var like: Int? = 0,
    @field:SerializedName("image_link")
    var image_link: String? = ""
)
package com.gibeom.ofriendsmobile.productdetail.data

import com.google.gson.annotations.SerializedName

data class ProductDetail(
    @SerializedName("product") val product: ProductInfo,
    @SerializedName("product_options") val product_options: List<ProductOptions>,
    @SerializedName("host_reviews") val host_reviews: List<HostReviews>
)

data class HostReviews(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("body") val body: String,
    @SerializedName("product") val product: Int,
    @SerializedName("user") val user: String,
    @SerializedName("ct") val ct: Int,
    @SerializedName("product_title") val product_title: String
)

data class ProductInfo(
    @SerializedName("id") val id: Int,
    @SerializedName("frip_type") val frip_type: String,
    @SerializedName("title") val title: String,
    @SerializedName("catch_phrase") val catch_phrase: String,
    @SerializedName("price") val price: Int,
    @SerializedName("original_price") val original_price: Int,
    @SerializedName("location") val location: String,
    @SerializedName("gathering_place") val gathering_place: String,
    @SerializedName("geo_lat") val geo_lat: Double,
    @SerializedName("geo_lng") val geo_lng: Double,
    @SerializedName("venue") val venue: String,
    @SerializedName("venue_lat") val venue_lat: Double,
    @SerializedName("venue_lng") val venue_lng: Double,
    @SerializedName("body") val body: String,
    @SerializedName("category_major") val category_major: String,
    @SerializedName("category_minor") val category_minor: String,
    @SerializedName("is_hot") val is_hot: Int,
    @SerializedName("is_only") val is_only: Int,
    @SerializedName("is_new") val is_new: Int,
    @SerializedName("exhibit") val exhibit: Int,
    @SerializedName("include") val include: String,
    @SerializedName("exclude") val exclude: String,
    @SerializedName("timetables") val timetables: String,
    @SerializedName("stuffs_to_prepare") val stuffs_to_prepare: String,
    @SerializedName("note") val note: String,
    @SerializedName("faq") val faq: String,
    @SerializedName("refund_information") val refund_information: String,
    @SerializedName("like") val like: Int,
    @SerializedName("likes") val likes: Int,
    @SerializedName("rating") val rating: Int,
    @SerializedName("rating_cnt") val rating_cnt: Int,
    @SerializedName("ct") val ct: Int,
    @SerializedName("no_image") val no_image: Int,
    @SerializedName("host") val host: Int,
    @SerializedName("host_title") val host_title: String,
    @SerializedName("host_body") val host_body: String,
    @SerializedName("host_likes") val host_likes: Int,
    @SerializedName("host_level") val host_level: String,
    @SerializedName("host_image_url") val host_image_url: String,
    @SerializedName("no_product") val no_product: Int,
    var imageList: MutableList<String>? = mutableListOf()
)

data class ProductOptions(
    @SerializedName("id") val id: Int,
    @SerializedName("product") val product: Int,
    @SerializedName("option_text") val option_text: String,
    @SerializedName("sort") val sort: Int,
    @SerializedName("type") val type: String,
    @SerializedName("total_steps") val total_steps: Int,
    @SerializedName("current_step") val current_step: Int,
    @SerializedName("parent_id") val parent_id: Int,
    @SerializedName("original_price") val original_price: String,
    @SerializedName("price") val price: String,
    @SerializedName("remaining_quantity") val remaining_quantity: String,
    @SerializedName("buyable_quantity_limit") val buyable_quantity_limit: Int,
    @SerializedName("is_multiple_ticket") val is_multiple_ticket: Int,
    @SerializedName("start_date") val start_date: String,
    @SerializedName("close_date") val close_date: String,
    @SerializedName("ct") val ct: Int
)
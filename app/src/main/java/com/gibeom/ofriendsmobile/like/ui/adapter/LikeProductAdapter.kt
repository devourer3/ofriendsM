package com.gibeom.ofriendsmobile.like.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.gibeom.ofriendsmobile.databinding.ListItemProductBinding
import com.gibeom.ofriendsmobile.home.data.Product
import com.gibeom.ofriendsmobile.home.ui.HomeViewModel
import com.gibeom.ofriendsmobile.like.ui.LikeFragmentDirections
import com.gibeom.ofriendsmobile.like.ui.LikeViewModel

class LikeProductAdapter(val viewModel: LikeViewModel) :
    ListAdapter<Product, LikeProductAdapter.LikeProductViewHolder>(DiffCallback()) {
    inner class LikeProductViewHolder(private val binding: ListItemProductBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Product) {
            binding.apply {
                product = item
                root.setOnClickListener {
                    val action = LikeFragmentDirections.actionLikeFragmentToLikeDetailFragment(item.id, isInternal = true)
                    it.findNavController().navigate(action)
                }
                cBLike.setOnClickListener {
                    item.like = 0
                    viewModel.deleteLike(item.id)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LikeProductViewHolder {
        return LikeProductViewHolder(
            ListItemProductBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: LikeProductViewHolder, position: Int) {
        val product = getItem(position)
        product?.let {
            holder.bind(it)
        }
    }


}


private class DiffCallback : DiffUtil.ItemCallback<Product>() {

    override fun getChangePayload(oldItem: Product, newItem: Product): Any? {
        return super.getChangePayload(oldItem, newItem)
    }

    override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem == newItem
    }
}


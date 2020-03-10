package com.gibeom.ofriendsmobile.home.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.gibeom.ofriendsmobile.databinding.ListItemProductBinding
import com.gibeom.ofriendsmobile.home.data.Product
import com.gibeom.ofriendsmobile.home.ui.HomeFragmentDirections
import com.gibeom.ofriendsmobile.home.ui.HomeViewModel
import javax.inject.Inject

class AwesomeRisingAdapter
@Inject constructor(private val viewModel: HomeViewModel) :
    ListAdapter<Product, AwesomeRisingAdapter.ViewHolder>(
        RisingLifeDiffCallback()) {
    class ViewHolder(private val binding: ListItemProductBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Product, viewModel: HomeViewModel) {
            binding.apply {
                product = item
                cBLike.setOnClickListener {
                    viewModel.likeAction(item, item.id)
                }
                root.setOnClickListener {
                    val action = HomeFragmentDirections.actionHomeFragmentToProductDetailFragment(
                        id = item.id,
                        isInternal = true
                    )
                    it.findNavController().navigate(action)
                }
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        return ViewHolder(
            ListItemProductBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val risingLife = getItem(position)
        risingLife?.let {
            holder.apply {
                bind(risingLife, viewModel)
            }
        }
    }

    private class RisingLifeDiffCallback : DiffUtil.ItemCallback<Product>() {
        override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem == newItem
        }
    }
}
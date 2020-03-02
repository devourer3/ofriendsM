package com.gibeom.ofriendsmobile.home.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.gibeom.ofriendsmobile.databinding.ListItemLifeCategoryBinding
import com.gibeom.ofriendsmobile.home.data.LifeCategory

class LifeCategoryAdapter(val viewModel: HomeViewModel) :
    ListAdapter<LifeCategory, LifeCategoryAdapter.ViewHolder>(DiffCallback()) {
    inner class ViewHolder(private val binding: ListItemLifeCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: LifeCategory, position: Int) {
            binding.apply {
                binding.hmVM = viewModel
                pos = position
                category = item
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ListItemLifeCategoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        getItem(position).let {
            holder.apply {
                bind(it, position)
            }
        }
    }
}

private class DiffCallback : DiffUtil.ItemCallback<LifeCategory>() {
    override fun areItemsTheSame(oldItem: LifeCategory, newItem: LifeCategory): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: LifeCategory, newItem: LifeCategory): Boolean {
        return oldItem.title == newItem.title
    }
}
package com.gibeom.ofriendsmobile.home.ui.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.gibeom.ofriendsmobile.databinding.ListItemCategoryBinding
import com.gibeom.ofriendsmobile.home.data.Category
import com.gibeom.ofriendsmobile.home.ui.HomeViewModel
import javax.inject.Inject

class CategoryAdapter
@Inject constructor(private val viewModel: HomeViewModel) :
    ListAdapter<Category, CategoryAdapter.ViewHolder>(CategoryDiffCallback()) {

    class ViewHolder(private val binding: ListItemCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Category, viewModel: HomeViewModel) {
            binding.apply {
                homeVM = viewModel
                category = item
                cLCatEntire.setBackgroundColor(Color.parseColor(item.background))
            }
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = getItem(position)
        category?.let {
            holder.bind(category, viewModel)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ListItemCategoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }
}

private class CategoryDiffCallback : DiffUtil.ItemCallback<Category>() {
    override fun areItemsTheSame(oldItem: Category, newItem: Category): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Category, newItem: Category): Boolean {
        return oldItem == newItem
    }
}
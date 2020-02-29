package com.gibeom.ofriendsmobile.home.ui

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.gibeom.ofriendsmobile.databinding.ListItemCategoryBinding
import com.gibeom.ofriendsmobile.home.data.Category

class CategoryAdapter: ListAdapter<Category, CategoryAdapter.ViewHolder>(CategoryDiffCallback()) {

    class ViewHolder(private val binding: ListItemCategoryBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(listener: View.OnClickListener, item: Category) {
            binding.apply {
                category = item
                cLCatEntire.setBackgroundColor(Color.parseColor(item.background))
            }
        }
    }

    override fun onBindViewHolder(holder: CategoryAdapter.ViewHolder, position: Int) {
        val category = getItem(position)
        category.let {
            holder.apply {
                bind(createOnClickListener(category.id), category)
            }
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

    private fun createOnClickListener(id: Int): View.OnClickListener {
        return View.OnClickListener {
//            val direction = CardItemCategoryBinding.
//            it.findNavController().navigate(direction)
        }
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
package com.gibeom.ofriendsmobile.home.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.gibeom.ofriendsmobile.databinding.ListItemRisingLifeBinding
import com.gibeom.ofriendsmobile.home.data.Category
import com.gibeom.ofriendsmobile.home.data.RisingLife

class RisingLifeAdapter : ListAdapter<RisingLife, RisingLifeAdapter.ViewHolder>(RisingLifeDiffCallback()) {

    class ViewHolder(private val binding: ListItemRisingLifeBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: RisingLife) {
            binding.apply {
                risingLife = item
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RisingLifeAdapter.ViewHolder {
        return ViewHolder(ListItemRisingLifeBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RisingLifeAdapter.ViewHolder, position: Int) {
        val risingLife = getItem(position)
        risingLife.let {
            holder.apply {
                bind(risingLife)
            }
        }
    }






}

private class RisingLifeDiffCallback : DiffUtil.ItemCallback<RisingLife>() {
    override fun areItemsTheSame(oldItem: RisingLife, newItem: RisingLife): Boolean {
        return oldItem.id == newItem.id
    }
    override fun areContentsTheSame(oldItem: RisingLife, newItem: RisingLife): Boolean {
        return oldItem == newItem
    }
}
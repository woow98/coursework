package com.example.coursework

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.coursework.model.Product

class FlowersItemDiffCallback : DiffUtil.ItemCallback<Product>() {
    override fun areItemsTheSame(
        oldItem: Product,
        newItem: Product
    ): Boolean = oldItem == newItem

    override fun areContentsTheSame(
        oldItem: Product,
        newItem: Product
    ): Boolean = oldItem == newItem

}

class FlowersAdapter() :
    ListAdapter<Product, RecyclerView.ViewHolder>(FlowersItemDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_view, parent, false)
        return FlowersViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as FlowersViewHolder).bind(getItem(position))
    }
}

class FlowersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(product: Product) {
        val title: TextView =itemView.findViewById(R.id.tvTitle)
        title.text = product.title
        val image: ImageView =itemView.findViewById(R.id.ivPhoto)
        //подгрузка фото из url
        Glide.with(itemView.context).load(product.photoURL).into(image)
    }
}

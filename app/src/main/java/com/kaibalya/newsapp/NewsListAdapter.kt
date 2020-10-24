package com.kaibalya.newsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsListAdapter(private val items: ArrayList<String>, private val listener: NewsItemClicked): RecyclerView.Adapter<NewViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_list, parent, false)
        val viewHolder = NewViewHolder(view)
        view.setOnClickListener {
            listener.onItemClicked(items[viewHolder.adapterPosition])
        }
        return viewHolder
    }

    override fun onBindViewHolder(holder: NewViewHolder, position: Int) {
        val currentView= items[position]
        holder.titleView.text = currentView

    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class NewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val titleView :TextView = itemView.findViewById(R.id.title)
}

interface NewsItemClicked{
    fun onItemClicked(item: String){

    }
}
package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Content_adapter1 (val  con: Context, val list2:ArrayList<content1>):RecyclerView.Adapter<Content_adapter1.Link>(){
    class Link(itemView: View): RecyclerView.ViewHolder(itemView){
        val im_di: ImageView =itemView.findViewById(R.id.imageView3)
        val text_di: TextView =itemView.findViewById(R.id.text7)
        val text_di1: TextView =itemView.findViewById(R.id.text8)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Link {
        val root = LayoutInflater.from(con).inflate(R.layout.sample1, parent, false)
        return Link(root)
    }
    override fun onBindViewHolder(holder: Link, position: Int) {
        holder.im_di.setImageResource(list2[position].imageId)
        holder.text_di.setText(list2[position].title)
        holder.text_di1.setText(list2[position].title1)
    }

    override fun getItemCount(): Int {
        return list2.size
    }
}


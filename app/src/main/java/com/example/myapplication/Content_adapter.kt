package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class Content_adapter (val  con: Context, val list2:ArrayList<content>):RecyclerView.Adapter<Content_adapter.Link>(){
    class Link(itemView: View): RecyclerView.ViewHolder(itemView){
        val im_di: ImageView =itemView.findViewById(R.id.imageView2)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Link {
        val root = LayoutInflater.from(con).inflate(R.layout.sample, parent, false)
        return Link(root)
    }
    override fun onBindViewHolder(holder: Link, position: Int) {
        holder.im_di.setImageResource(list2[position].imageId)

    }

    override fun getItemCount(): Int {
        return list2.size
    }
}


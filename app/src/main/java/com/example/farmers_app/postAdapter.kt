package com.example.farmers_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class postAdapter(val posts : List<post>) : Adapter<postAdapter.myViewholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewholder {
        var layout = LayoutInflater.from(parent.context)
        var view = layout.inflate(R.layout.post,parent,false)
        return myViewholder(view)
    }

    override fun getItemCount(): Int {
        return posts.size
    }

    override fun onBindViewHolder(holder: myViewholder, position: Int) {
      //  holder.img.setImageDrawable(R.drawable.userprofile)
        holder.Name.text = posts[position].name
        holder.userDesc.text = posts[position].userDesc
        holder.postDesc.text = posts[position].desc
        holder.postImg.setImageResource(posts[position].postImg)

    }

    class myViewholder(itemView: View) : ViewHolder(itemView){
         var img = itemView.findViewById<ImageView>(R.id.profilepic)
         var Name = itemView.findViewById<TextView>(R.id.name)
         var userDesc = itemView.findViewById<TextView>(R.id.userDesc)
         var postDesc = itemView.findViewById<TextView>(R.id.postdesc)
         var postImg = itemView.findViewById<ImageView>(R.id.postimg)

    }
}
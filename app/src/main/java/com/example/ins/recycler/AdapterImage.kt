package com.example.ins.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ins.R
import com.example.ins.fragment.HomeScreenFragment

class AdapterImage: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var posts: List<ModelImage> = ArrayList()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var pName: TextView = itemView.findViewById(R.id.userName)
        var pPic: ImageView = itemView.findViewById(R.id.imageProfile)
        var pPost: ImageView = itemView.findViewById(R.id.postImage)

        fun bind(pView: ModelImage) {
            pName.text = pView.username
            pPic.setImageResource(pView.user_pfp)
            pPost.setImageResource(pView.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_image, parent, false)
        )
    }


    override fun getItemCount(): Int {
        return posts.size
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        when (viewHolder) {
            is AdapterImage.ViewHolder -> {
                viewHolder.bind(posts[position])
            }
        }
    }

    fun pList(hList: List<ModelImage>) {
        posts = hList
    }
}
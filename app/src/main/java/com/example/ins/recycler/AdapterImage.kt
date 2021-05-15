package com.example.ins.recycler

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ins.R
import com.example.ins.fragment.HomeScreenFragment

class AdapterImage: RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private val pic = arrayOf(
        R.drawable.pfp01,
        R.drawable.pfp01,
        R.drawable.pfp01,
        R.drawable.pfp01,
        R.drawable.pfp01
    )

    private val name = arrayOf("landscape",
        "landscape",
        "landscape",
        "landscape",
        "landscape"
    )

    private val post = arrayOf(
        R.drawable.pfp01,
        R.drawable.pfp01,
        R.drawable.pfp01,
        R.drawable.pfp01,
        R.drawable.pfp01
    )

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var pPic: ImageView = itemView.findViewById(R.id.imageProfile)
        var pName: TextView = itemView.findViewById(R.id.userName)
        var pPost: ImageView = itemView.findViewById(R.id.postImage)

        init {

            itemView.setOnClickListener{
                var position: Int = adapterPosition
                val context = itemView.context
                val intent = Intent(context, HomeScreenFragment::class.java).apply{
                }
                context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.list_image, viewGroup, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return pic.size
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        viewHolder.itemView.imageProfile.setImageResource(pic[position])
        viewHolder.itemView.userName.text = name[position]
        viewHolder.itemView.postImage.setImageResource(post[position])
    }
}
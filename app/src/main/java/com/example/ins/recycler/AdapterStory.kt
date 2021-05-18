package com.example.ins.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ins.R

class AdapterStory : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var story: List<ModelStory> = ArrayList()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var sPic: ImageView = itemView.findViewById(R.id.imageStory)
        var sName: TextView = itemView.findViewById(R.id.nameStory)

        fun bind(sView: ModelStory) {
            sPic.setImageResource(sView.sPFP)
            sName.text = sView.sName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_story, parent, false)
        )
    }


    override fun getItemCount(): Int {
        return story.size
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, i: Int) {
        when (viewHolder) {
            is AdapterStory.ViewHolder -> {
                viewHolder.bind(story[i])
            }
        }
    }

    fun sList(storyList: List<ModelStory>) {
        story = storyList
    }
}
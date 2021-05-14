package com.example.ins.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ins.R

internal class AdapterMessage(private val messages: ArrayList<ModelMessage>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MessageViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_message, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = messages[position]
        holder.user_pfp = item.getUser()
        holder.username.text = item.getUsername()
        holder.last_activity.text = item.getActivity()
    }

    override fun getItemCount(): Int {
        return messages.size
    }

    internal inner class MessageViewHolder constructor(itemView: View): RecyclerView.ViewHolder(itemView){
        var pf: ImageView = itemView.findViewById(R.id.pfp)
        var name: TextView = itemView.findViewById(R.id.pfp_name)
        var activity: TextView = itemView.findViewById(R.id.pfp_time)
    }

}
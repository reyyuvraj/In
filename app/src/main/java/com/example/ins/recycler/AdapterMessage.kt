package com.example.ins.recycler


import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.ins.R

class AdapterMessage : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<ModelMessage> = ArrayList()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var pPic: ImageView = itemView.findViewById(R.id.pfp)
        var pName: TextView = itemView.findViewById(R.id.pfpName)
        var pActivity: TextView = itemView.findViewById(R.id.pfpTime)

        fun bind(dM: ModelMessage) {
            pPic.setImageResource(dM.userPFP)
            pName.text = dM.userName
            pActivity.text = dM.userActivity
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_message, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, i: Int) {
        when (viewHolder) {
            is ViewHolder -> {
                viewHolder.bind(items[i])
            }
        }
    }

    fun mList(dList: List<ModelMessage>) {
        items = dList
    }
}
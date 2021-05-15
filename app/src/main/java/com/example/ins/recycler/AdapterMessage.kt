package com.example.ins.recycler


import androidx.recyclerview.widget.RecyclerView
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.ins.R
import com.example.ins.fragment.MessageFragment

class AdapterMessage : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private val pic = arrayOf(R.drawable.pfp01,
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

    private val activity = arrayOf("Liked a message",
        "Liked a message",
        "Liked a message",
        "Liked a message",
        "Liked a message",
    )

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var pPic: ImageView = itemView.findViewById(R.id.pfp)
        var pName: TextView = itemView.findViewById(R.id.pfpName)
        var pActivity: TextView = itemView.findViewById(R.id.pfpTime)

        init {

            itemView.setOnClickListener{
                var position: Int = getAdapterPosition()
                val context = itemView.context
                val intent = Intent(context, MessageFragment::class.java).apply{
                }
                context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.list_message, viewGroup, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return pic.size
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, i: Int) {
        viewHolder.itemView.pfp.setImageResource(pic[i])
        viewHolder.itemView.pfpName.text = name[i]
        viewHolder.itemView.pfpTime.text = activity[i]
    }
}
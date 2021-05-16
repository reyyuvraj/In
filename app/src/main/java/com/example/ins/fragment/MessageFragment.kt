package com.example.ins.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ins.R
import com.example.ins.recycler.AdapterMessage
import com.example.ins.recycler.DataMessage

class MessageFragment : Fragment(){

    private lateinit var mAdapter: AdapterMessage

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View = inflater.inflate(R.layout.fragment_message, container, false)
        val messages : RecyclerView = view.findViewById(R.id.messages)
        messages.apply{
            layoutManager = LinearLayoutManager(context)
            mAdapter = AdapterMessage()
            adapter = mAdapter
        }
        val data = DataMessage.mMessages()
        mAdapter.mList(data)
        view.findViewById<ImageView>(R.id.back).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_messageFragment_to_homeScreenFragment) }
        return view
    }
}
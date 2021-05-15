package com.example.ins.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ins.R
import com.example.ins.recycler.AdapterMessage
import com.example.ins.recycler.DataMessage
import com.example.ins.recycler.ModelMessage

class MessageFragment : Fragment(){

    //private var layoutManager: RecyclerView.LayoutManager? = null
    private lateinit var mAdapter: AdapterMessage

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_message, container, false)
        val messages : RecyclerView = view.findViewById(R.id.messages)
        messages.apply{
            layoutManager = LinearLayoutManager(context)
            mAdapter = AdapterMessage()
            adapter = mAdapter
        }
        val data = DataMessage.mMessages()
        mAdapter.mList(data)
        view.findViewById<ImageButton>(R.id.back).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_messageFragment_to_homeScreenFragment) }
        return view
    }
}
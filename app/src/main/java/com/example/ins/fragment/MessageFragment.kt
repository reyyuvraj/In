package com.example.ins.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.ins.R
import com.example.ins.recycler.AdapterMessage
import com.example.ins.recycler.ModelMessage

class MessageFragment : Fragment(), View.OnClickListener {

    lateinit var navController: NavController
    private val messageList = ArrayList<ModelMessage>()
    private lateinit var messageAdapter: AdapterMessage

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_message, container, false)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        prepareMessageData()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.back).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.back -> requireActivity().onBackPressed()
        }
    }

    private fun prepareMessageData(){
        var message = ModelMessage(R.drawable.img1,"omar","Active 10h ago")
        messageList.add(message)
        message = ModelMessage(R.drawable.img1,"omar","Active 10h ago")
        messageList.add(message)
        message = ModelMessage(R.drawable.img1,"omar","Active 10h ago")
        messageList.add(message)
        message = ModelMessage(R.drawable.img1,"omar","Active 10h ago")
        messageList.add(message)
        message = ModelMessage(R.drawable.img1,"omar","Active 10h ago")
        messageList.add(message)
        message = ModelMessage(R.drawable.img1,"omar","Active 10h ago")
        messageList.add(message)
        message = ModelMessage(R.drawable.img1,"omar","Active 10h ago")
        messageList.add(message)
        message = ModelMessage(R.drawable.img1,"omar","Active 10h ago")
        messageList.add(message)
        message = ModelMessage(R.drawable.img1,"omar","Active 10h ago")
        messageList.add(message)
        message = ModelMessage(R.drawable.img1,"omar","Active 10h ago")
        messageList.add(message)
        message = ModelMessage(R.drawable.img1,"omar","Active 10h ago")
        messageList.add(message)
        message = ModelMessage(R.drawable.img1,"omar","Active 10h ago")
        messageList.add(message)
        message = ModelMessage(R.drawable.img1,"omar","Active 10h ago")
        messageList.add(message)
        message = ModelMessage(R.drawable.img1,"omar","Active 10h ago")
        messageList.add(message)
        message = ModelMessage(R.drawable.img1,"omar","Active 10h ago")
        messageList.add(message)
        message = ModelMessage(R.drawable.img1,"omar","Active 10h ago")
        messageList.add(message)
        messageAdapter.notifyDataSetChanged()
    }
}
package com.example.ins.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ins.R
import com.example.ins.recycler.AdapterImage
import com.example.ins.recycler.AdapterMessage
import com.example.ins.recycler.DataMessage
import com.example.ins.recycler.DataPost


class HomeScreenFragment : Fragment() {


    private lateinit var pAdapter: AdapterImage

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_home_screen, container, false)
        val messages: RecyclerView = view.findViewById(R.id.imageList)
        messages.apply {
            layoutManager = LinearLayoutManager(context)
            pAdapter = AdapterImage()
            adapter = pAdapter
        }
        val data = DataPost.pPost()
        pAdapter.pList(data)
        view.findViewById<ImageButton>(R.id.inbox).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeScreenFragment_to_messageFragment) }
        return view
    }
}
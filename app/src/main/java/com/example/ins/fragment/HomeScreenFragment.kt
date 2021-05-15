package com.example.ins.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ins.R
import com.example.ins.recycler.AdapterImage
import com.example.ins.recycler.AdapterMessage


class HomeScreenFragment : Fragment(), View.OnClickListener {

    private lateinit var navController: NavController
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<AdapterMessage.ViewHolder>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageList.apply{
        layoutManager = LinearLayoutManager(activity)
        adapter = AdapterImage()}
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.inbox).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.inbox -> navController!!.navigate(R.id.action_homeScreenFragment_to_messageFragment)
        }
    }
}
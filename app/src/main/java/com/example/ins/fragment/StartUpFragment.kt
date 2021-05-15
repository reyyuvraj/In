package com.example.ins.fragment

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.ins.R


class StartUpFragment : Fragment() {

    private lateinit var mHandler: Handler
    private lateinit var mRunnable: Runnable

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        startMainActivity()
    }

    private fun startMainActivity() {

        mRunnable = Runnable {
            findNavController().navigate(R.id.action_startUpFragment_to_homeScreenFragment)
        }

        mHandler = Handler()

        mHandler.postDelayed(mRunnable, 2000)
    }

    override fun onStop() {
        super.onStop()
        mHandler.removeCallbacks(mRunnable)
    }
}
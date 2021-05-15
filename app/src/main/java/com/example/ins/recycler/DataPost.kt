package com.example.ins.recycler

import com.example.ins.R

class DataPost {

    companion object {

        fun pPost(): ArrayList<ModelImage> {

            val pList = ArrayList<ModelImage>()
            pList.add(
                ModelImage(
                    "rar",
                    R.drawable.pfp01,
                    R.drawable.post01
                )
            )
            pList.add(
                ModelImage(
                    "rar",
                    R.drawable.pfp01,
                    R.drawable.post01
                )
            )
            pList.add(
                ModelImage(
                    "rar",
                    R.drawable.pfp01,
                    R.drawable.post01
                )
            )
            return pList
        }
    }
}
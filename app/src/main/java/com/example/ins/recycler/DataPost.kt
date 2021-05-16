package com.example.ins.recycler

import com.example.ins.R

class DataPost {

    companion object {

        fun pPost(): ArrayList<ModelImage> {

            val pList = ArrayList<ModelImage>()
            pList.add(
                ModelImage(
                    "Debby",
                    R.drawable.pfp03,
                    R.drawable.post07)
            )
            pList.add(
                ModelImage(
                    "omar",
                    R.drawable.pfp04,
                    R.drawable.post02)
            )
            pList.add(
                ModelImage(
                    "cage",
                    R.drawable.pfp06,
                    R.drawable.post01)
            )
            pList.add(
                ModelImage(
                    "zor",
                    R.drawable.pfp08,
                    R.drawable.post08)
            )
            pList.add(
                ModelImage(
                    "Mask Behind A Mask",
                    R.drawable.pfp02,
                    R.drawable.post03)
            )
            pList.add(
                ModelImage(
                    "Jen",
                    R.drawable.pfp09,
                    R.drawable.img1)
            )
            pList.add(
                ModelImage(
                    "Re",
                    R.drawable.pfp07,
                    R.drawable.pfp07)
            )
            return pList
        }
    }
}
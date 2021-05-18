package com.example.ins.recycler

import com.example.ins.R

class DataStory {

    companion object{

        fun sStory(): ArrayList<ModelStory>{

            val sList = ArrayList<ModelStory>()
            sList.add(
                ModelStory(
                    R.drawable.pfp09,
                "Jen")
            )
            sList.add(
                ModelStory(
                    R.drawable.pfp08,
                "zor")
            )
            sList.add(
                ModelStory(
                    R.drawable.pfp07,
                "Re")
            )
            sList.add(
                ModelStory(
                    R.drawable.pfp06,
                "cage")
            )
            sList.add(
                ModelStory(
                    R.drawable.pfp05,
                "jess")
            )
            sList.add(
                ModelStory(
                    R.drawable.pfp04,
                "omar")
            )
            sList.add(
                ModelStory(
                    R.drawable.pfp03,
                "Debby")
            )
            sList.add(
                ModelStory(
                    R.drawable.pfp02,
                "Mask")
            )
            sList.add(
                ModelStory(
                    R.drawable.pfp01,
                "hugh")
            )
            return sList
        }
    }
}
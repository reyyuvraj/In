package com.example.ins.recycler

import com.example.ins.R

class DataMessage {

    companion object {

        fun mMessages(): ArrayList<ModelMessage> {
            val mList = ArrayList<ModelMessage>()
            mList.add(
                ModelMessage(
                    R.drawable.pfp08,
                    "zor",
                    "liked a message")
            )
            mList.add(
                ModelMessage(
                    R.drawable.pfp02,
                    "Mask Behind A Mask",
                    "sent a GIF")
            )
            mList.add(
                ModelMessage(
                    R.drawable.pfp03,
                    "Debby",
                    "seen")
            )
            mList.add(
                ModelMessage(
                    R.drawable.pfp04,
                    "omar",
                    "sent a story")
            )
            mList.add(
                ModelMessage(
                    R.drawable.pfp05,
                    "user",
                    "liked a message")
            )
            mList.add(
                ModelMessage(
                    R.drawable.pfp06,
                    "cage",
                    "shared a link")
            )
            mList.add(
                    ModelMessage(
                        R.drawable.pfp07,
                        "Re",
                        "Alright")
                    )
            mList.add(
                ModelMessage(
                    R.drawable.pfp01,
                    "hugh",
                    "Mentioned you in a story")
            )
            mList.add(
                ModelMessage(
                    R.drawable.pfp09,
                    "Jen",
                    "Reacted to your story")
            )
            return mList
        }
    }
}
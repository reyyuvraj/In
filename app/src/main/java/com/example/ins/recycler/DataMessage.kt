package com.example.ins.recycler

import com.example.ins.R

class DataMessage {

    companion object {

        fun mMessages(): ArrayList<ModelMessage> {
            val mList = ArrayList<ModelMessage>()
            mList.add(
                ModelMessage(
                    R.drawable.pfp01,
                    "vin",
                    "liked a message"
                )
            )
            mList.add(
                ModelMessage(
                    R.drawable.pfp01,
                    "vin",
                    "liked a message"
                )
            )
            mList.add(
                ModelMessage(
                    R.drawable.pfp01,
                    "vin",
                    "liked a message"
                )
            )
            return mList
        }
    }
}
package com.example.ins.recycler

class ModelMessage (user_pfp: Int?, username: String?, last_activity: String?){
    private var user_pfp: Int
    private var username: String
    private var last_activity: String
    init {
        this.user_pfp = user_pfp!!
        this.username = username!!
        this.last_activity = last_activity!!
    }
    fun getUser() : Int?{
        return user_pfp
    }
    fun setUser(pfp : Int?){
        user_pfp = pfp!!
    }
    fun getUsername(): String? {
        return username
    }
    fun setUsername(name: String?) {
        this.username = name!!
    }
    fun getActivity(): String? {
        return last_activity
    }
    fun setActivity(active: String?) {
        this.last_activity = active!!
    }
}
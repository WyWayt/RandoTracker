package com.example.randotracker.data

import android.net.Uri

data class Trackable(val name: String, val drawable: Int, val progressives: Array<Int>?, val mode: TrackableMode, val configurable: Boolean){
    private var counter = 0
    fun getNextProgressive(): Int{
        progressives!!.also {item ->
            if(counter < item.size) return(item[counter++]) else return(item[item.size-1])
        }
    }
}
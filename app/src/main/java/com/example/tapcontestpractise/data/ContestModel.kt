package com.example.tapcontestpractise.data

import android.content.ClipDescription
import android.content.Context
import android.view.View
import com.example.tapcontestpractise.R
import com.example.tapcontestpractise.ui.OnContestClickedListener
import java.util.*

class ContestModel(
    val id: Int,
    val title: String,
    val smallDescription: String,
    val isParticipated: Int,
    val longDescription: String,
    val startDate: Int,
    val endDate: Int
) : CustomViewModel() {

    /*constructor(appContext: Context,
                contestModel: ContestModel) : this() {
    }*/


    lateinit var listener: OnContestClickedListener
    override val layoutIdentifier: Int
        get() = R.layout.row_details

//    fun setOnContestClickListener(listener: OnContestClickedListener) {
//        this.listener = listener
//    }
//
//    fun onClickView(view: View) {
//        this.listener.onContestClicked(this)
//    }
}
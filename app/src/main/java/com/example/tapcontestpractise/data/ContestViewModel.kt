package com.example.tapcontestpractise.data

import android.content.Context
import android.database.Observable
import android.graphics.drawable.Drawable
import android.util.Log.d
import android.view.View
import androidx.databinding.ObservableField
import com.example.tapcontestpractise.R
import com.example.tapcontestpractise.ui.OnContestClickedListener

@Suppress("DEPRECATION")
class ContestViewModel(
    val appContext: Context,
    val contestModel: ContestModel) : CustomViewModel(){

    val btnParticipate = ObservableField<String>()
    val btnParticipateBackground = ObservableField<Drawable>()
    private val TAG = "ContestViewModel"


    init {
        d(TAG,"${contestModel.smallDescription}")
        if(contestModel.isParticipated == 1) {
            d("isParticipate Value","${contestModel.isParticipated}")
            btnParticipate.set("Participated")
            btnParticipateBackground.set(appContext.resources.getDrawable(R.color.colorPrimaryDark))
            d(TAG,"$btnParticipate")
        } else {
            btnParticipate.set("Participate")
            btnParticipateBackground.set(appContext.resources.getDrawable(R.color.colorAccent))
        }
    }

    override val layoutIdentifier: Int
        get() = R.layout.row_details

    lateinit var listener: OnContestClickedListener

    fun setOnContestClickListener(listener: OnContestClickedListener) {
        this.listener = listener
    }

    fun onClickView(view: View) {
        this.listener.onContestClicked(this)
    }
}
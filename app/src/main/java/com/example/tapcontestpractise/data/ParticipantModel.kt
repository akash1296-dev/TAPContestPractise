package com.example.tapcontestpractise.data

import com.example.tapcontestpractise.R

data class ParticipantModel(
    val id: Int,
    val name: String,
    val emailId: String,
    val mobNo: Int
) : CustomViewModel() {
    override val layoutIdentifier: Int
        get() = R.layout.row_paricipant_details

}
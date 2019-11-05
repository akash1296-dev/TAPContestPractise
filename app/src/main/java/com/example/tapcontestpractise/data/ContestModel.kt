package com.example.tapcontestpractise.data

import com.example.tapcontestpractise.R

class ContestModel(
    val id: Int,
    val title: String,
    val smallDescription: String
) : CustomViewModel() {
    override val layoutIdentifier: Int
        get() = R.layout.row_details
}
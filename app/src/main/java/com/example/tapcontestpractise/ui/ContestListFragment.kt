package com.example.tapcontestpractise.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tapcontestpractise.R
import com.example.tapcontestpractise.data.DataSource
import com.example.tapcontestpractise.ui.ui.CustomAdapter
import kotlinx.android.synthetic.main.fragment_contest_list.*


class ContestListFragment : Fragment() {

    private val TAG = "ContestListFragment"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_contest_list,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        DataSource.createList()

        rv_list.layoutManager = LinearLayoutManager(context)
        rv_list.adapter = CustomAdapter(DataSource.getContestList())
    }
}

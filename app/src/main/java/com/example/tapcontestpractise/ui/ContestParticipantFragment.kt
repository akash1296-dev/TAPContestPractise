package com.example.tapcontestpractise.ui


import android.os.Bundle
import android.util.Log.d
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tapcontestpractise.R
import com.example.tapcontestpractise.data.CustomViewModel
import com.example.tapcontestpractise.data.DataSource
import com.example.tapcontestpractise.ui.ui.CustomAdapter
import kotlinx.android.synthetic.main.fragment_contest_list.*

/**
 * A simple [Fragment] subclass.
 */
class ContestParticipantFragment : Fragment() {

    private val TAG = "ContestParticipant"
    private var arrayList = mutableListOf<CustomViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        d(TAG,"onCreateView")

        return inflater.inflate(R.layout.fragment_contest_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        DataSource.createParticipantList()
        DataSource.createList()
        d(TAG,"onViewCreated")
        rv_list.layoutManager = LinearLayoutManager(context)
        arrayList.addAll(DataSource.getParticipantList())
        arrayList.addAll(DataSource.getContestList())

        rv_list.adapter = CustomAdapter(arrayList)
    }


}

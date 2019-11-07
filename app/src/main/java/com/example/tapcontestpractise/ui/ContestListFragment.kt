package com.example.tapcontestpractise.ui

import android.os.Bundle
import android.util.Log.d
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tapcontestpractise.R
import com.example.tapcontestpractise.data.ContestModel
import com.example.tapcontestpractise.data.ContestViewModel
import com.example.tapcontestpractise.data.DataSource
import com.example.tapcontestpractise.ui.ui.CustomAdapter
import kotlinx.android.synthetic.main.fragment_contest_list.*


class ContestListFragment : Fragment() {

    private val TAG = "ContestListFragment"
    lateinit var contestViewModel: ContestViewModel

    var listContestViewModel = ArrayList<ContestViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DataSource.createList()
        val contestActivity = context as MainActivity

        for (i in DataSource.getContestList()) {
            contestViewModel = ContestViewModel(requireContext().applicationContext, i)
            contestViewModel.setOnContestClickListener(contestActivity)
            d(TAG, "${i.smallDescription}")
            listContestViewModel.add(contestViewModel)
            //rv_list.adapter = CustomAdapter(listContestViewModel)
        }
    }

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            d(TAG, "onCreateView")

            return inflater.inflate(R.layout.fragment_contest_list, container, false)
        }

        /*override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        d(TAG,"onViewCreated")

        DataSource.createList()
        val contestActivity = context as MainActivity
        rv_list.layoutManager = LinearLayoutManager(context)

        for( i in DataSource.getContestList()) {
            val contestViewModel = ContestViewModel(requireContext().applicationContext, i)
            contestViewModel.setOnContestClickListener(contestActivity)
            d(TAG, "${i.smallDescription}")
            listContestViewModel.add(contestViewModel)
            rv_list.adapter = CustomAdapter(listContestViewModel)

        }
    }*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_list.layoutManager = LinearLayoutManager(context)
        rv_list.adapter = CustomAdapter(listContestViewModel)
    }
}

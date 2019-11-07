package com.example.tapcontestpractise.ui

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.Log.d
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.tapcontestpractise.BR
import com.example.tapcontestpractise.R
import com.example.tapcontestpractise.data.ContestModel
import com.example.tapcontestpractise.data.ContestViewModel
import com.example.tapcontestpractise.data.DataSource
import com.example.tapcontestpractise.ui.ui.CustomAdapter
import kotlinx.android.synthetic.main.fragment_contest_detail.*
import kotlinx.android.synthetic.main.fragment_contest_list.*
import kotlinx.android.synthetic.main.row_details.*


class ContestDetailFragment : Fragment() {

    private val TAG = "ContestDetailFragment"
    private var CONTEST_ID : Int = 0
    var listContestViewModel = ArrayList<ContestViewModel>()
    lateinit var contestViewModel: ContestViewModel
    lateinit var bind: ViewDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CONTEST_ID = arguments!!.getInt("CONTEST_ID")
        d("contestID is:","$CONTEST_ID")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        d(TAG,"onCreateView")
        bind = DataBindingUtil.inflate<ViewDataBinding>(inflater,R.layout.fragment_contest_detail,container,false)
        //bind.setVariable(BR.group,contestViewModel.contestModel)
        //bind.executePendingBindings()
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        d(TAG,"onViewCreated")
        d("onCreateView","$CONTEST_ID")
        loadData(CONTEST_ID)

    }

    private fun loadData(contestId: Int) {
        val listContest = DataSource.getContestList()

        for(i in listContest) {
            if(i.id == contestId) {
                contestViewModel = ContestViewModel(requireContext().applicationContext, i)
//                listContestViewModel.add(contestViewModel)
//                d(TAG,"${contestViewModel.contestModel.endDate}")
                break
                //rv_list.adapter = CustomAdapter(listContestViewModel)
            }
        }
        bind.setVariable(BR.group, contestViewModel)
        bind.executePendingBindings()
        //updateUI(contestViewModel)
    }

}

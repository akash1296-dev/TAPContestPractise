package com.example.tapcontestpractise.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import com.example.tapcontestpractise.R
import com.example.tapcontestpractise.data.ContestViewModel
import com.example.tapcontestpractise.data.CustomViewModel

class MainActivity : AppCompatActivity(), OnContestClickedListener {

    private val CONTEST_ID = 0

    val fragment = ContestListFragment()

     lateinit var contestViewModel : ContestViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(CONTEST_ID == 0) {
            setupListFragment()
        } else {
            //setupContestDetailFragment()
        }
    }

    private fun setupListFragment() {

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.main_activity,fragment)
        fragmentTransaction.commit()
    }

    private fun setupContestDetailFragment(id: Int) {
        val fragment = ContestDetailFragment()
        val bundle = Bundle()
        bundle.putInt("CONTEST_ID",id)
        fragment.arguments = bundle
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.main_activity,fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    override fun onContestClicked(contestViewModel: ContestViewModel) {
        this.contestViewModel = contestViewModel
//        val openUrl = Intent(Intent.ACTION_VIEW)
//        openUrl.data = Uri.parse("https://www.google.co.in")
//        startActivity(openUrl)
        d("tap id:","${contestViewModel.contestModel.id}")

        setupContestDetailFragment(contestViewModel.contestModel.id)
    }




}

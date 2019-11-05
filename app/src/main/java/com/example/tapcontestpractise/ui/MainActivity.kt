package com.example.tapcontestpractise.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tapcontestpractise.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupListFragment()
    }

    private fun setupListFragment() {
        val fragment = ContestParticipantFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.main_activity,fragment)
        fragmentTransaction.commit()
    }
}

package com.example.nexisapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.nexisapp.databinding.ActivityMainNexisBinding

class NexisMainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainNexisBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_nexis)

        // Initializing the function
        initView()
    }

    private fun initView() {
        // change toolbar title
        binding.toolbar.toolbarTitle.text = "Nexis"
    }
}
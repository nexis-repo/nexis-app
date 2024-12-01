package com.example.nexisapp.auth.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.nexisapp.R
import com.example.nexisapp.databinding.ActivityAddUserInfoBinding

class AddUserInfoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddUserInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_user_info)

        initView()
    }

    private fun initView() {
        binding.toolbar.toolbarTitle.text = "Add user Details"


    }
}
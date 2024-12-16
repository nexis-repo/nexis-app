package com.a3.nexisapp.auth.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.a3.nexisapp.R
import com.a3.nexisapp.databinding.ActivityAddUserInfoBinding

class AddUserInfoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddUserInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_user_info)

        initView()
    }

    private fun initView() {
        binding.toolbar.toolbarTitle.text = "Add user Details"

        binding.toolbar.saveActionBtn.isEnabled = true
        binding.toolbar.saveActionBtn.setOnClickListener {
            openAddPass()
        }
    }

    private fun openAddPass() {
        val intent = Intent(this, AddPasswordActivity::class.java)
        startActivity(intent)
    }
}
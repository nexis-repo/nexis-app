package com.example.nexisapp.auth.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.nexisapp.NexisMainActivity
import com.example.nexisapp.R
import com.example.nexisapp.databinding.ActivityAddPasswordBinding

class AddPasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_password)

        initView()
    }

    private fun initView() {
        // change toolbar title
        binding.toolbar.toolbarTitle.text = "Add password"

        binding.toolbar.saveActionBtn.isEnabled = true
        binding.toolbar.saveActionBtn.setOnClickListener {
            openHome()
        }
    }

    private fun openHome() {
        val intent = Intent(this, NexisMainActivity::class.java)
        startActivity(intent)
    }
}
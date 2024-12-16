package com.a3.nexisapp.auth.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.a3.nexisapp.R
import com.a3.nexisapp.databinding.ActivityNxsSignupBinding


class SignupNxsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNxsSignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_nxs_signup)

        initView()
    }

    private fun initView() {

        binding.title.text = "Sign up With"

        // Google Signup btn
        binding.signUpWithGoogle.setOnClickListener {
            // Google Sign up
        }

        // Facebook Signup btn
        binding.signUpWithFacebook.setOnClickListener {
            // Facebook Sign up
        }

        // Email Signup btn
        binding.signUpWithEmail.setOnClickListener {
            // Email Sign up
            val intentAddData = Intent(this, AddUserInfoActivity::class.java)
            startActivity(intentAddData)

        }
    }
}
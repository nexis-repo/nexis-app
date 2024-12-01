package com.example.nexisapp.auth.welcome_pages

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import com.example.nexisapp.NexisMainActivity
import com.example.nexisapp.auth.login.SignupNxsActivity
import com.example.nexisapp.R
import com.google.android.material.bottomsheet.BottomSheetDialog


class WelcomeAuthSelectionBottomSheet(
    private val title: String,
    private val activity: Activity
) : BottomSheetDialog(activity, R.style.NxsCustomDialogStyle) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.welcom_auth_selection_bottom_sheet)
        this.setCanceledOnTouchOutside(true);

        val titleTv = findViewById<TextView>(R.id.title)
        val authBtn = findViewById<TextView>(R.id.signUpBtn)
        val readNews = findViewById<TextView>(R.id.readNewsBtn)

        titleTv?.text = title
        // For Authenticate the user
        authBtn?.setOnClickListener {
            val intentLogin = Intent(activity, SignupNxsActivity::class.java)
            intentLogin.putExtra("VIA", "This is From Welcome Page")
            activity.startActivity(intentLogin)
            dismiss()
        }

        // Read news Btn direct to homeScreen
        readNews?.setOnClickListener {
            val intentLogin = Intent(activity, NexisMainActivity::class.java)
            intentLogin.putExtra("VIA", "This is From Welcome Page")
            activity.startActivity(intentLogin)
            dismiss()
        }
    }


}
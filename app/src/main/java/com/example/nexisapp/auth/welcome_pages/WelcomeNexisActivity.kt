package com.example.nexisapp.auth.welcome_pages

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.nexisapp.R
import com.example.nexisapp.databinding.ActivityNexisWelcomeBinding
import com.facebook.shimmer.Shimmer

class WelcomeNexisActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNexisWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_nexis_welcome)

        initView()
    }

    private fun initView() {

        binding.welcomeInfo.text = "where news meets clarity.\nStay informed, stay engaged, \n " +
                "and explore the stories \n that shape our world."

        binding.welcome.text = "Welcome"

        binding.getStartedBtn.setOnClickListener {
            openWelcomeBottomSheet()
        }
        // Added Shimmer effect
        shimmerEffectOnGetStarted()
    }

    private fun shimmerEffectOnGetStarted() {

        var shimmerCount = 0  // Counter to track how many times shimmer has run
        val maxShimmerRuns = 5 // Max count for the shimmer effect to take place
        val shimmerContainer = binding.shimmerLayout
        val shimmer = Shimmer.AlphaHighlightBuilder()
            .setDuration(1000L)
            .setBaseAlpha(1f)
            .setHighlightAlpha(0.5f)
            .build()
        shimmerContainer.setShimmer(shimmer)
        val handler = Handler(Looper.getMainLooper())
        val shimmerRunnable = object : Runnable {
            override fun run() {
                if (shimmerCount < maxShimmerRuns) {
                    shimmerContainer.startShimmer()
                    shimmerCount++
                    handler.postDelayed({
                        shimmerContainer.stopShimmer()
                    }, 1000L)
                    handler.postDelayed(this, 2000L)
                } else {
                    shimmerContainer.stopShimmer()
                    shimmerContainer.hideShimmer()
                }
            }
        }
        handler.post(shimmerRunnable)
    }

    private fun openWelcomeBottomSheet() {
        WelcomeAuthSelectionBottomSheet("Choose Your Option", this).show()

    }
}
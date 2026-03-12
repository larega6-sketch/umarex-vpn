package com.umarex.vpn.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.umarex.vpn.R

class SubscriptionScreen : AppCompatActivity() {
    private lateinit var subscriptionInfoTextView: TextView
    private lateinit var expirationDateTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subscription_screen)

        subscriptionInfoTextView = findViewById(R.id.subscription_info_text)
        expirationDateTextView = findViewById(R.id.expiration_date_text)

        displaySubscriptionInfo()
    }

    private fun displaySubscriptionInfo() {
        // Dummy data for now
        val subscriptionInfo = "Premium Subscription"
        val expirationDate = "2026-12-01" // Example expiration date

        subscriptionInfoTextView.text = subscriptionInfo
        expirationDateTextView.text = "Expires on: $expirationDate"
    }
}
package com.umarex.vpn.subscription

import java.net.HttpURLConnection
import java.net.URL

class SubscriptionManager {
    fun fetchSubscriptions(): List<String> {
        val url = "http://umarex-vpn.online:2096/sub/f12562509ab44c3e"
        val connection = URL(url).openConnection() as HttpURLConnection
        connection.requestMethod = "GET"

        return if (connection.responseCode == 200) {
            connection.inputStream.bufferedReader().use { it.readLines() }
        } else {
            emptyList() // Handle error appropriately in a real application.
        }
    }
}
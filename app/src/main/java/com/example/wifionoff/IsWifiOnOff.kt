package com.example.wifionoff

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.wifi.WifiManager
import android.util.Log

class IsWifiOnOff : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent == null ) return
        if ( intent.action != WifiManager.WIFI_STATE_CHANGED_ACTION) return

        val wifiState = intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE, WifiManager.WIFI_STATE_UNKNOWN)

        when (wifiState) {
            WifiManager.WIFI_STATE_ENABLING -> {
                Log.d("****", "Wi-Fi is enabling")
            }
            WifiManager.WIFI_STATE_DISABLED -> {
                Log.d("****", "Wi-Fi is disabled")
            }
        }
    }
}

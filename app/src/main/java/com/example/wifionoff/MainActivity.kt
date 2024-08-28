package com.example.wifionoff

import android.content.IntentFilter
import android.net.wifi.WifiManager
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var isWifiOnOff: IsWifiOnOff

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        isWifiOnOff = IsWifiOnOff()

        val intentFilter = IntentFilter(WifiManager.WIFI_STATE_CHANGED_ACTION)
        registerReceiver(isWifiOnOff, intentFilter)
    }
    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(isWifiOnOff)
    }
}
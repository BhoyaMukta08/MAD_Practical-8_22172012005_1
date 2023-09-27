package com.example.mad_practical_8_22172012005

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmBroadcastReceiver : BroadcastReceiver() {
    companion object{
        val ALARMKEY = "KEY"
        val ALARMSTART = "START"
        val ALARAMSTOP = "STOP"
    }
    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        TODO("AlarmBroadcastReceiver.onReceive() is not implemented")
    }
}
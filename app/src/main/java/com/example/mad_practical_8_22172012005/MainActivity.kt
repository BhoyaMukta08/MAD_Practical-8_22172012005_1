package com.example.mad_practical_8_22172012005

import android.app.AlarmManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun SetAlaram(militime long: Long,){
        val intentalarm = Intent(applicationContext,AlarmBroadcastReceiver::class.java)
        intentalarm.putExtra(AlarmBroadcastReceiver.ALARMKEY,)
        val pandingintent = PandingIntent(applicationContext,)
        val manager= getSystemService(ALARM_SERVICE) as AlarmManager
        if (){
            manager.setExact(AlarmManager.RTC_WAKEUP,militime,pandingintent)
        }
        else{
            manager.cancel(pandingintent)
            sendBroadcast(intentalarm)
        }
    }
}
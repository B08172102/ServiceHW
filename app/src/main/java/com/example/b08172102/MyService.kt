package com.example.b08172102

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MyService :Service(){
    private var startMode:Int = 0
    private val mIBinder: IBinder? = null
    private lateinit var player: MediaPlayer
    override fun onCreate() {
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        player= MediaPlayer.create(this,R.raw.song)

        player.isLooping = true
        player.start()

        return Service.START_STICKY
    }
    override fun onBind(intent: Intent?): IBinder? {
        return mIBinder
    }
    override fun onDestroy() {
        super.onDestroy()
        player.stop()
    }
}
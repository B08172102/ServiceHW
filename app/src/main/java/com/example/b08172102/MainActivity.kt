package com.example.b08172102

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var startBtn: Button
    private lateinit var stopBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startBtn = findViewById(R.id.startButton);

        stopBtn = findViewById(R.id.stopButton);


        startBtn.setOnClickListener(this);
        stopBtn.setOnClickListener(this);
    }

    override fun onClick(v: View?) {
        if(v===startBtn){

            startService(Intent(this,MyService::class.java))
        }else{

            stopService(Intent(this,MyService::class.java))
        }
    }
}
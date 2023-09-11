package com.example.mad_practical_6_20012011082

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playbtn=findViewById<FloatingActionButton>(R.id.floatingActionButton3)
        val stopbtn=findViewById<FloatingActionButton>(R.id.floatingActionButton4)

        playbtn.setOnClickListener(){
            play()
        }

        stopbtn.setOnClickListener(){
            stop()
        }
    }

    fun play(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply {
            startService(this)
        }
    }

    fun stop(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply {
            stopService(this)
        }
    }
}
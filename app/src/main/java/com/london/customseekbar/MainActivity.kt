package com.london.customseekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatSeekBar
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val seekBar = findViewById<AppCompatSeekBar>(R.id.seekBar)
        var totalCompleted = 0

        timer(initialDelay = 0L, period = 1000L){
            if (totalCompleted == 90)
                cancel()

            totalCompleted += 10
            seekBar.progress = totalCompleted
        }
    }
}
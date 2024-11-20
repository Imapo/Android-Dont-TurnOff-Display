package com.example.dontturnoff

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Context
import android.view.WindowManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Запретить выключение дисплея
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
    }
}

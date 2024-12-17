package com.example.app_MiViaje

import android.content.Intent
import android.os.Build.VERSION_CODES.R
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnAnimacion).setOnClickListener {
            startActivity(Intent(this, AnimacionActivity::class.java))
        }

        findViewById<Button>(R.id.btnVideo).setOnClickListener {
            startActivity(Intent(this, VideoActivity::class.java))
        }

        findViewById<Button>(R.id.btnConductores).setOnClickListener {
            startActivity(Intent(this, ConductoresActivity::class.java))
        }

        findViewById<Button>(R.id.btnCamara).setOnClickListener {
            startActivity(Intent(this, CamaraActivity::class.java))
        }

        findViewById<Button>(R.id.btnGrafico).setOnClickListener {
            startActivity(Intent(this, GraficoActivity::class.java))
        }
    }
}

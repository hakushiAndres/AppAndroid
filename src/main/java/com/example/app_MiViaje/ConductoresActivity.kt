package com.example.app_MiViaje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ConductoresActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conductores)

        val conductores = listOf(
            Conductor("Juan Pérez", R.drawable.juan),
            Conductor("María Gómez", R.drawable.maria),
            Conductor("Carlos López", R.drawable.carlos),
            Conductor("Ana Torres", R.drawable.ana),
            Conductor("Luis Martínez", R.drawable.luis),
            Conductor("Sofía Hernández", R.drawable.sofia)
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ConductorAdapter(conductores)
    }
}
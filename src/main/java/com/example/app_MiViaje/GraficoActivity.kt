package com.example.app_MiViaje


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry

class GraficoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grafico)

        val barChart = findViewById<BarChart>(R.id.barChart)
        val entries = listOf(
            BarEntry(1f, 50f),
            BarEntry(2f, 70f),
            BarEntry(3f, 30f),
            BarEntry(4f, 90f),
            BarEntry(5f, 20f),
        )

        val dataSet = BarDataSet(entries, "Viajes por Conductor")
        val data = BarData(dataSet)

        barChart.data = data
        barChart.invalidate()
    }
}

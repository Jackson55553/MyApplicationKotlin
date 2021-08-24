package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.repozitory.RepositorySingle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val recyclerWeather = findViewById<RecyclerView>(R.id.resyclerWeather)
        val adapter = WeatherAdapter(RepositorySingle)
        recyclerWeather.adapter= adapter
    }
}
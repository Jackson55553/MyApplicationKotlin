package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.repozitory.RepositorySingle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerWeather = findViewById<RecyclerView>(R.id.resyclerWeather)
        val adapter = WeatherAdapter(RepositorySingle)
        recyclerWeather.adapter = adapter

        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener { Toast.makeText(this, "кнопка", Toast.LENGTH_SHORT).show() }
    }
}
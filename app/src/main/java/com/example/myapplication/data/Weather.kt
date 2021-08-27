package com.example.myapplication.data

data class Weather(var town: String = "my town", var temperature: Int = 10) {

    constructor(town: String, temperature: Int, pressure: Int) : this(town, temperature) {
        this.pressure = pressure
    }

    constructor(humidinty: Int) : this() {}

    var pressure: Int = 0
}
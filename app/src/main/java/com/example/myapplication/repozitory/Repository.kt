package com.example.myapplication.repozitory

import com.example.myapplication.data.Weather

open class Repository : IRepository {
    private val weathers: List<Weather> = listOf(
        Weather("Moscow", 25),
        Weather("Voronej", 5)
    )

    override fun getWeathers(): List<Weather> {
        return weathers
    }
}

interface IRepository {
    fun getWeathers(): List<Weather>
}

object RepositorySingle : IRepository {
    private val weathers: List<Weather> = listOf(
        Weather("town", 25),
        Weather("superTown", 5),
        Weather("Moscow", 25),
        Weather("Voronej", 5)
    )

    override fun getWeathers(): List<Weather> {
        return weathers
    }

    fun size() = weathers.size
}

inline fun getRepository(): IRepository {
    return Repository()
}
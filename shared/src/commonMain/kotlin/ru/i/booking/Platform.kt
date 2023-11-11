package ru.i.booking

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
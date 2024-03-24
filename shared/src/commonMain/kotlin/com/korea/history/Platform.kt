package com.korea.history

interface Platform {
    val name: String
}

expect fun getPlatformName(): String
package com.korea.history

class AndroidPlatform: Platform {
    override val name: String = "Android"
}

actual fun getPlatformName(): String = AndroidPlatform().name
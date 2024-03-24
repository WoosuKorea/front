package com.korea.history

class IOSPlatform: Platform {
    override val name: String = "IOS"
}

actual fun getPlatformName(): String = IOSPlatform().name
package com.groupdev.cherry.client.features

import net.minecraft.client.MinecraftClient
import net.minecraft.text.Text

object PasswordHider {
    private val sensitiveCommands = setOf("/login", "/signup", "/register")

    fun register() {
        println("Password Hider active")
    }

    fun shouldHide(message: String): Boolean {
        return sensitiveCommands.any { message.trimStart().startsWith(it) }
    }
}

package net.minecraft.client

class MinecraftClient {
    companion object {
        fun getInstance(): MinecraftClient = MinecraftClient()
    }

    val inGameHud = net.minecraft.client.gui.InGameHud()
    var currentScreen: Any? = null
    fun setScreen(screen: Any?) {}
}

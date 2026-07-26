package com.groupdev.cherry.client.ui

import net.minecraft.client.gui.screen.Screen
import net.minecraft.client.gui.widget.ButtonWidget
import net.minecraft.text.Text

class CherryMenuScreen : Screen(Text.literal("Cherry Client")) {
    private val modules = listOf(
        "Password Hider",
        "Auto Sprint",
        "Auto Eat",
        "Smart Reconnect",
        "Stream Overlay",
        "HUD Cleaner",
        "Crosshair Boost",
        "Tap Sprint",
        "Item Tracker",
        "Macro Queue",
        "Lag Reducer",
        "Performance Boost",
        "Theme Switcher"
    )

    override fun init() {
        val buttonWidth = 220
        val x = (width - buttonWidth) / 2
        val firstY = 42
        modules.forEachIndexed { index, name ->
            val buttonY = firstY + index * 22
            addDrawableChild(
                ButtonWidget.builder(Text.literal(name)) { button ->
                    button.message = Text.literal("$name • ${if (button.message.string.endsWith("ON")) "OFF" else "ON"}")
                }.dimensions(x, buttonY, buttonWidth, 20).build()
            )
        }
    }
}

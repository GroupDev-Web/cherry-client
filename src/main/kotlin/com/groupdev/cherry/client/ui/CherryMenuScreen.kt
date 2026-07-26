package com.groupdev.cherry.client.ui

import dev.lowframe.gui.api.LFButton
import dev.lowframe.gui.api.LFScreen

class CherryMenuScreen : LFScreen("Cherry Client") {
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

    override fun build() {
        val x = 24
        val y = 24
        add(LFButton(x, y, 220, 24, "Cherry Client • Streaming Ready", {}))
        add(LFButton(x, y + 32, 220, 20, "Right Shift Menu", {}))

        modules.forEachIndexed { index, name ->
            val buttonY = y + 64 + index * 20
            val button = LFButton(x, buttonY, 220, 18, name, {})
            add(button)
        }
    }
}

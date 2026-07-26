package dev.lowframe.gui.api

import net.minecraft.client.gui.screen.Screen

open class LFScreen(name: String) : Screen() {
    protected fun add(widget: Any): Any = widget
    protected fun renderScreen() {}
    protected open fun build() {}
    protected open fun renderScreen(drawContext: Any, mouseX: Int, mouseY: Int, delta: Float) {}
    protected open fun renderOverlay(drawContext: Any, mouseX: Int, mouseY: Int, delta: Float) {}
    protected open fun onMouseClick(mouseX: Double, mouseY: Double, button: Int): Boolean = false
    protected open fun onMouseRelease(mouseX: Double, mouseY: Double, button: Int): Boolean = false
    protected open fun onMouseDrag(mouseX: Double, mouseY: Double, button: Int): Boolean = false
    protected open fun onScroll(mouseX: Double, mouseY: Double, amount: Double): Boolean = false
    protected open fun onKey(keyCode: Int, scanCode: Int): Boolean = false
    protected open fun onChar(codePoint: Char): Boolean = false
    open fun close() {}
}

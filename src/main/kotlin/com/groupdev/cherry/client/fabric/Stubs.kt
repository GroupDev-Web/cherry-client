package com.groupdev.cherry.client.fabric

class ClientModInitializer
class ClientTickEvents {
    companion object {
        val END_CLIENT_TICK = object {}
    }

    class EndTick(val action: (Any) -> Unit) {
        fun register() {}
    }
}

class KeyBindingHelper {
    companion object {
        fun registerKeyBinding(binding: Any): Any = binding
    }
}

class KeyBinding
class InputUtil {
    enum class Type { KEYSYM }
}

class GLFW {
    companion object {
        const val GLFW_KEY_RIGHT_SHIFT = 340
    }
}

class MinecraftClient {
    companion object {
        fun getInstance(): MinecraftClient = MinecraftClient()
    }

    val inGameHud = InGameHud()
    var currentScreen: Any? = null
    fun setScreen(screen: Any?) {}
}

class InGameHud {
    val chatHud = ChatHud()
}

class ChatHud {
    fun addMessage(text: Any) {}
}

class Text {
    companion object {
        fun of(value: String): Text = Text()
    }
}

class ClientSendMessageEvents {
    companion object {
        val ALLOW_CHAT_MESSAGE = object {}
    }
}

class ClientReceiveMessageEvents {
    companion object {
        val ALLOW_GAME_MESSAGE = object {}
    }
}

class DrawContext

open class Screen

class LFScreen(name: String) : Screen() {
    protected fun add(widget: Any): Any = widget
    protected fun build() {}
    protected fun renderScreen(drawContext: DrawContext, mouseX: Int, mouseY: Int, delta: Float) {}
    protected fun renderOverlay(drawContext: DrawContext, mouseX: Int, mouseY: Int, delta: Float) {}
    protected fun onMouseClick(mouseX: Double, mouseY: Double, button: Int): Boolean = false
    protected fun onMouseRelease(mouseX: Double, mouseY: Double, button: Int): Boolean = false
    protected fun onMouseDrag(mouseX: Double, mouseY: Double, button: Int): Boolean = false
    protected fun onScroll(mouseX: Double, mouseY: Double, amount: Double): Boolean = false
    protected fun onKey(keyCode: Int, scanCode: Int): Boolean = false
    protected fun onChar(codePoint: Char): Boolean = false
    protected fun renderScreen() {}
}

class LFButton(x: Int, y: Int, width: Int, height: Int, label: String, action: () -> Unit) {
    fun accent(): LFButton = this
}

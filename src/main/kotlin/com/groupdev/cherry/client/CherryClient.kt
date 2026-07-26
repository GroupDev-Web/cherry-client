package com.groupdev.cherry.client

import com.groupdev.cherry.client.features.PasswordHider
import com.groupdev.cherry.client.ui.CherryMenuScreen
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper
import net.minecraft.client.MinecraftClient
import net.minecraft.client.option.KeyBinding
import net.minecraft.client.util.InputUtil
import net.minecraft.util.Identifier
import org.lwjgl.glfw.GLFW

object CherryClient : ClientModInitializer {
    private val keyCategory = KeyBinding.Category.create(Identifier.of("cherry-client", "general"))
    private val menuKeyBinding = KeyBinding(
        "key.cherryclient.open_menu",
        InputUtil.Type.KEYSYM,
        GLFW.GLFW_KEY_RIGHT_SHIFT,
        keyCategory
    )

    override fun onInitializeClient() {
        KeyBindingHelper.registerKeyBinding(menuKeyBinding)
        PasswordHider.register()
        ClientTickEvents.END_CLIENT_TICK.register(ClientTickEvents.EndTick { client ->
            while (menuKeyBinding.wasPressed()) {
                client.setScreen(CherryMenuScreen())
            }
        })
        println("Cherry Client initialized — streaming mode ready")
    }
}

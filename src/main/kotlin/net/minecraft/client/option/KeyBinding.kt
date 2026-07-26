package net.minecraft.client.option

class KeyBinding(
    val translationKey: String,
    val type: Any,
    val code: Int,
    val category: String
) {
    fun wasPressed(): Boolean = false
}

package dev.lowframe.gui.api

class LFButton(
    val x: Int,
    val y: Int,
    val width: Int,
    val height: Int,
    val label: String,
    val action: () -> Unit
) {
    fun accent(): LFButton = this
}

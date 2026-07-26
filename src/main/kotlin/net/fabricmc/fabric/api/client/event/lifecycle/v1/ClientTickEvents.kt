package net.fabricmc.fabric.api.client.event.lifecycle.v1

class ClientTickEvents {
    companion object {
        val END_CLIENT_TICK = object {}
    }

    class EndTick(val action: (Any) -> Unit) {
        fun register() {}
    }
}

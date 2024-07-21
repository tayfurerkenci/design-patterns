package org.hf_design_patterns.adapter_facade

class Projector(private var description: String, var player: StreamingPlayer) {
    fun on() {
        println("$description on")
    }

    fun off() {
        println("$description off")
    }

    fun wideScreenMode() {
        println("$description in widescreen mode (16x9 aspect ratio)")
    }

    fun tvMode() {
        println("$description in tv mode (4x3 aspect ratio)")
    }

    override fun toString(): String {
        return description
    }
}
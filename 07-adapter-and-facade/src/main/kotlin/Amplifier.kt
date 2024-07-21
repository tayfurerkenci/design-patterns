package org.hf_design_patterns.adapter_facade

class Amplifier(private var description: String) {
    fun on() {
        println("$description on")
    }

    fun off() {
        println("$description off")
    }

    fun setStereoSound() {
        println("$description stereo mode on")
    }

    fun setSurroundSound() {
        println("$description surround sound on (5 speakers, 1 subwoofer)")
    }

    fun setVolume(level: Int) {
        println("$description setting volume to $level")
    }

    fun setTuner(tuner: Tuner) {
        println("$description setting tuner to $tuner")
    }

    fun setStreamingPlayer(player: StreamingPlayer) {
        println("$description setting Streaming player to $player")
    }

    override fun toString(): String {
        return description
    }
}
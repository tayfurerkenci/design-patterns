package org.hf_design_patterns.adapter_facade

class Tuner(var description: String, var amplifier: Amplifier?) {
    private var frequency: Double = 0.0

    fun on() {
        println("$description on")
    }

    fun off() {
        println("$description off")
    }

    @JvmName("setFrequencyValue")
    fun setFrequency(frequency: Double) {
        println("$description setting frequency to $frequency")
        this.frequency = frequency
    }

    fun setAm() {
        println("$description setting AM mode")
    }

    fun setFm() {
        println("$description setting FM mode")
    }

    override fun toString(): String {
        return description
    }
}
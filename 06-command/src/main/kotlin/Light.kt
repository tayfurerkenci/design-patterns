package org.hf_design_patterns.command

class Light(private val location: String) {

    fun on() {
        println("$location Light is on")
    }

    fun off() {
        println("$location Light is off")
    }
}
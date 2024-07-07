package org.hf_design_patterns.command

class GarageDoor(private val location: String) {
    fun up() {
        println("$location Garage door is open")
    }

    fun down() {
        println("$location Garage door is closed")
    }

    fun stop() {
        println("$location Garage door is stopped")
    }

    fun lightOn() {
        println("$location Garage light is on")
    }

    fun lightOff() {
        println("$location Garage light is off")
    }
}
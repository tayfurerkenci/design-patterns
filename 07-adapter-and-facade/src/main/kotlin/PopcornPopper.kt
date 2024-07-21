package org.hf_design_patterns.adapter_facade

class PopcornPopper(private var description: String) {
    fun on() {
        println("$description on")
    }

    fun off() {
        println("$description off")
    }

    fun pop() {
        println("$description popping popcorn!")
    }


    override fun toString(): String {
        return description
    }
}

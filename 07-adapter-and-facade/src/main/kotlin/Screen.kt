package org.hf_design_patterns.adapter_facade

class Screen(private var description: String) {
    fun up() {
        println("$description going up")
    }

    fun down() {
        println("$description going down")
    }


    override fun toString(): String {
        return description
    }
}
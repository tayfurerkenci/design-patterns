package org.hf_design_patterns.adapter_facade

class WildTurkey: Turkey {
    override fun gobble() {
        println("Gobble gobble")
    }

    override fun fly() {
        println("I'm flying a short distance")
    }
}
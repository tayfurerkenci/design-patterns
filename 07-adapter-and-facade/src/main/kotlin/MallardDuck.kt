package org.hf_design_patterns.adapter_facade

class MallardDuck: Duck{
    override fun quack() {
        println("Quack")
    }

    override fun fly() {
        println("I'm flying")
    }
}
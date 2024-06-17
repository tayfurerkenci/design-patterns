package org.hf_design_patterns.strategy

class Quack : QuackBehavior {
    override fun quack() {
        println("Quack");
    }
}
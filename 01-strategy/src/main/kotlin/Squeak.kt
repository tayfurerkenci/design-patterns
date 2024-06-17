package org.hf_design_patterns.strategy;

class Squeak : QuackBehavior {
    override fun quack() {
        println("Squeak");
    }
}
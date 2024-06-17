package org.hf_design_patterns.strategy;

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("<< Silence >>");
    }
}
package org.hf_design_patterns.strategy

class MallardDuck : Duck() {
    init {
        setFlyBehavior(FlyWithWings())
        setQuackBehavior(Quack())
    }

    override fun display() {
        println("I'm a real Mallard duck")
    }
}
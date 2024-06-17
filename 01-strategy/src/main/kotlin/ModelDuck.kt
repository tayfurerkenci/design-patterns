package org.hf_design_patterns.strategy

class ModelDuck : Duck() {
    init {
        setFlyBehavior(FlyNoWay())
        setQuackBehavior(Quack())
    }

    override fun display() {
        println("I'm a model duck")
    }
}
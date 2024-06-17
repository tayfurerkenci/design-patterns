package org.hf_design_patterns.strategy

class FlyRocketPowered : FlyBehavior {
    override fun fly() {
        println("I'm flying with a rocket!")
    }
}
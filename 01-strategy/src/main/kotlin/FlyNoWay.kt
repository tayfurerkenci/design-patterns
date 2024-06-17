package org.hf_design_patterns.strategy;

class FlyNoWay : FlyBehavior {
    override fun fly() {
        System.out.println("I can't fly");
    }
}
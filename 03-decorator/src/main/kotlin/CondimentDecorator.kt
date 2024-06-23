package org.hf_design_patterns.decorator

abstract class CondimentDecorator(val beverage: Beverage): Beverage() {
    override var description: String = beverage.description
    override var size: Size = beverage.size
}
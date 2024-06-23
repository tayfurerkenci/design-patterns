package org.hf_design_patterns.decorator

class Whip(beverage: Beverage): CondimentDecorator(beverage) {
    init {
        description = "${beverage.description}, Whip"
    }

    override fun cost(): Double {
        return roundToTwoDecimalPlaces( .10 + beverage.cost())
    }
}
package org.hf_design_patterns.decorator

import java.math.BigDecimal
import java.math.RoundingMode

class Soy(beverage: Beverage): CondimentDecorator(beverage) {
    private var cost: Double = 0.0
    init {
        description = "${beverage.description}, Soy"
        cost = when (beverage.size) {
            Size.TALL -> .10
            Size.GRANDE -> .15
            Size.VENTI -> .20
        }
    }

    override fun cost(): Double {
        val totalCost = this.cost + beverage.cost()
        return roundToTwoDecimalPlaces(totalCost)
    }
}
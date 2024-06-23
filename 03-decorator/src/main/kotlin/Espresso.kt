package org.hf_design_patterns.decorator

class Espresso(): Beverage("Espresso") {
    constructor(size: Size) : this() {
        this.size = size
    }

    override fun cost(): Double {
        return 1.99
    }
}
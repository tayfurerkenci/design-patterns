package org.hf_design_patterns.decorator

class Decaf(): Beverage("Decaf") {
    constructor(size: Size) : this() {
        this.size = size
    }

    override fun cost(): Double {
        return 1.05
    }
}
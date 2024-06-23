package org.hf_design_patterns.decorator

class HouseBlend() : Beverage("House Blend Coffee") {
    constructor(size: Size) : this() {
        this.size = size
    }

    override fun cost(): Double {
        return .89
    }
}
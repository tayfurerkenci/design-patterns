package org.hf_design_patterns.decorator

class DarkRoast(): Beverage("Dark Roast Coffee"){
    constructor(size: Size) : this() {
        this.size = size
    }

    override fun cost(): Double {
        return .99
    }
}
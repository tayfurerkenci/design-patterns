package org.hf_design_patterns.decorator

abstract class Beverage(
    open var description: String = "Unknown Beverage",
    open var size: Size = Size.TALL
)  {
    abstract fun cost(): Double
}
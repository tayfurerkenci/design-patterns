package org.hf_design_patterns

abstract class CaffeineBeverage {
    // template method
    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        addCondiments()
    }

    abstract fun brew()

    abstract fun addCondiments()

    fun boilWater() {
        println("Boiling water")
    }

    fun pourInCup() {
        println("Pouring into cup")
    }
}
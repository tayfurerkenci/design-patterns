package org.hf_design_patterns.factory

abstract class Pizza {
    var name: String? = null

    var dough: Dough? = null
    var sauce: Sauce? = null
    var veggies: Array<Veggies>? = null
    var cheese: Cheese? = null
    var pepperoni: Pepperoni? = null
    var clam: Clams? = null

    abstract fun prepare();

    fun bake() {
        println("Baking $name")
        println("Bake for 25 minutes at 350")
    }

    open fun cut() {
        println("Cutting $name")
        println("Cutting the pizza into diagonal slices")
    }

    fun box() {
        println("Boxing $name")
        println("Place pizza in official PizzaStore box")
    }
}
package org.hf_design_patterns.factory

class ClamPizza(private val ingredientFactory: PizzaIngredientFactory): Pizza(){
    override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        clam = ingredientFactory.createClam()
    }
}
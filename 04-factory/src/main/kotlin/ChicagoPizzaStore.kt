package org.hf_design_patterns.factory

class ChicagoPizzaStore: PizzaStore(){
    override fun createPizza(type: String): Pizza {
        var pizza: Pizza? = null
        val ingredientFactory: PizzaIngredientFactory = ChicagoPizzaIngredientFactory()

        when (type) {
            "cheese" -> {
                pizza = CheesePizza(ingredientFactory)
                pizza.name = "Chicago Style Cheese Pizza"
            }
            "clam" -> {
                pizza = ClamPizza(ingredientFactory)
                pizza.name = "Chicago Style Clam Pizza"
            }
            "veggie" -> {
                pizza = VeggiePizza(ingredientFactory)
                pizza.name = "Chicago Style Veggie Pizza"
            }
            "pepperoni" -> {
                pizza = PepperoniPizza(ingredientFactory)
                pizza.name = "Chicago Style Pepperoni Pizza"
            }
        }

        return pizza ?: throw IllegalArgumentException("Invalid pizza type: $type")
    }
}
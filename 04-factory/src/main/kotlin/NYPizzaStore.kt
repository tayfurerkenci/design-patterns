package org.hf_design_patterns.factory

class NYPizzaStore: PizzaStore() {

    override fun createPizza(type: String): Pizza {
        var pizza: Pizza? = null
        val ingredientFactory: PizzaIngredientFactory = NYPizzaIngredientFactory()

        when (type) {
            "cheese" -> {
                pizza = CheesePizza(ingredientFactory)
                pizza.name = "New York Style Cheese Pizza"
            }
            "clam" -> {
                pizza = ClamPizza(ingredientFactory)
                pizza.name = "New York Style Clam Pizza"
            }
            "veggie" -> {
                pizza = VeggiePizza(ingredientFactory)
                pizza.name = "New York Style Veggie Pizza"
            }
            "pepperoni" -> {
                pizza = PepperoniPizza(ingredientFactory)
                pizza.name = "New York Style Pepperoni Pizza"
            }
        }

        return pizza ?: throw IllegalArgumentException("Invalid pizza type: $type")
    }
}
package org.hf_design_patterns.factory

class CaliforniaPizzaStore: PizzaStore() {
    override fun createPizza(type: String): Pizza {
        var pizza: Pizza? = null
        val ingredientFactory: PizzaIngredientFactory = CaliforniaPizzaIngredientFactory()

        when (type) {
            "cheese" -> {
                pizza = CheesePizza(ingredientFactory)
                pizza.name = "California Style Cheese Pizza"
            }
            "clam" -> {
                pizza = ClamPizza(ingredientFactory)
                pizza.name = "California Style Clam Pizza"
            }
            "veggie" -> {
                pizza = VeggiePizza(ingredientFactory)
                pizza.name = "California Style Veggie Pizza"
            }
            "pepperoni" -> {
                pizza = PepperoniPizza(ingredientFactory)
                pizza.name = "California Style Pepperoni Pizza"
            }
        }

        return pizza ?: throw IllegalArgumentException("Invalid pizza type: $type")
    }
}
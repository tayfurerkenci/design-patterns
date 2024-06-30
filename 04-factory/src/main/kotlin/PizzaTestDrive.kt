package org.hf_design_patterns.factory

fun main() {
    val nyStore: PizzaStore = NYPizzaStore()
    val chicagoStore: PizzaStore = ChicagoPizzaStore()
    val californiaStore: PizzaStore = CaliforniaPizzaStore()

    var pizza = nyStore.orderPizza("cheese")
    println("Ethan ordered a ${pizza.name}\n")

    pizza = chicagoStore.orderPizza("cheese")
    println("Joel ordered a ${pizza.name}\n")

    pizza = californiaStore.orderPizza("cheese")
    println("Tayfur ordered a ${pizza.name}\n")
}
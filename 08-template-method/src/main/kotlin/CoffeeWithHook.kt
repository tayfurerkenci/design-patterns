package org.hf_design_patterns

class CoffeeWithHook: CaffeineBeverageWithHook() {
    override fun brew() {
        println("Dripping Coffee through filter")
    }

    override fun addCondiments() {
        println("Adding Sugar and Milk")
    }

    override fun customerWantsCondiments(): Boolean {
        val answer = getUserInput()
        return answer.lowercase().startsWith("y")
    }
}

fun getUserInput(): String {
    println("Would you like milk and sugar with your coffee (y/n)? ")
    return readlnOrNull() ?: "no"
}
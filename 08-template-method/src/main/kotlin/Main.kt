package org.hf_design_patterns

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Making tea using template method without hook
    val myTea = Tea()
    myTea.prepareRecipe()

    // Making tea and coffee using template method with hook
    val teaHook = TeaWithHook()
    val coffeeHook = CoffeeWithHook()

    println("\nMaking tea...")
    teaHook.prepareRecipe()
    println("\nMaking coffee...")
    coffeeHook.prepareRecipe()
}
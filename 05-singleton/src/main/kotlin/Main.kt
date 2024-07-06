package org.hf_design_patterns.singleton

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val instance1 = Singleton.getInstance()
    val instance2 = Singleton.getInstance()

    println("instance1 == instance2: ${instance1 == instance2}")

}
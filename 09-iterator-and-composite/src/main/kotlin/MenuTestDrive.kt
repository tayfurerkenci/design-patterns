package org.hf_design_patterns

fun main() {
    val pancakeMenu = PancakeHouseMenu()
    val dinerMenu = DinerMenu()

    val waitress = Waitress(pancakeMenu, dinerMenu)
    waitress.printMenu()
}
package org.hf_design_patterns

import kotlin.collections.Iterator

class Waitress(private val pancakeHouseMenu: Menu, private val dinerMenu: Menu) {

    private fun printMenu(iterator: Iterator<MenuItem>) {
        while (iterator.hasNext()) {
            val menuItem = iterator.next()
            println(menuItem)
        }
    }

    fun printMenu() {
        val pancakeIterator = pancakeHouseMenu.createIterator()
        val dinerIterator = dinerMenu.createIterator()

        println("MENU\n----\nBREAKFAST")
        printMenu(pancakeIterator)
        println("\nLUNCH")
        printMenu(dinerIterator)
    }
}
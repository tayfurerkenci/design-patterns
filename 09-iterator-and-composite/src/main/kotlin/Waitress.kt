package org.hf_design_patterns

class Waitress(private val pancakeHouseMenu: PancakeHouseMenu, private val dinerMenu: DinerMenu) {

    private fun printMenu(iterator: Iterator) {
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
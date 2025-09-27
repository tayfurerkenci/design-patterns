package org.hf_design_patterns

import kotlin.collections.Iterator

class DinerMenu_deprecated(private val name: String, private val description: String): Menu(name, description) {
    companion object {
        private const val MAX_ITEMS: Int = 6
    }

    private var numberOfItems: Int = 0
    private val menuItems: Array<MenuItem?> = arrayOfNulls(MAX_ITEMS)

    init {
        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99)
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99)
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29)
        addItem("Hotdog", "A hot dog, with sauerkraut, relish, onions, topped with cheese", false, 3.05)
        addItem("Steamed Veggies and Brown Rice", "Steamed vegetables over brown rice", true, 3.99)
        addItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89)
    }

    fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        val menuItem = MenuItem(name, description, vegetarian, price)
        if (numberOfItems >= MAX_ITEMS) {
            println("Sorry, menu is full! Can't add item to menu")
        } else {
            menuItems[numberOfItems] = menuItem
            numberOfItems++
        }
    }

    fun createIterator(): Iterator<MenuItem>  = DinerMenuIterator_deprecated(menuItems)
}
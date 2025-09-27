package org.hf_design_patterns

fun main() {
    val pancakeMenu: MenuComponent = Menu("PANCAKE HOUSE MENU", "Breakfast").apply {
        add(MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99))
        add(MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99))
        add(MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries, and blueberry syrup", true, 3.49))
        add(MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", false, 3.59))
    }

    val dessertMenu: MenuComponent = Menu("DESSERT MENU", "Dessert of course!").apply {
        add(MenuItem("Apple Pie", "Apple pie with a flake crust, topped with vanilla ice cream", true, 1.59))
        add(MenuItem("Cheesecake", "Creamy New York cheesecake, with a chocolate graham crust", true, 1.99))
        add(MenuItem("Sorbet", "A scoop of raspberry and a scoop of lime", true, 1.89))
    }

    val dinerMenu: MenuComponent = Menu("DINER MENU", "Lunch").apply {
        add(MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99))
        add(MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99))
        add(MenuItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29))
        add(MenuItem("Hotdog", "A hot dog, with sauerkraut, relish, onions, topped with cheese", false, 3.05))
        add(MenuItem("Steamed Veggies and Brown Rice", "Steamed vegetables over brown rice", true, 3.99))
        add(MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89))
        add(dessertMenu)
    }

    val cafeMenu: MenuComponent = Menu("CAFE MENU", "Dinner").apply {
        add(MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99))
        add(MenuItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69))
        add(MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29))
    }

    val allMenus: MenuComponent = Menu("ALL MENUS", "All menus combined").apply {
        add(pancakeMenu)
        add(dinerMenu)
        add(cafeMenu)
    }

    val waitress = Waitress(allMenus)
    waitress.printMenu()
}
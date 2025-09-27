package org.hf_design_patterns

open class Menu(
    private val name: String = "",
    private val description: String = ""
): MenuComponent() {
    private val menuComponents: MutableList<MenuComponent> = mutableListOf()

    override fun add(menuComponent: MenuComponent) {
        menuComponents.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent) {
        menuComponents.remove(menuComponent)
    }

    override fun getChild(i: Int): MenuComponent {
        return menuComponents[i]
    }

    override fun getName(): String = name

    override fun getDescription(): String = description

    override fun print() {
        println("\n$name, $description")
        println("---------------------")

        for (menuComponent in menuComponents) {
            menuComponent.print()
        }
    }
}
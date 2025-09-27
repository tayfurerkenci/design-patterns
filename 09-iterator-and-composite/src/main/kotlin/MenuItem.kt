package org.hf_design_patterns

class MenuItem(
    private val name: String = "",
    private val description: String = "",
    private val vegetarian: Boolean = false,
    private val price: Double = 0.0
) : MenuComponent() {

    override fun getName(): String = name

    override fun getDescription(): String = description

    override fun getPrice(): Double = price

    override fun isVegetarian(): Boolean = vegetarian

    override fun print() {
        val vegMarker = if (isVegetarian()) " (v)" else ""
        println(getName() + vegMarker + ", $" + getPrice() + " -- " + getDescription())
    }
}

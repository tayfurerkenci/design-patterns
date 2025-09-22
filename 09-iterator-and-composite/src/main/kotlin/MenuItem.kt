package org.hf_design_patterns

data class MenuItem(
    val name: String = "",
    val description: String = "",
    val vegetarian: Boolean = false,
    val price: Double = 0.0
) {
    override fun toString(): String = "$name, \$${price} -- $description"
}
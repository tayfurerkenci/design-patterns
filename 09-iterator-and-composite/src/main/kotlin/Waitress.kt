package org.hf_design_patterns

class Waitress(private val allMenus: MenuComponent) {
    fun printMenu() {
        allMenus.print()
    }
}
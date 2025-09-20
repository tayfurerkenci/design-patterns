package org.hf_design_patterns

class Tea: CaffeineBeverage() {
    override fun brew() {
        println("Steeping the tea")
    }

    override fun addCondiments() {
        println("Adding Lemon")
    }
}
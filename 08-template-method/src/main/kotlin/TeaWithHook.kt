package org.hf_design_patterns

class TeaWithHook: CaffeineBeverageWithHook() {
    override fun brew() {
        println("Steeping the tea")
    }

    override fun addCondiments() {
        println("Adding Lemon")
    }

    override fun customerWantsCondiments(): Boolean {
        val answer = getUserInput()
        return answer.lowercase().startsWith("y")
    }
}
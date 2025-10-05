package org.hf_design_patterns

class Quackologist: Observer {
    override fun update(duck: QuackObservable) {
        println("Quackologist: ${duck.javaClass.simpleName} just quacked.")
    }
}
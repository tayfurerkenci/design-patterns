package org.hf_design_patterns

class FlockObserver: Observer {
    override fun update(duck: QuackObservable) {
        println("FlockObserver: ${duck.javaClass.simpleName} just quacked.")
    }
}


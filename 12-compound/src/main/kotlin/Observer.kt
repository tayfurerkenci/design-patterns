package org.hf_design_patterns

interface Observer {
    // Update receives the observable that triggered the update
    fun update(duck: QuackObservable)
}


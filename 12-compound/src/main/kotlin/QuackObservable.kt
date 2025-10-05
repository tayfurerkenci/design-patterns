package org.hf_design_patterns

interface QuackObservable {
    fun registerObserver(observer: Observer)
    fun notifyObservers()
}
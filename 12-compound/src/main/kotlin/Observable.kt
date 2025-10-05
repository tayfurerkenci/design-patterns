package org.hf_design_patterns

class Observable(private val duck: QuackObservable): QuackObservable {
    // Use a MutableList so we can add observers
    private val observers: MutableList<Observer> = mutableListOf()

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(duck)
        }
    }

    // Notify observers with a specific subject (useful when the observable is a composite)
    fun notifyObserversOf(subject: QuackObservable) {
        for (observer in observers) {
            observer.update(subject)
        }
    }
}
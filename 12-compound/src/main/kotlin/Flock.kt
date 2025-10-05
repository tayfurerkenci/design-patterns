package org.hf_design_patterns

class Flock: Quackable {
    private val quackers = mutableListOf<Quackable>()
    private val observable: Observable = Observable(this)

    fun add(quacker: Quackable) {
        quackers.add(quacker)
        // Register a proxy observer on the child so the flock can notify its own observers
        quacker.registerObserver(object : Observer {
            override fun update(duck: QuackObservable) {
                // A child quacked; notify observers registered on the flock about that child
                observable.notifyObserversOf(duck)
            }
        })
    }

    override fun quack() {
        val iterator: Iterator<Quackable> = quackers.iterator()
        while (iterator.hasNext()) {
            val quacker = iterator.next()
            quacker.quack()
        }
    }

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }
}
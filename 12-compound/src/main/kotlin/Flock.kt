package org.hf_design_patterns

class Flock: Quackable {
    private val quackers = mutableListOf<Quackable>()

    fun add(quacker: Quackable) {
        quackers.add(quacker)
        // Do NOT register proxy observers here. Observers should be registered
        // when someone calls registerObserver on the flock (so they get registered
        // on current children). This avoids surprise side-effects at add-time.
    }

    override fun quack() {
        val iterator: Iterator<Quackable> = quackers.iterator()
        while (iterator.hasNext()) {
            val quacker = iterator.next()
            quacker.quack()
        }
    }

    override fun registerObserver(observer: Observer) {
        // Register the observer on every child so the observer receives updates
        // directly from whichever duck actually quacked.
        for (quacker in quackers) {
            quacker.registerObserver(observer)
        }
    }

    override fun notifyObservers() {
        // Flock itself does not notify observers. Each quacker notifies its own
        // observers when it quacks.
    }
}
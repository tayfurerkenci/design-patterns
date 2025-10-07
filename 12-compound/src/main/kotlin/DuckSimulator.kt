package org.hf_design_patterns

// Idiomatic Kotlin: top-level main and concise simulation
fun main() {
    val duckFactory: AbstractDuckFactory = CountingDuckFactory()

    val redheadDuck: Quackable = duckFactory.createRedheadDuck()
    val duckCall: Quackable = duckFactory.createDuckCall()
    val rubberDuck: Quackable = duckFactory.createRubberDuck()
    val gooseDuck: Quackable = GooseAdapter(Goose())

    println("\nDuck Simulator: With Composite - Flocks")

    val flockOfDucks: Flock = Flock()
    flockOfDucks.add(redheadDuck)
    flockOfDucks.add(duckCall)
    flockOfDucks.add(rubberDuck)
    flockOfDucks.add(gooseDuck)

    val flockOfMallards: Flock = Flock()
    flockOfMallards.add(duckFactory.createMallardDuck())
    flockOfMallards.add(duckFactory.createMallardDuck())
    flockOfMallards.add(duckFactory.createMallardDuck())
    flockOfMallards.add(duckFactory.createMallardDuck())

    flockOfDucks.add(flockOfMallards)

    println("\nDuck Simulator: With Observer")
    // Observe the flock as a whole with a Quackologist (observe children via Flock.registerObserver)
    val quackologist: Observer = Quackologist()
    flockOfDucks.registerObserver(quackologist)

    println("\nDuck Simulator: Whole Flock Simulation")
    simulate(flockOfDucks)

    println("\nDuck Simulator: Mallard Flock Simulation")
    simulate(flockOfMallards)

    println("\nThe ducks quacked ${QuackCounter.getQuacks()} times")
}

fun simulate(duck: Quackable) {
    duck.quack()
}
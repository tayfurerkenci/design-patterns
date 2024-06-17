package org.hf_design_patterns.strategy

abstract class Duck {
    var flyBehavior: FlyBehavior? = null
        private set
    var quackBehavior: QuackBehavior? = null
        private set

    abstract fun display()

    fun performFly() {
        flyBehavior?.fly()
    }

    fun performQuack() {
        quackBehavior?.quack()
    }

    fun swim() {
        println("All ducks float, even decoys!")
    }

    @JvmName("setFlyBehavior")  // Annotate the custom setter
    fun setFlyBehavior(fb: FlyBehavior) {
        this.flyBehavior = fb
    }

    @JvmName("setQuackBehavior")  // Annotate the custom setter
    fun setQuackBehavior(qb: QuackBehavior) {
        this.quackBehavior = qb
    }
}
package org.hf_design_patterns

class DuckFactory: AbstractDuckFactory() {
    override fun createMallardDuck(): Quackable {
        return MallardDuck()
    }

    override fun createRedheadDuck(): Quackable {
        return RedheadDuck()
    }

    override fun createDuckCall(): Quackable {
        return  DuckCall()
    }

    override fun createRubberDuck(): Quackable {
        return  RubberDuck()
    }
}
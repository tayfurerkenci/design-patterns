package org.hf_design_patterns

abstract class AbstractDuckFactory {
    abstract fun createMallardDuck(): Quackable
    abstract fun createRedheadDuck(): Quackable
    abstract fun createDuckCall(): Quackable
    abstract fun createRubberDuck(): Quackable
}
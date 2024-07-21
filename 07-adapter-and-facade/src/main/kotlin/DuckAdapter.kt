package org.hf_design_patterns.adapter_facade

import kotlin.random.Random

class DuckAdapter(private val duck: Duck) : Turkey {
        private var random: Random = Random.Default
        override fun gobble() {
            duck.quack()
        }

        override fun fly() {
            if (random.nextInt(5) == 0)
                duck.fly()
        }
}
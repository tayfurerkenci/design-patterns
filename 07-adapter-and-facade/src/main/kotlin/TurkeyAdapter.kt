package org.hf_design_patterns.adapter_facade

class TurkeyAdapter(private val turkey: Turkey) : Duck{

    override fun quack() {
        turkey.gobble()
    }

    override fun fly() {
        for (i in 0..4){
            turkey.fly()
        }
    }
}
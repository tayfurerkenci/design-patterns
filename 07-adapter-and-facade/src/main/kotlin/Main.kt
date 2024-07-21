package org.hf_design_patterns.adapter_facade

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val duck: Duck = MallardDuck()
    val turkey: Turkey = WildTurkey()
    val turkeyAdapter: Duck = TurkeyAdapter(turkey)
    val duckAdapter: Turkey = DuckAdapter(duck)

    println("The Turkey says...")
    turkey.gobble()
    turkey.fly()

    println("\nThe Duck says...")
    testDuck(duck)

    println("\nThe TurkeyAdapter says...")
    testDuck(turkeyAdapter)

    println("\nThe DuckAdapter says...")
    testTurkey(duckAdapter)
}

fun testDuck(duck: Duck) {
    duck.quack()
    duck.fly()
}

fun testTurkey(turkey: Turkey) {
    turkey.gobble()
    turkey.fly()
}
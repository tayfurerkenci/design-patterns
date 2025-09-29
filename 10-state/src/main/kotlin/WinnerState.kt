package org.hf_design_patterns

class WinnerState(private val gumballMachine: GumballMachine) : State {
    override fun insertQuarter() {
        println("Please wait, we're already giving you a gumball")
    }

    override fun ejectQuarter() {
        println("Sorry, you already turned the crank")
    }

    override fun turnCrank() {
        println("Turning twice doesn't get you another gumball!")
    }

    override fun dispense() {
        println("YOU'RE A WINNER! You get two gumballs for your quarter")
        gumballMachine.releaseBall()
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.soldOutState())
        } else {
            gumballMachine.releaseBall()
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.noQuarterState())
            } else {
                println("Oops, out of gumballs!")
                gumballMachine.setState(gumballMachine.soldOutState())
            }
        }
    }
}
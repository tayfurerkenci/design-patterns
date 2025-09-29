package org.hf_design_patterns

class HasQuarterState(private val gumballMachine: GumballMachine) : State {
    private val randomWinner = (0..9).random() == 0
    override fun insertQuarter() {
        println("You can't insert another quarter")
    }

    override fun ejectQuarter() {
        println("Quarter returned")
        gumballMachine.setState(gumballMachine.noQuarterState())
    }

    override fun turnCrank() {
        println("You turned...")
        if(randomWinner && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.winnerState())
        } else gumballMachine.setState(gumballMachine.soldState())
    }

    override fun dispense() {
        println("No gumball dispensed")
    }

}
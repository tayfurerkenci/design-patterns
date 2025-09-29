package org.hf_design_patterns

class GumballMachine(private var count: Int = 0) {
    // State instances (created once)
    private val soldOutStateInstance: State = SoldOutState()
    private val noQuarterStateInstance: State = NoQuarterState(this)
    private val hasQuarterStateInstance: State = HasQuarterState(this)
    private val soldStateInstance: State = SoldState(this)
    private val winnerStateInstance: State = WinnerState(this)

    private var currentState: State = if (count > 0) noQuarterStateInstance else soldOutStateInstance

    // Accessors used by State implementations (keeps instances encapsulated)
    fun hasQuarterState(): State = hasQuarterStateInstance
    fun noQuarterState(): State = noQuarterStateInstance
    fun soldState(): State = soldStateInstance
    fun soldOutState(): State = soldOutStateInstance
    fun winnerState(): State = winnerStateInstance

    fun getCount(): Int = count

    // Called by State implementations to change state
    fun setState(state: State) {
        currentState = state
    }

    // Public API delegates to current state
    fun insertQuarter() = currentState.insertQuarter()
    fun ejectQuarter() = currentState.ejectQuarter()
    fun turnCrank() {
        currentState.turnCrank()
        currentState.dispense()
    }

    fun releaseBall() {
        println("A gumball comes rolling out the slot...")
        if (count > 0) count--
    }

    fun refill(numGumballs: Int) {
        count += numGumballs
        if (count > 0) setState(noQuarterStateInstance)
    }

    override fun toString(): String {
        return "GumballMachine[inventory=$count, state=${currentState::class.simpleName}]"
    }
}
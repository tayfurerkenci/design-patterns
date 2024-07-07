package org.hf_design_patterns.command

class RemoteControl {
    private val onCommands: Array<Command?>
    private val offCommands: Array<Command?>

    init {
        onCommands = arrayOfNulls(7)
        offCommands = arrayOfNulls(7)

        val noCommand = NoCommand()
        for (i in 0..6) {
            onCommands[i] = noCommand
            offCommands[i] = noCommand
        }
    }

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot]?.execute()
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot]?.execute()
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("\n------ Remote Control -------\n")
        for (i in onCommands.indices) {
            sb.append(
                "[slot $i] ${onCommands[i]!!.javaClass.name}   ${
                    offCommands[i]!!.javaClass.name
                }\n"
            )
        }
        return sb.toString()
    }
}
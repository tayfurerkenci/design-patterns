package org.hf_design_patterns.command

class RemoteControlWithUndo {
    private val onCommands: Array<Command>
    private val offCommands: Array<Command>
    private var undoCommand: Command

    init {
        val noCommand = NoCommand()
        onCommands = Array(7) { noCommand }
        offCommands = Array(7) { noCommand }
        undoCommand = noCommand
    }

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
        undoCommand = onCommands[slot]
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
        undoCommand = offCommands[slot]
    }

    fun undoButtonWasPushed() {
        undoCommand.undo()
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("\n------ Remote Control -------\n")
        for (i in onCommands.indices) {
            sb.append("[slot $i] ${onCommands[i].javaClass.name}    ${offCommands[i].javaClass.name}\n")
        }
        sb.append("[undo] ${undoCommand.javaClass.name}\n")
        return sb.toString()
    }
}
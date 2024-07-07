package org.hf_design_patterns.command

class SimpleRemoteControl {
    private var slot: Command? = null

    fun setCommand(command: Command) {
        slot = command
    }

    fun buttonWasPressed() {
        slot?.execute()
    }
}
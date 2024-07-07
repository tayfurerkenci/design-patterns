package org.hf_design_patterns.command

class GarageDoorUpCommand(private val garageDoor: GarageDoor): Command {
    override fun execute() {
        garageDoor.up()
    }

    override fun undo() {
        garageDoor.down()
    }
}
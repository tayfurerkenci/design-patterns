package org.hf_design_patterns.command

class GarageDoorDownCommand(private val garageDoor: GarageDoor): Command {
    override fun execute() {
        garageDoor.down()
    }

    override fun undo() {
        garageDoor.up()
    }
}
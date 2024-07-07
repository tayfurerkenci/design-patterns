package org.hf_design_patterns.command

class MacroCommand(private val commands: List<Command>): Command {
    override fun execute() {
        commands.forEach { it.execute() }
    }

    override fun undo() {
        commands.forEach { it.undo() }
    }
}
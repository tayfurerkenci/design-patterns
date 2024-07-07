package org.hf_design_patterns.command

class NoCommand: Command {
    override fun execute() {
        println("No command")
    }

    override fun undo() {
        println("No command")
    }
}
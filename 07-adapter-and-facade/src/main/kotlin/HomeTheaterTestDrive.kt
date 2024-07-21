package org.hf_design_patterns.adapter_facade

object HomeTheaterTestDrive {
    @JvmStatic
    fun main(args: Array<String>) {
        val amp = Amplifier("Amplifier")
        val tuner = Tuner("AM/FM Tuner", amp)
        val player = StreamingPlayer("Streaming Player", amp)
        val cd = CdPlayer("CD Player", amp)
        val projector = Projector("Projector", player)
        val lights = TheaterLights("Theater Ceiling Lights")
        val screen = Screen("Theater Screen")
        val popper = PopcornPopper("Popcorn Popper")

        val homeTheater =
            HomeTheaterFacade(
                amp, tuner, player,
                projector, screen, lights, popper
            )

        homeTheater.watchMovie("Raiders of the Lost Ark")
        homeTheater.endMovie()
    }
}
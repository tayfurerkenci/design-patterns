package org.hf_design_patterns.adapter_facade

class HomeTheaterFacade(
    private var amp: Amplifier,
    private var tuner: Tuner,
    private var player: StreamingPlayer,
    private var projector: Projector,
    private var screen: Screen,
    private var lights: TheaterLights,
    private var popper: PopcornPopper
) {
    var cd: CdPlayer? = null

    fun watchMovie(movie: String?) {
        println("Get ready to watch a movie...")
        popper.on()
        popper.pop()
        lights.dim(10)
        screen.down()
        projector.on()
        projector.wideScreenMode()
        amp.on()
        amp.setStreamingPlayer(player)
        amp.setSurroundSound()
        amp.setVolume(5)
        player.on()
        player.play(movie!!)
    }


    fun endMovie() {
        println("Shutting movie theater down...")
        popper.off()
        lights.on()
        screen.up()
        projector.off()
        amp.off()
        player.stop()
        player.off()
    }

    fun listenToRadio(frequency: Double) {
        println("Tuning in the airwaves...")
        tuner.on()
        tuner.setFrequency(frequency)
        amp.on()
        amp.setVolume(5)
        amp.setTuner(tuner)
    }

    fun endRadio() {
        println("Shutting down the tuner...")
        tuner.off()
        amp.off()
    }
}
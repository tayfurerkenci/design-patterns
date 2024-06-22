package org.hf_design_patterns.observer

class ForecastDisplay(private var weatherData: WeatherData) : Observer, DisplayElement {
    private var currentPressure = 29.92f
    private var lastPressure = 0.0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        val pressure = weatherData.getPressure()
        lastPressure = currentPressure
        currentPressure = pressure
        display()
    }

    override fun display() {
        println("Forecast: ${if (currentPressure > lastPressure) "Improving weather on the way!" else if (currentPressure == lastPressure) "More of the same" else "Watch out for cooler, rainy weather"}")
    }
}

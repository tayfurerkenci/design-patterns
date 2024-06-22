package org.hf_design_patterns.observer

class HeadIndexDisplay(private var weatherData: WeatherData) : Observer, DisplayElement{
    private var headIndex: Double = 0.0

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        headIndex = computeHeatIndex()
        display()
    }

    override fun display() {
        println("Heat index is $headIndex")
    }

    private fun computeHeatIndex(): Double {
        val t = weatherData.getTemperature()
        val rh = weatherData.getHumidity()

        return (16.923 + 0.185212 * t + 5.37941 * rh - 0.100254 * t * rh +
                0.00941695 * (t * t) + 0.00728898 * (rh * rh) +
                0.000345372 * (t * t * rh) - 0.000814971 * (t * rh * rh) +
                0.0000102102 * (t * t * rh * rh) - 0.000038646 * (t * t * t) +
                0.0000291583 * (rh * rh * rh) + 0.00000142721 * (t * t * t * rh) +
                0.000000197483 * (t * rh * rh * rh) - 0.0000000218429 * (t * t * t * rh * rh) +
                0.000000000843296 * (t * t * rh * rh * rh) - 0.0000000000481975 * (t * t * t * rh * rh * rh))
    }
}
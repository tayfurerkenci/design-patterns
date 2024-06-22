package org.hf_design_patterns.observer

class WeatherData : Subject {
    private val observers: MutableList<Observer> = mutableListOf()
    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f
    private var pressure: Float = 0.0f

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        val i = observers.indexOf(o)
        if (i >= 0) {
            observers.removeAt(i)
        }
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update()
        }
    }

    private fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }

    fun getTemperature(): Float {
        return temperature
    }

    fun getHumidity(): Float {
        return humidity
    }

    fun getPressure(): Float {
        return pressure
    }
}
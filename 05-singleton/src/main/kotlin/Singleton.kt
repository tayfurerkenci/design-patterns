object Singleton {
    init {
        println("Singleton instance is being initialized.")
    }

    fun getInstance(): Singleton {
        return this
    }
}
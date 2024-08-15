package ru.otus.cars

open class GeneralTank: Tank {
    private var value: Int = 0
    override fun getContent(): Int {
        println("GeneralTank.getContent()")
        return value
    }
    override fun receiveFuel(liters: Int) {
        println("GeneralTank.receiveFuel($liters)")
        value = liters
    }
}
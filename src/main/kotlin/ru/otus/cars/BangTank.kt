package ru.otus.cars

class BangTank: GeneralTank() {
    override fun receiveFuel(liters: Int) {
        println("BangTank.receiveFuel($liters)")
        throw Exception("Bang!")
    }
}
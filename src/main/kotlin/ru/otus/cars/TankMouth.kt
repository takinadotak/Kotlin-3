package ru.otus.cars

abstract class TankMouth {
    fun open() {
        println("TankMouth.open()")
    }
    fun close() {
        println("TankMouth.close()")
    }
    abstract val mouthType: MouthType
    abstract val tank: Tank
}

enum class MouthType {
    LPG_MOUTH,
    PETROL_MOUTH,
    TAZ_MOUTH,
}

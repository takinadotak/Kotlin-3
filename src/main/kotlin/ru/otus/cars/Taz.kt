package ru.otus.cars

object Taz: Car {
    /**
     * Номерной знак
     */
    override val plates: Car.Plates
        get() = throw NotImplementedError("Номера сняты")

    /**
     * Цвет машины
     */
    override val color: String = "Ржавый"

    /**
     * Следит за машиной
     */
    override val carOutput: CarOutput = TazOutput()

    /**
     * Получить оборудование
     */
    override fun getEquipment(): String = "Крыса"

    /**
     * Руль вправо на [degrees] градусов
     */
    override fun wheelToRight(degrees: Int) {
        throw NotImplementedError("Руля нет")
    }

    /**
     * Руль влево на [degrees] градусов
     */
    override fun wheelToLeft(degrees: Int) {
        throw NotImplementedError("Руля нет")
    }

    override val tankMouth: TankMouth = TazMouth()

    override fun toString(): String {
        return "Taz(currentFuelContents=${carOutput.getFuelContents()})"
    }
}

class TazOutput : CarOutput {
    override fun getCurrentSpeed(): Int {
        throw NotImplementedError("There is no speed meter.")
    }

    override fun getFuelContents(): Int {
        return Taz.tankMouth.tank.getContent()
    }
}

class TazMouth : TankMouth() {
    override val mouthType: MouthType = MouthType.TAZ_MOUTH
    override val tank = BangTank()

    fun fuelPetrol(litres: Int) {
        println("TazMouth.fuelPetrol($litres)")
        open()
        tank.receiveFuel(litres)
        close()
    }
}

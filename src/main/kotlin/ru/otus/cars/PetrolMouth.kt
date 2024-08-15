package ru.otus.cars

class PetrolMouth : TankMouth() {
    override val mouthType: MouthType = MouthType.PETROL_MOUTH
    override val tank = GeneralTank()

    fun fuelPetrol(litres: Int) {
        println("PetrolMouth.fuelPetrol($litres)")
        open()
        tank.receiveFuel(litres)
        close()
    }
}

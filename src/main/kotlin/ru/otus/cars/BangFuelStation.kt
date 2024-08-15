package ru.otus.cars

object BangFuelStation : FuelStation {
    override fun refuel(car: Car) {
        try {
            when(car.tankMouth.mouthType) {
                MouthType.LPG_MOUTH -> (car.tankMouth as Vaz2107.LpgMouth).fuelLpg(10)
                MouthType.PETROL_MOUTH -> (car.tankMouth as PetrolMouth).fuelPetrol(20)
                MouthType.TAZ_MOUTH-> (car.tankMouth as TazMouth).fuelPetrol(30)
            }
        } catch (exc: Exception) {
            println("We have a problem: ${exc.message}")
        }
    }
}
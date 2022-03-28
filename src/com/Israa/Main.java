package com.Israa;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Car> theFleets = new ArrayList<>();
        FleetOfCars newFleetOfCars = new FleetOfCars(theFleets);

        AFuelCar vw = new DieselCar("DK1234", "VolksWagen", "passat", 5, 5, false);
        theFleets.add(vw);

        AFuelCar peugeot = new GasolinCar("DK1403", "Peugeot", "206", 5, 19);
        theFleets.add(peugeot);

        ACar skoda = new ElectricCar("DK1809", "Skoda", "ENYAQ iV", 5, 20, 362);
        theFleets.add(skoda);

        System.out.println(newFleetOfCars);
        newFleetOfCars.getTotalRegistrationFeeForFleet();

    }
}

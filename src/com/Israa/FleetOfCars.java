package com.Israa;

import java.util.ArrayList;

public class FleetOfCars
{
    ArrayList<Car> fleet;

    public FleetOfCars(ArrayList<Car> fleet)
    {
        this.fleet = fleet;
    }

    public void addCar(Car car)
    {
        fleet.add(car);

    }

    public int getTotalRegistrationFeeForFleet()
    {
        System.out.println("");

        int fee = 0;
        for (int i = 0; i < fleet.size(); i++)
        {
            fee = fee + fleet.get(i).getRegistrationFee();
            System.out.println("   The car with this registration number: " + fleet.get(i).getRegistrationNumber() + ", costs " + fleet.get(i).getRegistrationFee() + " in registration fee.");
        }
        System.out.println("---\n   The registration fee for all the cars is: " + fee);
        return fee;

    }

    @Override
    public String toString()
    {
        System.out.println("The company has the following cars: ");

        String res = "";

        for (int i = 0; i < fleet.size(); i++)
        {
            res += fleet.get(i);

        }
        return res;
    }


}

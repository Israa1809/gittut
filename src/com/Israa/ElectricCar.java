package com.Israa;

public class ElectricCar extends ACar
{
    private int batteryCapacity;
    private int maxRange;
    private int fee;
    int whPrKm;
    double kmPrLitre;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh()
    {
        return batteryCapacity;
    }

    public int getMaxRangeKm()
    {
        return maxRange;
    }

    public int getWhPrKm()
    {
        whPrKm =   (getBatteryCapacityKWh()*1000) / maxRange;
        kmPrLitre = 100 / (whPrKm / 91.25);

        return (int) Math.round(kmPrLitre);

    }

    public int getRegistrationFee()
    {

        if(kmPrLitre < 5)
        {
            fee = 10470;
        }
        if(kmPrLitre >= 5 && kmPrLitre < 10)
        {
            fee = 5500;
        }
        if(kmPrLitre >= 10 &&  kmPrLitre < 15)
        {
            fee = 2340;
        }
        if(kmPrLitre >= 15 &&  kmPrLitre < 20)
        {
            fee = 1050;
        }
        if(kmPrLitre >= 20)
        {
            fee = 330;
        }
        return fee;
    }

    @Override
    public String toString()
    {
        return super.toString() + "   The batteri capacity: " + batteryCapacity + "\n   The max range: " + maxRange + "\n   Wh/km: " + getWhPrKm();
    }

}

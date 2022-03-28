package com.Israa;

public class DieselCar extends AFuelCar
{
    private boolean particleFilter;
    private int fee;


    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter)
    {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    public String getFuelType()
    {
        return "Diesel";
    }

    public boolean hasParticleFilter()
    {
        if (!particleFilter)
        {
            fee = 1000; // hmm
        }
        return false;
    }
    public int getRegistrationFee()
    {

        if(kmPrLitre < 5)
        {
            fee = 10470 + 15260; // + udligningsafgift
        }
        if(kmPrLitre >= 5 && kmPrLitre < 10)
        {
            fee = 5500 + 2770;
        }
        if(kmPrLitre >= 10 &&  kmPrLitre < 15)
        {
            fee = 2340 + 1850;
        }
        if(kmPrLitre >= 15 &&  kmPrLitre < 20)
        {
            fee = 1050 + 1390;
        }
        if(kmPrLitre >= 20 &&  kmPrLitre < 50)
        {
            fee = 330 + 130;
        }

        return fee;
    }



    @Override
    public String toString()
    {
        return super.toString() + "   Does it have particlefilter: " + particleFilter + "\n";
    }
}

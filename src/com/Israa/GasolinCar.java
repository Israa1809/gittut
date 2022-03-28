package com.Israa;

public class GasolinCar extends AFuelCar
{
    private int fee;

    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre)
    {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    public String getFuelType()
    {
       return "Gasolin";
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
        if(kmPrLitre >= 20 &&  kmPrLitre < 50)
        {
            fee = 330;
        }
        return fee;

    }
    @Override
    public String toString()
    {
        return super.toString() ;
    }


}

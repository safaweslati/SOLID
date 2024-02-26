package com.directi.training.srp.exercise_refactored;


public class CarManager
{

    private DAO _DAO;
    private CarCharacteristics _CarCharacteristics;
    private CarCompare _CarCompare;

    public String getCarsNames()
    {
       return  _CarCharacteristics.getCarsNames(_DAO.getAllCars());
    }

    public Car getBestCar()
    {
        return _CarCompare.getBestCar(_DAO.getAllCars());
    }
}

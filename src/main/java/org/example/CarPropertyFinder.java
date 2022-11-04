package org.example;

public class CarPropertyFinder {

    private Car car;

    public CarPropertyFinder(Car car){
        this.car = car;
    }

    public String getTransmissionLayout(){

        if (car.getModel().equals("Jetta") || car.getModel().equals("i8")){
            return "rear-wheel";
        }
        else {
            return "front-wheel";
        }
    }

    public boolean isClassic(){
        return (car.getYear() < 1998);
    }


}

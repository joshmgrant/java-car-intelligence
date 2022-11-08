package org.example;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.UUID;

public class Car implements Serializable {
    private UUID serialVersionUID;
    private String manufacturer;
    private String model;
    private Integer year;

    public Car(String manufacturer, String model, Integer year){
        serialVersionUID = UUID.randomUUID();
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public Car(){
        this("", "", 0);
    }

    @Override
    public String toString(){
        return String.format("%s,%s,%s", manufacturer, model, year.toString());
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        setManufacturer((String) ois.readObject());
        setModel((String) ois.readObject());
        setYear((Integer) ois.readObject());
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }
}

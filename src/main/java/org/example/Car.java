package org.example;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = 123456789L;
    public String manufacturer;
    public String model;
    public Short year;

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        manufacturer = (String) ois.readObject();
        model = (String) ois.readObject();
        year = (Short) ois.readObject();
    }
}

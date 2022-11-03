package org.example;

import java.io.*;

public class CarDeserializer {

    public Car deserialize(ByteArrayInputStream stream) throws IOException {
        ObjectInputStream ois = new ObjectInputStream(stream);
        try {
            // Casting the result of readObject() occurs after the deserialization process ends
            // which make it possible to read any object and can lead to gadget chain attacks
            return (Car) ois.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

package org.example;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 123456789L;
    public String title;
    public String author;

    public Book(String title, String author) {
        title = title;
        author = author;
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        title = (String) ois.readObject();
        author = (String) ois.readObject();
    }
}

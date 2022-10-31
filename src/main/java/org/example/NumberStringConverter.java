package org.example;

public class NumberStringConverter {

    public static String doubleToString(Double d){
        return d.toString();
    }

    public static Double stringToDouble(String s){
        return Double.parseDouble(s);
    }

}

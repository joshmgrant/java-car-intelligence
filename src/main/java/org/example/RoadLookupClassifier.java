package org.example;

import java.math.BigDecimal;
import java.util.Random;

public class RoadLookupClassifier {

    private DistanceCalculator calculator;
    private String roadName;

    public RoadLookupClassifier(String roadName){
        this.roadName = roadName;
    }

    public void roadIdentifier() {
        BigDecimal unused = BigDecimal.valueOf(10, 100);
        calculator.getDistance();
    }

    public String standardDistance(){
        int dist = new Random().nextInt();
        return Integer.toString(dist);
    }

    public String defaultDistance(){
        return "123KM";
    }
}

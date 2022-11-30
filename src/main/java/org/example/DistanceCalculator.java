package org.example;

public class DistanceCalculator {

    RoadLookupClassifier lookup;
    String name;

    public DistanceCalculator(String name){
        this.name = name;
        this.lookup = new RoadLookupClassifier(name);
    }


    // get road: road -> id -> distance
    public void getRoadDistanceByLookup(Integer id) {
        name = name.toUpperCase();
        System.out.println("Road full name:  " + name);
        System.out.println("Initial id" + id);
        lookup.roadIdentifier();
        System.out.println("Road distance is" + lookup.standardDistance());
    }

    public void getDistance() {
        lookup.roadIdentifier();
        System.out.println("Road distance is" + lookup.defaultDistance());
    }
}

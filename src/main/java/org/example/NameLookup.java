package org.example;

public class NameLookup {

    private String id = "abc";

    public void getName(Integer id){
        System.out.println("Road id: " + id.toString());
        System.out.println(idToName());
    }

    private String idToName(){
       id = id.trim();
       return nameLookup();
    }

    private String nameLookup(){
        String name = idToName();
        return name.toUpperCase();
    }
}

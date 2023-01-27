package org.example;

public class NameLookup {

    private String id = "abc";

    public void getName(Integer id){
        System.out.println("Road id: " + id.toString());
        System.out.println(idToName());
    }

    private String idToName(){
       return id;
    }

    private String nameLookup(){
        return id.toUpperCase();
    }
}

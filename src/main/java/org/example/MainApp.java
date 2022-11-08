package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class MainApp {
    private static final String greeting = """
    Welcome to Car Intelligence! WHat would you like to do? 
    """;

    private static final String options = """
    [C]reate a new entry
    [R]ead all entries
    [U]pdate an entry
    [D]elete an entry
    [P]rint data
    [Q]uit
    """;

    private static final String prompt = ">> ";

    private static final String validOptions = "crudpq";

    private static Scanner scanner;

    private static CarDataQuery db;

    private static void processOption(String optionIn){
        switch (optionIn) {
            case "c": createOption(); break;
            case "r": readOption(); break;
            case "u": updateOption(); break;
            case "d": deleteOption(); break;
            case "p": printOption(); break;
            case "q": {
                System.out.println("Quitting...");
                System.exit(0);
            }
        }
    }

    private static void printOption() {
        System.out.println("Coming soon!");
    }

    private static void createOption(){
        String model;
        String manufacturer;
        String year;
        Car car;

        System.out.println("Create new entry");

        System.out.print("Model: ");
        model = scanner.next();
        System.out.print("Manufacturer: ");
        manufacturer = scanner.next();
        System.out.print("Year: ");
        year = scanner.next();

        car = new Car(model, manufacturer, Integer.parseInt(year));
        System.out.println(car.toString());
    }

    private static void readOption(){
        System.out.println("Read all entries");
        System.out.println("BMW i8 2017");
        System.out.println("Mercedes-Benz A250 2020");
        System.out.println("Volkswagen Beetle 1980");
    }

    private static void updateOption(){
        String model;
        String manufacturer;
        String year;
        Car car;

        System.out.println("Update entry");

        System.out.print("Model: ");
        model = scanner.next();
        System.out.print("Manufacturer: ");
        manufacturer = scanner.next();
        System.out.print("Year: ");
        year = scanner.next();

        car = new Car(model, manufacturer, Integer.parseInt(year));
        System.out.println(car.toString());
    }

    private static void deleteOption(){
        String model;
        String manufacturer;
        String year;
        Car car;

        System.out.println("Delete entry");

        System.out.print("Model: ");
        model = scanner.next();
        System.out.print("Manufacturer: ");
        manufacturer = scanner.next();
        System.out.print("Year: ");
        year = scanner.next();

        car = new Car(model, manufacturer, Integer.parseInt(year));
        System.out.println(car.toString());
    }

    public static void main(String[] argv){

       db = new CarDataQuery();
       db.connect();

        scanner = new Scanner(System.in);
        String option;

        System.out.println(greeting);

        while (true){
            System.out.println(options);
            System.out.print(prompt);
            option = scanner.next().toLowerCase();

            if (validOptions.contains(option)){
                System.out.println("Selection " + option);
                processOption(option);
            }
            else {
                System.out.printf("Invalid option: %s Try again.%n", option);
            }
        }
    }
}

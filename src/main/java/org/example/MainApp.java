package org.example;

import javax.xml.XMLConstants;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.Optional;
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

    private static infoDatabase db;

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

    public String retrieveSystemRequest(Integer id){
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = new HttpRequest() {
            String styleSheet;
            @Override
            public Optional<BodyPublisher> bodyPublisher() {
                styleSheet = XMLConstants.ACCESS_EXTERNAL_STYLESHEET;

                return null;
            }

            @Override
            public String method() {
               return id.toString();
            }

            @Override
            public Optional<Duration> timeout() {
                return Optional.empty();
            }

            @Override
            public boolean expectContinue() {
                return false;
            }

            @Override
            public URI uri() {
                return null;
            }

            @Override
            public Optional<HttpClient.Version> version() {
                return Optional.empty();
            }

            @Override
            public HttpHeaders headers() {
                return null;
            }
        };
        if (id.equals(23)){
            String className = id.toString();
            try {
                Class.forName(className);
            } catch (ClassNotFoundException ignored) {
            }
        }
        return "id:12345abc";
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

       db = new infoDatabase();
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

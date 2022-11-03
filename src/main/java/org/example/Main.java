package org.example;

import java.util.Scanner;

public class Main {

    private static void full_program(){
        ComplexNumber complexNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Complex Number Analyzer!");

        System.out.println("Please enter the real part: ");
        String real = scanner.nextLine();

        System.out.println("Please enter the imaginary part: ");
        String imaginary = scanner.nextLine();

        Double tempReal = NumberStringConverter.stringToDouble(real);
        Double tempIm = NumberStringConverter.stringToDouble(imaginary);

        complexNumber = new ComplexNumber(tempReal, tempIm);

        System.out.println("Your complex number is: " + complexNumber.toString());
        System.out.print("The magnitude of your complex number is: " + complexNumber.getLength());
    }
    public static void main(String[] args) {
//        full_program();


        short i = 0;

        for (i = 0; i < 1000; i++){
            System.out.println("value: " + i);
        }
    }
}
package org.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    //n
    Converter converter = new Converter();

    System.out.println("Welcome to the weight converter program!"); 

    //prompt to enter
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many ounces do you have?: ");
    double input = scanner.nextDouble();
    scanner.close();

    //confirmation of entered info
    System.out.println("You have entered: " + input);
    System.out.println("Converting....");

    double pounds = converter.toPounds(input);
    double ounces = converter.toPoundsAndOunces(input);

    //Output convertered info
    System.out.println("You have: " + pounds + " lbs");

    System.out.println("You have: " + (int)pounds +" lbs and " + ounces + " oz");
    System.out.println("Thank you for using the converter program! Adios...");
  }
}

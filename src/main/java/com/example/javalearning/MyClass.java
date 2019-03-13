package com.example.javalearning;

public class MyClass {
    public static void main(String[] args) {
        String vehicle = "Toyota";
        String make = "Camry";
        String year = "2015";
        String printAccntNumber = "";
        int accountNumber = 1547361;
        System.out.println("My Grandmother gave me her " + year + " " + vehicle + " " + make);

        String uppercase = "Oracle";

        String lowercase = uppercase.toLowerCase();

        System.out.println(uppercase + " " + lowercase);

        //convert number into a string
        printAccntNumber = String.format("You are converting the acctnumber to a string " + accountNumber);
        System.out.println(printAccntNumber);

    }
}

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Exercise 12 Solution
 *  Copyright 2021 Theodore Linardic
 */


package oop.ex12;
import java.util.Scanner;

public class ex12 {
    public static void main( String[] args )
    {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double principal = userInputScanner.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = userInputScanner.nextDouble();
        double correctRate = rate/100;
        System.out.print("Enter the number of years: ");
        int years = userInputScanner.nextInt();

        double endAmount = principal * (1 + (correctRate * years));

        String endAmountFinal = String.format("$%.2f", endAmount);

        System.out.println("After " + years + " years at " + rate + "%, the investment will be worth " + endAmountFinal);
    }
}

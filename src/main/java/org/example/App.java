package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 David Day
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        String wisconsin = "WI";

        System.out.print( "What is the order amount? " );
        double amount = input.nextDouble();

        System.out.print("What is the state? ");
        String state = input.next();

        if (state.equals(wisconsin)) {
            amount = Math.round(amount * 100.0) / 100.0;
            System.out.print("The subtotal is $");
            System.out.printf("%.2f", amount);
            System.out.println();
            double tax = amount * 0.055;
            tax = Math.round(tax * 100.0) / 100.0;
            System.out.println("The tax is $" + tax);
            System.out.print("The total is $");
            System.out.printf("%.2f", (amount + tax));
            System.out.println();
        }
        else {
            amount = Math.round(amount * 100.0) / 100.0;
            System.out.print("The subtotal is $");
            System.out.printf("%.2f", amount);
            System.out.println();
            System.out.print("The total is $");
            System.out.printf("%.2f", amount);
            System.out.println();
        }
    }
}

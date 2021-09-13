/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Nick Cook
 */


import java.util.Scanner;

public class E10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");

        double price_item1 = scan.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        int item1 = scan.nextInt();

        System.out.print("Enter the price of item 2: ");
        double price_item2 = scan.nextDouble();

        System.out.print("Enter the quantity of item 2: ");
        int item2 = scan.nextInt();

        System.out.print("Enter the price of item 3: ");
        double price_item3 = scan.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        int item3 = scan.nextInt();

        double sTotal = (price_item1*item1) + (price_item2*item2) + (price_item3*item3);
        double tax = (sTotal*5.5)/100;
        double total = sTotal+tax;

        System.out.println("Subtotal: $"+sTotal);
        System.out.println("Tax: $"+tax);
        System.out.println("Total: $"+total);

    }
}
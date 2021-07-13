package com.unicorn;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a radius ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

        // condition
        if (radius < 0) {
            System.out.println("Radius cannot be a negative number!");
        } else {
            System.out.println("Great! This is a positive radius");
        }
    }
}

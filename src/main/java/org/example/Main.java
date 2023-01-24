package org.example;


import java.util.Scanner;

public class Main {
    public static void calculateSumScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int value1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int value2 = scanner.nextInt();

        System.out.println(value1 + value2);
    }

    public static boolean isGreater100(int value1, int value2) {
        return (value1 > 100 || value2 > 100);
    }

    public static int calculateSum(int value1, int value2) {
        return value1 + value2;
    }

    public static String printCalculatedSum(int value1, int value2) {
        return "summe: " + value1 + value2;
    }

    public static void main(String[] args) {
        //Aufgabe1
        System.out.println(calculateSum(5, 5));
        //Aufgabe2
        System.out.println(printCalculatedSum(5, 5));
        //Bonus1
        System.out.println(isGreater100(120, 100));
        //Bonus3
        calculateSumScanner();


    }
}
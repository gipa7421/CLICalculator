package com.pavl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isAppFinished = false;
        Scanner scanner = new Scanner(System.in);
        while(!isAppFinished){
            System.out.print("Enter first value: ");
            Double firstValue = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter operation (+-*/): ");
            char operation = scanner.nextLine().charAt(0);

            System.out.print("Enter second value: ");
            Double secondValue = Double.parseDouble(scanner.nextLine());

            double result = 0;

            switch (operation) {
                case '+' -> {
                    result = firstValue + secondValue;
                }
                case '-' -> {
                    result = firstValue - secondValue;
                }
                case '/' -> {
                    result = firstValue / secondValue;
                }
                case '*' -> {
                    result = firstValue * secondValue;
                }
            }

            System.out.println("Result is: " + result);
            System.out.print("Do you want to continue? (y/n): ");
            char shouldContinue = scanner.nextLine().charAt(0);

            if(shouldContinue == 'n'){
                isAppFinished = true;
            }
        }
    }
}

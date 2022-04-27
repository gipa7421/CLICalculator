package com.pavl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isAppFinished = false;
        Scanner scanner = new Scanner(System.in);
        while(!isAppFinished){
            System.out.print("Enter first value: ");

            double firstValue;
            while(true){
                try {
                    firstValue = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.println("Wrong input. Try again");
                }
            }

            System.out.print("Enter operation (+-*/): ");

            char operation;
            while(true){
                operation = scanner.nextLine().charAt(0);
                if(operation == '+' || operation == '-' || operation == '*' || operation == '/'){
                    break;
                }
                System.out.println("Wrong input. Try again");
            }

            System.out.print("Enter second value: ");

            double secondValue;
            while(true){
                try {
                    secondValue = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.println("Wrong input. Try again");
                }
            }

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

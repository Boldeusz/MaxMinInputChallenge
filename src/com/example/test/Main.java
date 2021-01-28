package com.example.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        while (true){

            System.out.println("Enter number");

            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int number = scanner.nextInt();
                System.out.println("Number is: " + number);



                if ((number < minNumber)){
                    minNumber = number;
                }else if ((number > maxNumber)){
                    maxNumber = number;
                }else {
                    break;
                }
                scanner.nextLine();

            }else {
                System.out.println("Invalid number, maxNumber is: "+ maxNumber + " and minNumber is: " + minNumber);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();

    }
}

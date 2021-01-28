package com.example.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //  boolean first = true;

        while (true) {

            System.out.println("Enter number");

            boolean isANInt = scanner.hasNextInt();

            if (isANInt) {
                int number = scanner.nextInt();
                //  if(first){
                //      first = false;
                //     min = number;
                //     max = number;

                //  }


                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;

            }
            scanner.nextLine();


        }
        System.out.println("min= " + min + " , max= " + max);
        scanner.close();
    }
}
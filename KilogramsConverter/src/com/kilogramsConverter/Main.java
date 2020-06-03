package com.kilogramsConverter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        final double KILOGRAM = 0.45359237;
//
//        System.out.print("Type the pounds to convert to Kilograms: ");
//        Scanner scanner = new Scanner(System.in);
//        double userInput = scanner.nextDouble();
//        scanner.close();
//        double finalOutput = userInput * KILOGRAM;
//
//        System.out.println(userInput + " pounds equals to " + finalOutput + " kilograms.");

        double valOne = 20.00;
        double valTwo = 80.00;

        double valOneAndvalTwo = (valOne + valTwo * 100.00) % 40.00;
        System.out.println(valOneAndvalTwo);
        boolean trueOrNot = false;

        if (valOneAndvalTwo == 0) {
            trueOrNot = true;
        }

        System.out.println(trueOrNot);

        if(trueOrNot == false) {
            System.out.println("Got some reminder");
        }


    }
}

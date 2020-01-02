package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // principal question

        Scanner scaner = new Scanner(System.in);
        byte turningInToNumber = 100;
        byte monthsPerYear = 12;

        System.out.print("Prinicpal:");                                                       //P
        int principal = scaner.nextInt();

        // annual interest rate question
        System.out.print("annual interest rate:");
        double monthlyInterest = scaner.nextDouble() / turningInToNumber / monthsPerYear;     //r

        // period (years)
        System.out.print("period (years):");
        byte years = scaner.nextByte();                                                       //n
        int numberOfPayments = years * monthsPerYear;

        // finial result
        double z = 1 + monthlyInterest;                    // z= r*(1+r)
        double zz = Math.pow(z, numberOfPayments);        // zz= r*(1+r)ˇn
        int mortage = (int)(principal* ((monthlyInterest * zz) / (zz-1)));

        double mortageT = principal * (monthlyInterest*Math.pow(1 + monthlyInterest, numberOfPayments))
                        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);



       String mortageFormated = NumberFormat.getCurrencyInstance().format(mortageT);
        System.out.println("Mortgage:" + mortageFormated);
    }
}

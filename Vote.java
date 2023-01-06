package ScannerClass;

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {

        int age;
        System.out.println("Enter your Age :");
        Scanner scanner = new Scanner(System.in);
        age =  scanner.nextInt();

        if (age>=18)
        {
            System.out.println("You are eligible for Vote.");
        }

        else
        {
            System.out.println("Yor are not eligible for Vote.");
        }

    }
}

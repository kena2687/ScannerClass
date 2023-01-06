package ScannerClass;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        int num;
        System.out.println("Enter the number to check Positive,Negative,or Zero :");
        Scanner scanner=new Scanner(System.in);
        num = scanner.nextInt();

        if(num<0)
        {
            System.out.println("This number is Positive.");

        } else if (num<0)

        {
            System.out.println("This number is Negative.");

        }

        else
        {
            System.out.println("The number is Zero.");
        }


    }
}

package ScannerClass;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class OddEven {
    public static void main(String[] args) {

        int n;
        System.out.println("Enter any number :");
        Scanner scanner = new Scanner(System.in);
       n= scanner.nextInt();

       if(n%2==0)

       {
           System.out.println("Even number");

       }

       else
       {
           System.out.println("Odd number");

       }
    }
}

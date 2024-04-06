//Print factorial of given number

import java.util.Scanner;

public class lab2B {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int fact=1, number;
        System.out.print("Enter number to print factorial ");
        number = input.nextInt();

        for(int i=number; i>=1; i--)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of " + fact);
    }
}

//Write a program to print the sum of numbers from 1 to n
package Day_1;

import java.util.Scanner;

public class Q02_SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = n * (n + 1) / 2;

        System.out.println("Sum of numbers 1 to n is : " + sum);
    }
}

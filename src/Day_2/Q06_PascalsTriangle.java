package Day_2;

import java.util.Scanner;

public class Q06_PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            // Print spaces to make triangle shape
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print("  ");
            }

            // Print Pascal’s Triangle values
            for (int j = 0; j <= i; j++) {
                System.out.print(nCr(i, j) + "   ");
            }

            System.out.println();
        }
    }
    static int factorial(int n){
        int fact = 1;
        for(int i = 2; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
    static int nCr(int n, int r){
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

}

// Print multiplication table of any number
package Day_1;

import java.util.Scanner;

public class Q03_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int table = n * i;
            System.out.println(n + " * " + i + " = " + table);
        }

    }
}

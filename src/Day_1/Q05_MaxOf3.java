//Find max of 3 numbers using if-else.
package Day_1;

import java.util.Scanner;

public class Q05_MaxOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.println(n1 +" is maximum");
        }
        else if(n2 > n1 && n2 > n3){
            System.out.println(n2 + " is maximum");
        }
        else{
            System.out.println(n3 + " is maximum");
        }
    }
}

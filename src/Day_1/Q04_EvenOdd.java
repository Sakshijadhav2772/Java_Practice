//Check if number is even or odd using if-else
package Day_1;

import java.util.Scanner;

public class Q04_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isEven(n) ? "Number is even" : "Number is odd");
    }

    static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}

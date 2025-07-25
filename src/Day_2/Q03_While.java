// Count the Number of Digits in a Number Without Using String
package Day_2;

import java.util.Scanner;

public class Q03_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int originalNum = num;
        int count = 0;

        if(num == 0){
            count = 1;
        }
        else{
            while(num > 0){
                num = num / 10;
                count++;
            }
        }

        System.out.println("Number of dogits in this number are : "+ count);
    }
}

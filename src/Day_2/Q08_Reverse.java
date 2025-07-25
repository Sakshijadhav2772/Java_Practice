package Day_2;

import java.util.Scanner;

public class Q08_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reversed = 0;

        while(num > 0){
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println("Reversed number is : " + reversed);
    }
}

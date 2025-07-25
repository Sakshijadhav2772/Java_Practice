package Day_2;

import java.util.Scanner;

public class Q04_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int original = num;
        int count = 0;

        int temp = num;
        while(temp > 0){
            count++;
            temp = temp / 10;
        }
        int sum = 0;
        temp = num;
        while (temp > 0){
            int lastDigit = temp / 10;
            sum = (int) (sum + Math.pow(lastDigit, count));
            temp = temp / 10;
        }

        if(sum == original){
            System.out.println(original + " is an Armstrong number");
        }
        else{
            System.out.println(original + " is not an Armstrong number");
        }

    }

}

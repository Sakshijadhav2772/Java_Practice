package Day_2;

import java.util.Scanner;

public class Q05_PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 are : ");
        for(int i = 1; i <= 100; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }


    }
    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        if(num == 2){
            return true;
        }
        if(num % 2 == 0){
            return false;
        }

        for(int i = 3; i * i < num; i+=2)
        {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}

// Q1. Find the Grade of a Student Based on Marks
package Day_2;

import java.util.Scanner;

public class Q01_Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of a student : ");
        int marks = sc.nextInt();

        if(marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        }
        else if(marks >= 90){
            System.out.println("Grade A");
        }
        else if(marks >= 80 ){
            System.out.println("Grade B");
        }
        else if(marks >= 70){
            System.out.println("Grade C");
        }
        else if(marks >= 60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");
        }
    }
}

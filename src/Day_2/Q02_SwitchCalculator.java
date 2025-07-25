package Day_2;

import java.util.Scanner;

public class Q02_SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Enter operator(+, -, *, /, %) : ");
        char operator = sc.next().charAt(0);

        int result;

        switch (operator){
            case '+':
                result = a + b;
                System.out.println("Result = " + result);
                break;

            case '-':
                result = a - b;
                System.out.println("Result = " + result);
                break;

            case '*':
                result = a * b;
                System.out.println("Result = " + result);
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed");
                } else {
                    result = a / b;
                    System.out.println("Result = " + result);
                }

            case '%':
                if (b == 0) {
                    System.out.println("Error: Modulus by zero is not allowed");
                } else {
                    result = a % b;
                    System.out.println("Result = " + result);
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, /, or %");

        }
    }
}

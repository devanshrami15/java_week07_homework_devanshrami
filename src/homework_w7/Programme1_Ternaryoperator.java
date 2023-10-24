package homework_w7;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme1_Ternaryoperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        isEvenOdd(number);
        scanner.close();
    }

    public static void isEvenOdd(int number) {
        String evenOrOdd = (number % 2 == 0) ? "Even": "Odd";
        System.out.println("The "  +  number + "is " + evenOrOdd);
    }
}

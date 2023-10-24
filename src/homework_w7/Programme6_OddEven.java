package homework_w7;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme6_OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        isEvenOdd(num);
        scanner.close();
    }

    public static void isEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + "is Even Number");
        } else {
            System.out.println(num + "is Odd Number");
        }

    }
}

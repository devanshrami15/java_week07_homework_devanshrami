package homework_w7;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme12_Inputvalues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character: ");
        char ch = sc.next().charAt(0);
        sc.close();

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + "Is this a Alphabet");
        }else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " Is a Degit ");
        } else {
            System.out.println(ch + "Is a special character");

        }
    }
}

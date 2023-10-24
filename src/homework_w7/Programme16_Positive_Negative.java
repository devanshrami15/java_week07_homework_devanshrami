package homework_w7;

import java.util.Scanner;

/**
 *  Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme16_Positive_Negative {
    public static void main(String[] args)
    {
        Programme16_Positive_Negative num = new Programme16_Positive_Negative();
        num.numis();

    }
    public void numis() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num: ");
        int a;
        a = scan.nextInt();

        if (a > 0) {
            System.out.println("is positive number");
        } else if (a < 0)
        {
            System.out.println("is negative number");
        }
        else if (a==0)
        {
            System.out.println("is zero number");
        }
        else
        {
            System.out.println("number is invalid");
        }

    }

}

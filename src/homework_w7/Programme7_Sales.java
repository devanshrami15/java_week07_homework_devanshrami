package homework_w7;
/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
 * Commission
 */

import java.util.Scanner;

public class Programme7_Sales {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Seller's Name:");
        String name = sc.next();

        System.out.print("Enter  seles amount:");
        double amount=sc.nextDouble();

        System.out.print("Enter commissionPercentage:");
        double commissionPercentage=sc.nextDouble();

        double commission=(commissionPercentage/100)*amount;
        System.out.println("Commission amount="+commission);
        sc.close();

    }
}

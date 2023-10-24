package homework_w7;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */
public class Programme2_Leapyear {
    public static void main(String arg[])
    {
        long year;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter  any calendar year :");
        year=sc.nextLong();
        leapOrNot(year);
        sc.close();
    }
    public static void leapOrNot(long year)
    {
        if(year!=0)
        {
            if(year%400==0)
                System.out.println(year+" is a leap year");
            else  if(year%100==0)
                System.out.println(year+" is not a leap year");
            else if(year%4==0)
                System.out.println(year+" is a leap year");
            else
                System.out.println(year+" is not a leap year");
        }
        else
            System.out.println("Year zero does not exist ");
    }
}

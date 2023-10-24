package homework_w7;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Programme13_PrintDays {
    public static void main(String[] args)
    {
        System.out.println("Input any number in between 1to7: ");
        Programme13_PrintDays days = new Programme13_PrintDays();
        days.week();

    }

    public void week()
    {
        Scanner scan = new Scanner(System.in);
        int days = 0;
        days=scan.nextInt();
        switch(days)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.print("Entered week Doesnot Exists");
            scan.close();
        }
    }
}

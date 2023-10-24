package homework_w7;

import java.util.Scanner;

/**
 *
 * Write a java program to input student Name, roll No, and three subjects Math, Science and English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks should between 0 to 100”) and find out total, percentage and result
 *
 */
public class Programme3_StudentDetails {
    public static void main(String[] args) {
        Programme3_StudentDetails details = new Programme3_StudentDetails();
        details.mark();
    }
    public void mark()
    {
        int RollNo;
        int Math;
        int Science;
        int English;
        int Total=0;
        float Percentage;
        boolean Result;
        char Grade;

        System.out.println(" -----------------------------------");
        System.out.println("|                                   |");
        System.out.println("| Mark Sheet                        |");
        System.out.println("|___________________________________|");
        Scanner scan = new Scanner(System.in);
        System.out.println("|Enter your Name:                   |");
        String name = scan.next();
        System.out.println("|Enter your Roll No:                |");
        RollNo = scan.nextInt();
        System.out.println("|___________________________________|");
        System.out.println("| Subjects : Mark                   |");
        System.out.println("|___________________________________|");
        System.out.println("|Enter mark of Math :               |");
        Math = scan.nextInt();
        System.out.println("|Enter mark of Science :            |");
        Science=scan.nextInt();
        System.out.println("|Enter mark of  English :           |");
        English=scan.nextInt();
        System.out.println("|___________________________________|");
        System.out.println("|Enter your Total :                 |");
        Total=Math+Science+English;
        System.out.println(Total);
        System.out.println("|___________________________________|");
        System.out.println("| Percentage :                      |");
        Percentage=Total/3;
        System.out.println(Percentage);
        System.out.println("| Result :                          |");
        if(Percentage>45) {
            System.out.println("Pass");
        }
        else if(Percentage < 45)
        {
            System.out.println("Fail");
        }
        else
        {
            System.out.println("Try next time");
        }
        System.out.println("| Grade :                           |");
        if(Percentage>90){
            System.out.println(" A+ ");
        }
        else if(Percentage>85)
        {
            System.out.println(" A ");
        }
        else if((Percentage<85)&&(Percentage>75))
        {
            System.out.println(" B ");
        }
        else if ((Percentage>50)&&(Percentage<75))
        {
            System.out.println(" C ");
        }
        else
        {
            System.out.println(" D");
        }
        System.out.println("|___________________________________|");
    }
}



package homework_w7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any other alphabet should be invalid entry
 */

public class Programme8_Alphabet {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Programme8_Alphabet city = new Programme8_Alphabet();
        city.AtoF();
    }
    public void AtoF()
    {
        char city ;
        System.out.println("Enter any alphabet 'A'TO'F' : ");
        city = scan.next().charAt(0);
        if (city  == 'A')
        {
            System.out.println("Acton");
        }
        else if (city =='B')
        {
            System.out.println("Brighton");
        }
        else if (city =='C')
        {
            System.out.println("Chelsea");
        }
        else if (city =='D')
        {
            System.out.println("Deptford");
        }
        else if (city =='E')
        {
            System.out.println("Ely");
        }
        else if (city =='F')
        {
            System.out.println("Faringdon");
        }
        else
        {
            System.out.print("Another city name is dosn't exist");
        }



    }
}

package homework_w7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 * 9. Same as above program-8 using switch statement.
 */
public class Programme9_SwitchStatement {
    public static void main(String[] args) {
        //cityName();
        Programme9_SwitchStatement city = new Programme9_SwitchStatement();
        city.cityName();
    }

    public  void cityName() {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter alphabet with starts with A to F :");
        ch = sc.next().charAt(0);

        switch (ch) {
            case 'A':
                System.out.println("Acton");
                break;

            case 'B':
                System.out.println("Brighton");
                break;
            case 'C':
                System.out.println("Chelsea");
                break;
            case 'D':
                System.out.println("Deptford");
                break;
            case 'E':
                System.out.println("Ely");
                break;
            case 'F':
                System.out.println("Faringdon");
                break;

            default:
                System.out.print("Another city name is dosn't exist");
        }
    }


        }


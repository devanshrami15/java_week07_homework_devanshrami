package homework_w7;

import java.util.Scanner;

/**
 *  WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 *  HRA = basic salary 10%
 *  DA = Basic salary 8%
 *  TA = Basic salary 9%
 *  PF= Basic salary 20%
 *
 */
public class Programme5_EmpDetail {
    public static void main(String[] args)
    {
        Programme5_EmpDetail emp = new Programme5_EmpDetail();
        emp.grosssalary();
    }

    float Gross_Salary;

    public void grosssalary() {

        long Employee_Id;
        String Employee_Name;
        float Basic_Salary;
        float HRA, TA, DA, PF;
        float Gross_Salary;


        System.out.println("__________________________________");
        System.out.println("| Salary Slip                    |");
        System.out.println("|________________________________|");
        Scanner scan = new Scanner(System.in);
        System.out.println("| Employee_Id :                  |");
        Employee_Id = scan.nextLong();
        System.out.println("| Employee_Name :                |");
        Employee_Name = scan.next();
        System.out.println("|________________________________|");
        System.out.println("| Basic_Salary :                 |");
        Basic_Salary = scan.nextFloat();
        System.out.println("| HRA 10% :                      |");

        HRA = (Basic_Salary*10/100);
        System.out.println(HRA);
        System.out.println("| TA 8% :                        |");
        TA = (Basic_Salary*8 / 100);
        System.out.println(TA);

        System.out.println("| DA 9% :                        |");
        DA = (Basic_Salary*9 / 100);
        System.out.println(DA);

        System.out.println("| PF -20& :                      |");
        PF = (Basic_Salary*-20 / 100);
        System.out.println(PF);
        System.out.println("|________________________________|");
        System.out.println("| Gross_Salary :                 |");
        Gross_Salary = (Basic_Salary + HRA + TA + DA - PF);
        System.out.println(Gross_Salary);

        System.out.println("|================================|");
    }
}

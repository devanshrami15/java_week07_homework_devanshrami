package homework_w7;

/**
 *    Write a java program to print the numbers between 1 to 100 which can be divided by 3
 *     and 5 separately.
 *
 */
public class Programme11_DivideNumber {
    public static void main(String[] args)
        {
            Programme11_DivideNumber div = new Programme11_DivideNumber();
            div.divide3and5();


        }
        public void divide3and5()
        {

            System.out.println("a number divided by 3: ");
            for (int i=1; i<100; i++)
                if (i%3==0)
                {
                    System.out.println(i +", ");
                }

            System.out.println("a number divided by 5: ");
            for(int i=1;i<100;i++)
            {
                if(i%5==0)
                    System.out.println(i +", ");
            }

            System.out.println("Divided by 3 & 5: ");
            for (int i=1; i<100; i++)
            {
                if (i%3==0 && i%5==0) System.out.print(i +", ");
            }

        }
}

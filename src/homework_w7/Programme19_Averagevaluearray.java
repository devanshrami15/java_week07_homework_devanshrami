package homework_w7;

/*
  Write a Java program to calculate the average value of array elements.
 */

public class Programme19_Averagevaluearray {
    public static void main(String[] args) {
        double[] numArray = { 24.7, 21.1 -45.6, 17.4, 3.3, 75.7 };
        double sum = 0.0;

        for (double num: numArray) {
            sum += num;
        }

        double average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);
    }
}

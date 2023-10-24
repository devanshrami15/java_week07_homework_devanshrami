package homework_w7;

import java.util.Arrays;

/*
    Write a Java program to sum values of an array.
 */
public class Programme18_Sumvalue_array {
    public static void main (String[] args) {
        int [] nums = {1,2,3,4,5};

        // Synatx for sum number of arrays.
        int sum = Arrays.stream(nums).sum();
        System.out.println(sum);
    }
}

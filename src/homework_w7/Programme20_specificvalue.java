package homework_w7;
/*
       Write a Java program to test if an array contains a specific value.
 */

import java.util.stream.IntStream;

public class Programme20_specificvalue {
    public static void main(String[] args) {

        int[] num = {7, 4, 3, 2, 8};
        int specificvalue = 3;

        boolean found = IntStream.of(num).anyMatch(n -> n == specificvalue);

        if(found)
            System.out.println(specificvalue + " is found.");
        else
            System.out.println(specificvalue + " is not found.");

    }
}

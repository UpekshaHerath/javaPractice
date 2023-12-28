/*
 * You have provided with a array of numbers and create a algorithm to remove the duplicates in that array.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int values[] = {3, 4, 5, 7, 4, 3, 7};

        ArrayList<Integer> distinctValues = new ArrayList<Integer>();
        
        // sort the array using bubble sort. No need to sort. Can skip this step
        for (int j = 0; j < values.length - 1; j++) {
            for (int i = 0; i < values.length - 1; i++) {
                if (values[i] > values[i+1]) {
                    int numTemp = values[i];
                    values[i] = values[i+1];
                    values[i+1] = numTemp;
                } 
            }
        }

        System.out.println("Sorted Array : " + Arrays.toString(values));

        for (int i : values) {
            if (distinctValues.contains((Integer)i) == true) {
                continue;
            } else {
                distinctValues.add((Integer)i);
            }
        }

        System.out.println("Distinct Array : " + distinctValues);
        
    }
}
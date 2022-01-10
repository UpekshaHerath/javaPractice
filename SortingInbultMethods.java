import java.util.Arrays;
import java.util.Collections;

class SortingInbultMethods{
    public static void main(String[] args){

        Integer[] numbers = {23,4,6,1,89};
        System.out.println("The array before sorting : " + Arrays.toString(numbers));
        Arrays.sort(numbers, Collections.reverseOrder());  //collections class not support the premitive data types
        System.out.println("The arrays after sorting : " + Arrays.toString(numbers));
    
    }
}
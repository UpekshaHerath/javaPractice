import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;

public class ArrayEvenOddSelection {
    public static void main(String[] args){
        int[] numbers = {1,2,4,5,10,11};
        List<Integer> evenResult = new ArrayList<Integer>();
        List<Integer> oddResult = new ArrayList<Integer>();

        OddEvenFinding(numbers, evenResult, oddResult);

    }

    public static void OddEvenFinding (int[] numbers, List<Integer> evenResult, List<Integer> oddResult) {
        for(int i = 0; i < numbers.length ; i++){
            if(numbers[i] % 2 == 0){
                evenResult.add(numbers[i]);
            }
            else {
                oddResult.add(numbers[i]);
            }
        }
        System.out.println("Even number are : ");
        System.out.println(evenResult);

        System.out.println("Odd number are : ");
        System.out.println(oddResult);
    }
}
import java.util.Scanner;
import java.util.Arrays;
public class Temporary{
    public static void main(String[] args){
        Scanner takeInput = new Scanner(System.in);
        //calling the getTheSumOfArray() function in the name class
       
        System.out.print("Give the number of integers which you need to add \n(Maximum of 20) : ");
        int numberOfNumbers = takeInput.nextInt();
        int[] numbers = new int[20];
        for(int j = 0 ; j < numberOfNumbers ; j++){
            System.out.println("Give the number : ");
            numbers[j] = takeInput.nextInt();
        }
        
       System.out.println("The user given array is : " + Arrays.toString(numbers));

       Name name = new Name();
       System.out.printf("The sum of the array x is : %d", name.getThesumOfArry(numbers));      
    }
    
}
class Name{
    public int getThesumOfArry(int[] x){
        int sum = 0;
        for (int i = 0 ; i < x.length ; i++) {
            sum = sum + x[i];
        }
        return sum;
    }
}

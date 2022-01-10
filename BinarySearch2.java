//There is a inbuilt method to use tha binary search......
import java.util.Scanner;
import java.util.Arrays;
class BinarySearch2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number which you need : ");
        int value = input.nextInt();

        int[] numbers = {1,2,3,4,5,6};
        boolean flag = false;
        int mid,lowerBound,hierBoud;
        lowerBound = 0;
        hierBoud = numbers.length-1;

        while(lowerBound <= hierBoud){
            mid = (lowerBound + hierBoud)/2;
            if(numbers[mid] == value){
                System.out.println("The value found");
                flag = true;
                break;
            }
            if(numbers[mid] < value){
                lowerBound = mid + 1;
            }            
            if(numbers[mid] > value){
                hierBoud = mid - 1; 
            }
        }
        if(flag == false){
            System.out.println("The value not found");
        }



        
        



    }
}
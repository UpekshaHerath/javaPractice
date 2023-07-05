/*
 * Write a programe to check whether a given number is a palindrome number or not 
 */
import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the interger which you need to check : ");
        int value = input.nextInt();

        int temp = value;
        int reversedNumber = 0;
        while (temp != 0) {
            int lastNumber = temp % 10; // give the last number of the integer
            temp /= 10;
            reversedNumber = reversedNumber * 10 + lastNumber; 
        }
        System.out.println("Reversed number : " + reversedNumber);

        if (value == reversedNumber) {
            System.out.println("Number is a palindrome number.");
        }
        else {
            System.out.println("Number is not a palindrom number.");
        }
    }
}

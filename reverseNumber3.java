/*
 * Reversing a number using String builder class
 */
import java.util.Scanner;

public class reverseNumber3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the integer which need to reverse : ");
        int value = input.nextInt();

        StringBuilder sb = new StringBuilder(String.valueOf(value));
        sb.reverse();
        System.out.println("Reverse value of given int is : " + sb);
    }
}

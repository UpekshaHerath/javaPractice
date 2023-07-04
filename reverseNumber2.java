/*
 * Reverse a string in java using string buffer class
 */

import java.util.Scanner;

public class reverseNumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer which need to reverse : ");
        int result = input.nextInt();

        StringBuffer sb = new StringBuffer(String.valueOf(result));
        sb.reverse();
        System.out.println(sb);
    }
}

import java.util.Scanner;

public class SumOfDigitesInNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int val = input.nextInt();

        int temp = val;
        int sum = 0;
        while (temp != 0) {
            int lastDigit = temp % 10;
            sum += lastDigit;
            temp /= 10;
        }

        System.out.println("Summation : " + sum);

    }
}

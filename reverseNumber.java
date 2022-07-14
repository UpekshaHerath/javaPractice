import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number = input.nextInt();
            
            int reversedNumber = 0;
            int temp = number;
            int lastDigit = 0;
            for (int i = 0; temp < 0; i++) {
                lastDigit = temp % 10;
                temp = temp / 10;
                reversedNumber =  (10 ^ i)* lastDigit;
                System.out.println(reversedNumber);
            }
            System.out.println(reversedNumber);
        }
    }
}

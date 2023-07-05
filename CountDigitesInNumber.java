import java.util.Scanner;

public class CountDigitesInNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number which you need to count : ");
        int userInput = input.nextInt();

        int temp = userInput;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        System.out.println("The number is values in the integer : " + count);
    }
}

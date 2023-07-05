import java.util.Scanner;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int val = input.nextInt();

        int temp = val;
        int oddCount = 0;
        int evenCount = 0;

        while (temp != 0) {
            int lastValue = temp % 10;
            if (lastValue % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            temp /= 10;
        }

        System.out.println("Even count : " + evenCount);
        System.out.println("Odd count : " + oddCount);
    }
}

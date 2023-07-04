import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int value = input.nextInt();
        System.out.println(reverse(value));
        input.close();
    }
    public static int reverse(int valueToReverse) {
        int temp = valueToReverse;
        int newNumber = 0;
        while (temp != 0) {
            int lastNum = temp % 10; // this will take the last number
            temp = temp / 10; // remove the last number
            newNumber = newNumber * 10 + lastNum;
        }
        return newNumber;
    }

    
}

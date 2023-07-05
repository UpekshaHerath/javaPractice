import java.util.Scanner;

public class FactorialInDecendingOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int inputValue = input.nextInt();

        int factorialValue = 1;
        for (int i = inputValue; i >= 1; i--) {
            factorialValue *= i;
        }

        System.out.println("Factorial value is : " + factorialValue);
    }
}

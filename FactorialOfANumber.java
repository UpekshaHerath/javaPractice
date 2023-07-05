import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int inputValue = input.nextInt();

        int factorialValue = 1;
        for (int i = 1; i <= inputValue; i++) {
            factorialValue *= i;
        }

        System.out.println("Factorial value is : " + factorialValue);
    }
}

import java.util.Scanner;

public class CheckPrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer : ");
        int val = input.nextInt();

        if (val < 1) {
            System.out.println("Not a prime number");
            return;
        }

        int count = 0; // how many times devided ??
        for (int i = 1; i <= val; i++) {
            if (val % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("This is not a prime number");
        }
        

    }
}

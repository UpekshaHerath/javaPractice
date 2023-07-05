import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String which you need to check : ");
        String userInput = input.nextLine();

        String reversedString = "";
        char userInputCharArray[] = userInput.toCharArray();

        for (int i = userInputCharArray.length - 1; i >= 0; i--) {
            reversedString += userInputCharArray[i];
        }

        System.out.println("Reversed Strig is : " + reversedString);

        if (userInput.equals(reversedString)) {
            System.out.println("This is a palindrom String");
        } else {
            System.out.println("This is not a palindrom String");
        }




    }
}

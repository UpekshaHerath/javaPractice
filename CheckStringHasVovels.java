import java.util.Scanner;
public class CheckStringHasVovels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String userInput = input.nextLine();

        int count = 0;
        for (int i = 0; i < userInput.length(); i++) {
            int cv = userInput.charAt(i);
            if (cv== 'a' || cv == 'e' || cv == 'i' || cv == 'o' || cv == 'u') {
                count++;
            }
        }

        System.out.printf("The string has %d number of vovels.", count);
    }
}

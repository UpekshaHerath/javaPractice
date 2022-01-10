import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String[] args) {
        /*
        * Sum have to take as a input from the user.
        * You have provided with an array of int
        * when adding any of the two elements in that array if the user inputted sum come,
        * Then those two values should be output
        * The array which you have is => int arr[] = {2, 7, 11, 15};
        * */
        Scanner input = new Scanner(System.in);
        int sum = input.nextInt();

        int arr[] = {2, 7, 11, 15};

        AddTwoNumbers atn = new AddTwoNumbers();
        int[] answer = atn.addTwoNumbers(arr, sum);

        for (int num : answer) {
            System.out.println(num);
        }
    }

    private int[] addTwoNumbers(int[] arr, int sum) {
        int[] answer = new int[2];
            for (int j = 0; j < arr.length - 1; j++) {
                for (int i = j + 1; i < arr.length; i++) {
                    if (arr[j] + arr[i] == sum) {
                        answer[0] = arr[j];
                        answer[1] = arr[i];
                        break;
                    }
                }
            }
        return answer;
    }
    
}

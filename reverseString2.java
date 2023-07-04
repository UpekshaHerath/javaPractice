/*
 * Reverse a String using char array
 */
public class reverseString2 {
    public static void main(String[] args) {
        String input = new String("ABCDE");

        char arr[] = input.toCharArray(); // convert the string in to a charactor array
        String reversedString = "";

        for (int i = arr.length-1; i >= 0; i--) {
            reversedString += arr[i];
        }

        System.out.println(reversedString);
    }
}

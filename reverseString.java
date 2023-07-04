/*
 * Reverse a string using string charAt() function and length() function
 */
public class reverseString {
    public static void main(String[] args) {
        String str = "ABCD";
        String reverse = new String();

        // first need to find out the length of the string 
        int length = str.length();

        for (int i = length-1; i >= 0; i--) {
           reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed String is : " + reverse);
        
    }
}

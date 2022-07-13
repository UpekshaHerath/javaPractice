import static java.lang.System.out;
public class swapTwoNumbers {
    public static void main(String[] args) {
        out.println("Initial values ");
        int val1 = 1;
        int val2 = 2;
        out.println("val1 : " + val1 + "\nval2 : " + val2);

        int temp = val1;
        val1 = val2;
        val2 = temp;
        out.println("After Swapping \nval1 : " + val1 + "\nval2 : " + val2);
    }
}

public class SwapTwoNumbers2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("a : %d, b = %d\n", a, b);

        a = a + b; // a = 30 b = 20
        b = a - b; // b = 10
        a = a - b; // a = 20

        System.out.printf("a : %d, b = %d\n", a, b);
    }
}

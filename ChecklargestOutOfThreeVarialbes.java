public class ChecklargestOutOfThreeVarialbes {
    public static void main(String[] args) {
        int a = 10, b = 30, c = 5;

        if (a > b && a > c) {
            System.out.println("a is the largest");
        } 
        if (b > a && b > c) {
            System.out.println("b is the largest");
        }
        if (c > a && c > b) {
            System.out.println("c is the largest");
        }
    }
}

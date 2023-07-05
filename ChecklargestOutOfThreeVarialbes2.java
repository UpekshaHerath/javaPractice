public class ChecklargestOutOfThreeVarialbes2 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 40;

        int largestValue1 = (a > b) ? a : b;
        int largestValue2 = c > largestValue1 ? c : largestValue1;

        // in a single line the same above code
        // int largestValue2 = c > ((a > b) ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("largest value is : " + largestValue2); 
    }
}

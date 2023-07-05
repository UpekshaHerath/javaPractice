public class SumOfArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 7, 10};

        int sum = 0;
        for(int i: arr) {
            sum += i;
        }
        System.out.println("Sum of the array is : " + sum);
    }
}

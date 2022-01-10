import java.io.BufferedReader;
import java.io.InputStreamReader;
class LinearSearch{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number you want to find: ");
        int given = Integer.parseInt(input.readLine());
        int[] a = {2, 4, 5, 7, 9};

        int counter = 0;
        for(int i = 0; i < a.length; i++) {
            if (a[i] == given) {
                System.out.println("The number is in this array's " + (i+1) + " place");
                counter++;
            } else {
                continue;
            }
        }

        if (counter != 1) {
            System.out.println("The number is not precent inside this array...");
        }
    }
}
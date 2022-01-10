import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.*;
class BinarySearch{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        out.print("Input the number : ");
        int key = Integer.parseInt(input.readLine());

        int[] a = {1, 3, 5, 8, 9, 10};
        boolean flag = false;

        int heigherBound = a.length - 1;
        int lowerBound = 0;
        
        int m = 0;
        
        while(lowerBound <= heigherBound) {
            m = (lowerBound + heigherBound) / 2;

            if (a[m] == key) {
                out.println("The value is in this array");
                flag = true;
                break;
            }

            if (a[m] < key)
                lowerBound = m+1;
            
            if(a[m] > key)
                heigherBound = m-1;
            
        }

        if (flag == false)
            out.println("Element not found...");
    
    }
}
/*## This programe checkes is there any duplicates in a given array ?
 * If the given array have atleast two duplicate values this will give "true" 
 * else it will give "false"
 */
public class duplicate {
    public static void main(String[] args) {
        int numbers[] = {2, 3, 8, 10, 12, 12};
        System.out.println(havingDuplicates(numbers));
    }

    public static boolean havingDuplicates(int[] numbers) {
        for (int j = 0; j < numbers.length; j++) {
            int firstValue = numbers[j];
            for (int i = 0; i < numbers.length; i++) {
                if (i == j)
                    continue;
                if (firstValue == numbers[i])
                    return true;
            }
        }
        return false;
    }
}

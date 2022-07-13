public class twoSum {
    public static void main(String[] args) {
        int numbers[] = {2, 3, 5};
        int sumation = 8;
        twoSumMatching(numbers, sumation);

    }

    public static void twoSumMatching(int numbers[], int sum) {
        for (int i = 0; i < numbers.length; i++) {
            int firstValue = numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                int sumation = firstValue + numbers[j];
                if (sumation == sum) {
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
    }
}

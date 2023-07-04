public class duplicate2 {
    public static void main(String[] args) {
        int numbers[] = {2, 3, 8, 10, 12, 12};
        if (checkDuplicates(numbers)) {
            System.out.println("Yes has duplicate values");
        } else {
            System.out.println("Do not have duplicate values");
        }
    }

    public static boolean checkDuplicates(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = i+1; k < arr.length; k++) {
                if (arr[i] == arr[k]) {
                    return true;
                }
            }
        }
        return false;
    }
}

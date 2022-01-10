import java.util.Arrays;

class BubbleSort{
    public static void main(String[] args){
        
        //out put must be like this in trigonakki sereas
        //0,1,1,2,3,5,8,13,21
       
        //bubble sort 
        int[] numbers = {15,3,10,6,80};

        System.out.println("Array before sorting : " + Arrays.toString(numbers));
       
        System.out.println("The swaped array is : " + Arrays.toString(bubbleSort(numbers)));

    }

    public static int[] bubbleSort (int numbers[]) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] >= numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

}
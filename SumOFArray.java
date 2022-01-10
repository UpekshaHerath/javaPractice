class SumOfArray{
    public static void main(String[] args){
        int[] numbers = {1,2,5,34,50};

        int sum = 0;

        for(int i = 0; i < numbers.length ; i++){
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
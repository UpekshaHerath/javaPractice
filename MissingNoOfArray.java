class MissingNoOfArray{
    public static void main(String[] args){
        //This is the correct array..
        int[] a = {1,3,5,7};
        //This is the missing array (only one number has missed)
        int[] b = {1,3,7};

        int sum1 = 0;
        
        for(int j=0; j < a.length; j++){
            sum1 = sum1 + a[j];
        }
        //took the sum of all the numbers in the first Array

        int sum2 = 0;
        for(int i=0; i< b.length; i++){
            sum2 = sum2 + b[i];
        }
        //took the sum of all the numbers in the second Array

        System.out.println((sum1-sum2) );

        
           
        
    }
}
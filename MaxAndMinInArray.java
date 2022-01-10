public class MaxAndMinInArray{
    public static void main(String[] args){

        int[] a = {1,3,5,40};

        //finding the maximum value
        int max = a[0];

        for(int i = 0 ; i < a.length ; i++ ){
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println(max + " is the maximum value");

        //finding the minimum value
        int min = a[0];

        for(int j = 0 ; j < a.length; j++){
            if(a[j]<min){
                min = a[j];
            }
        }
         System.out.println(min + " is the minimum value");
    }
}
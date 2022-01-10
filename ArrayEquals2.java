import java.util.Arrays; //Must have to import this class
class ArrayEquals2{
    public static void main(String[] args){
        int[] a = {1,2,4,5,6, 40};
        int[] b = {1,2,4,5,6,4};

        String[] b1 = {"Upe" , "Dil" , "Herath"};
        String[] b2 = {"Upe" , "Dil" , "Herath"};
 

       
        System.out.println(Arrays.equals(b1,b2));
        //This is a static function and there fore have to use with the class name.....

        

    }
}
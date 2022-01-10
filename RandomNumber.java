//How To Generate Random Numbers & Strings 
import java.util.Random;
public class RandomNumber{
    public static void main(String[] args){
        Random randInt = new Random();
        int i = randInt.nextInt(100);
        System.out.println(i);
        

    }
}
import java.util.Scanner;
class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int givenNum = sc.nextInt();

        long mul = 1;

        for(long i = 1; i <= givenNum ; i++){
            mul = mul * i;


        }
        System.out.println(mul);

    }
}
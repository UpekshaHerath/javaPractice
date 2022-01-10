import java.util.Scanner;
class Prime{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int counter = 0;

        for( int i = 1; i<= num ; i++){
            if(num % i == 0){
                counter++;
            }
        }
        if(counter == 2){
            System.out.println("This is a prime number.");
        }
        else{
            System.out.println("This is not a prime number.");
        }

    }
}
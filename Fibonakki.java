/*0 + 1 = 1
1 + 1 =   2
1 + 2 =   3
2 + 3 =   5
3 + 5 =   8
5 + 8 =   13
8 + 13 =  21
13 + 21 = 34*/
class Fibonakki{
    public static void main(String[] args){
        int n1 = 0, n2 = 1, sum = 0;

        for(int i = 2; i < 10; i++){
            sum = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + sum);
            
           n1 = n2;
           n2 = sum;
        }




    }



}
import static java.lang.System.out;
class Trigonakki{
	/*This progrme will print first 10 values of the 
	trigonakki series 
	0 , 1 , 1 , 2 , 3 , 5 , 8 ,13 ,21 ,34 ,55 ,89 */
	
	public static void main(String[] args){

		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		out.print(num1 + " ");
		out.print(num2 + " ");
		
		for(int i = 0; i < 10; i++){

			
			
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			
			out.print(num2 + " ");

	

		}

	}

}
import java.util.Scanner;

//Accept a term from user and print Fibonacci series.
public class Question_04 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter A Number");
	
	int num=sc.nextInt();
	 int num1=0;
	 int num2=1;
	for(int i=1;i<=num;i++) {
		System.out.println(num1);
		
		int num3=num1+num2;
		
		num1 =num2;
		num2=num3;
		
				
	}
	
	
}
}

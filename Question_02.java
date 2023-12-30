import java.util.Scanner;

/*Accept a start number from user and 
 * end number from user. Print all odd number between
start and end number. [ Two Answer]*/
public class Question_02 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	
	int num=sc.nextInt();
	System.out.println("Last number");
	int num2= sc.nextInt();
	
	for(int i=num;i<num2;i++) {
		
		if(i%2!=0) {
			System.out.println(i);
		}
		
	}
	
	
	}
}

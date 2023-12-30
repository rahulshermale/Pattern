import java.util.Scanner;

/*Accept a number from user - if it is divisible by 3 print “fun” ,
 *  if it is divisible by 7 print “buzz”
and if it is divisible by both(3,7) 
print “fun -buzz” . [Two answer]*/
public class Question_01_a {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A Number ");
	int number=sc.nextInt();

	if((number % 3 == 0)&&number % 7 == 0) {
		System.out.println("fun -buzz");
		}
	
	else if(number % 3 == 0) {
		System.out.println("fun");
	}
	else if(number % 7 == 0) {
		System.out.println("buzz");
		
	}
	
	}
	
}


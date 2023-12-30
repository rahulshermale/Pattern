import java.util.Scanner;

public class Question_03 {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.print("Enter a number: ");
     int number = scanner.nextInt();
     
     int oNum = number, rev = 0;
     
     while (number != 0) {
         rev = rev * 10 + number % 10;
         number /= 10;
     }
     
     System.out.println(oNum + (oNum== rev ? " is a palindrome number." : " is not a palindrome number."));
 }
}




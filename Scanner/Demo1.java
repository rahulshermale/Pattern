package Scanner;

import java.util.Scanner;

public class Demo1 {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Num from user :");
	int num=sc.nextInt();
	
//	System.out.println(num);
	System.out.println("Enter the name frm user");
	String name=sc.next();
//	10System.out.println(name);
	
	String name1=System.console().readLine();
	
	System.out.println(name+num+name1);
	
}
}

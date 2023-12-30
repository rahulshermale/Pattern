package Scanner;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

public class Leap_year {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	boolean is_leap_year=false;
	System.out.println("Enter the Year :");
	int year=sc.nextInt();
	
	if((year%400==0)||((year%4==0)&&(year%100!=0))){
		System.out.println(year+"Is Leap Year");
		}
	else
		System.out.println("Not yet:");

}

}

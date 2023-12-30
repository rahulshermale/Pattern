package Scanner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Largest_Num {

	public static int Largest_Num(int a,int b,int c) {
		
		if(a>=b&& a>=c) {
			return a;
		}
		if(b>=a&&b>=c) {
			return b;
		}
		else
		return c;
		
	}
	public static void main(String[] args) {

		int a,b,c,largest;
		a=10;
		b=20;
		c=50;
		largest= Largest_Num(a,b,c);
		System.out.println(largest);
		
	ArrayList<Integer> x=new ArrayList<>();
	x.add(a);
	x.add(b);
	x.add(c);
	
	System.out.println(Collection.class);
	
	
	}

}


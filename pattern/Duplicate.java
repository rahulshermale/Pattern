package pattern;

import java.util.Arrays;
//import java.util.HashSet;
import java.util.Scanner;
//import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,3,4,2,7,9,4,3,1,2};
		int[] brr =new int[arr.length];
//		Set<Integer> s=new HashSet<>();
//		for(int num:arr) {
//			s.add(num);
//		}
//        System.out.println(s);
		
		Arrays.sort(arr);
		int j=0;
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println("________");
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1])
				brr[j++]=arr[i-1];
			if(i==arr.length-1&&arr[arr.length-1]!=arr[arr.length-2])
				brr[j]=arr[arr.length-1];
				
		}
		for(int num:brr) {
			System.out.print(num+" ");
		}
	}

}

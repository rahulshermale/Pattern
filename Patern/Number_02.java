package Patern;



public class Number_02 {
	public static void main(String[] args) {
		int n = 5;
		int count = 1;
		for (int i = 1; i < n; i++) {
			for(int j=1;j<n;j++) {
				if(count<10) {
					System.out.print("0");
				}
				System.out.print(i*j +  " ");
			}
	System.out.println();
		}
	}

}

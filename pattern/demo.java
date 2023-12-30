package pattern;

public class demo {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i + j == 8 || i == j) {
					System.out.print("*");
				}
				else
					System.out.print(" ");

			}
			System.out.println();
		}
		//System.out.println();
	}

}

package recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N: ");
		int n = s.nextInt();
		int result = fact(n);
		System.out.println(result);
		s.close();
	}
	
	private static int fact(int n) {
		if(n == 0 || n == 1) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}
}

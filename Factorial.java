package Set1;

import java.util.*;

public class Factorial {

	static int fact(int n) {
		int factorial = 1;
		if (n == 1 || n == 0) {
			return 1;
		}
		factorial = n * fact(n - 1);
		return factorial;
	}

	static void factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial = " + fact);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println(" Enter number");
			int num = sc.nextInt();
			if(num < 0)
			{
				System.out.println("Complex number");
				System.exit(0);
			}
			else
			factorial(num);
			System.out.println(" Factorial of " + num + " is " + Factorial.fact(num));
		}

		catch (Exception e) {
			System.out.println("Wrong input");
			System.exit(0);
		}
		sc.close();
	}

}

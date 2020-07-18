package Set1;

import java.util.*;

public class Biggest {
	static int getMax(int a, int b, int c) {
		if (a == b && b == c) {
			System.out.println("All the values are same!");
			System.exit(0);
		}
		if (a > b && a > c)
			return a;
		else if (b > a && b > c)
			return b;
		else
			return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 values");
		try {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Biggest number is : " + Biggest.getMax(a, b, c));
		}catch(Exception e)
		{
			System.out.println("Error!!");
			System.out.println(e);
		}
		sc.close();
	}

}

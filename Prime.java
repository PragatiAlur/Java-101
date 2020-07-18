package Set1;

import java.util.*;

public class Prime {
	
	public static boolean isPrime(long num) {
		for (int i = 1; i < num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println(" Enter number of values you want to enter");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(" Enter value to check is Prime or not :");
			long num = sc.nextLong();
			if (num < 0)
				System.out.println("Cannot find isPrime or not for negative value");
			else {
				if (isPrime(num))
					System.out.println(num + " is Prime");
				else
					System.out.println(num + " not prime");
			}
		}
		}catch(Exception e)
		{
			System.out.println("Erorr!!");
			System.out.println(e);
		}
		sc.close();
	}
}

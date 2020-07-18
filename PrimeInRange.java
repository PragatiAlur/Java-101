package Set1;

import java.util.*;

public class PrimeInRange {
	static boolean isPrime(int num) {
		if (num == 0 || num == 1)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter range ");
			int start = sc.nextInt();
			int end = sc.nextInt();
			int count = 0;
			
			if (start < 0 && end < 0) {
				System.out.println("Cannot find prime number of negative number");
			} else if (start < 0) {
				start = 0;
			}
			int[] arr =new int[end-start];
			for (int i = start; i <= end; i++) {
				if (isPrime(i)) {
					arr[count] = i;
					count++;
				}
			}
			int i=0;
			if (count == 0)
				System.out.println("(empty list)");
			else
			{
				while(i<count-1)
				{
					System.out.print(arr[i]+" , ");
					i++;
				}
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println("Erorr");
			System.out.println(e);
		}
		sc.close();
	}
}

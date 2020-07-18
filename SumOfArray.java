package Set1;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
		System.out.println(" Please enter size of array ");
		int size = sc.nextInt();
		int sum = 0;
		int[] arr = new int[size];
		System.out.println(" Enter elements of array ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
			sum = arr[i] + sum;
		}
		System.out.println("Sum = " + sum);
		}catch(Exception e)
		{
			System.out.println("Error!!!");
			System.out.println(e);
		}

		sc.close();
	}

}

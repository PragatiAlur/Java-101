package Set1;

import java.util.*;

public class BubbleSort {
	static int count = 0;

	static void sort(int[] arr, int size) {
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				System.out.println("Elements being compared are :" + arr[j] + " and " + arr[j + 1]);
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					count++;
				}
				System.out.println("Next pass");

			}
		}
		System.out.println("Number of passs required " + count);
	}

	static void print(int[] arr, int size) {
		System.out.println("Array after bubble sort");
		for (int i = 0; i < size; i++)
			System.out.println(arr[i]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter size");
		int size = sc.nextInt();
		if(size<1)
		{
			System.out.println("Size too small");
			System.exit(0);
		}
		else {
		System.out.println("Enter array elements");
		int[] arr = new int[size + 1];
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		sort(arr, size);
		print(arr, size);
		}
		}catch(Exception e)
		{
			System.out.println("Erorr!!");
			System.out.println(e);
		}
		sc.close();

	}

}

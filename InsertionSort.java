package Set1;

import java.util.Scanner;

public class InsertionSort {
	void insertion(int[] array) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
		for (int i = 0; i < n; i++)
			System.out.println(array[i]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter array size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println(" Enter elements ");
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		InsertionSort is = new InsertionSort();
		is.insertion(arr);
		sc.close();
	}
}

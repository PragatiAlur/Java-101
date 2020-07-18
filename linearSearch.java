package Set1;

import java.util.*;

public class linearSearch {

	boolean search(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i])
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Array Size");
		try {
			int size = sc.nextInt();
			if (size < 1) {
				System.out.println("Size too small");
			} else {
				System.out.println("Array elements");
				int[] arr = new int[size];
				for (int i = 0; i < size; i++)
					arr[i] = sc.nextInt();
				linearSearch s = new linearSearch();
				System.out.println("Enter key to be searched");
				int key = sc.nextInt();
				sc.close();
				if (s.search(arr, key))
					System.out.println("Found");
				else
					System.out.println("Not found");
			}
		} catch (Exception e) {
			System.out.println("Error!!!");
			System.out.println(e);
		}

	}

}

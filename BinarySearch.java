package Set1;

import java.util.Scanner;

public class BinarySearch {

	static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 0; j < arr.length - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	boolean binaryInt(int arr[], int key) {
		int start, end, mid;
		start = 0;
		end = arr.length;

		while (start < end) {
			mid = (start + end) / 2;
			if (key == arr[mid]) {

				return true;
			} else if (key < arr[mid]) {
				end = mid ;
			} else {
				start = mid ;
			}
		}
		return false;
	}

	boolean binaryString(String a[], String key) {
		int start, end, mid;
		start = 0;
		end = a.length;
		while (start < end) {

			mid = (start + end) / 2;
			int res = a[mid].compareToIgnoreCase(key);
			//System.out.println("res =" + res);
			if (res == 0) {
				return true;
			} else if (res < 1) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			res = 0;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinarySearch b = new BinarySearch();
		try {
		System.out.println(" 1.Interger \n 2.String");
		System.out.print(" Please enter your choice :(1 or 2) ");
		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			System.out.println(" Enter array size");
			int size = sc.nextInt();
			if(size < 1)
			{
				System.out.println("Size too small");
				System.exit(0);
			}
			else {
			System.out.println(" Enter array elements");
			int[] arr = new int[size];
			for (int i = 0; i < size; i++)
				arr[i] = sc.nextInt();
			System.out.println(" Enter key to be searched");
			int key = sc.nextInt();
			sort(arr);
			if (b.binaryInt(arr, key))
				System.out.println(key + " is found.");
			else
				System.out.println(key + " is not found.");
			break;
			}
		case 2:
			System.out.println(" Enter String length ");
			int value = sc.nextInt();
			if(value < 1)
			{
				System.out.println("Size too small");
				System.exit(0);
			}
			else {
			System.out.println(" Enter key String ");
			String v = sc.next();
			String[] a = new String[value];
			System.out.println(" Enter Strings");
			for (int i = 0; i < value; i++) {
				a[i] = sc.next();
			}
			if (b.binaryString(a, v) == true)
				System.out.println(v + " is found.");
			else
				System.out.println(v + " is not found");
			break;
			}
		default:
			System.out.println(" Bad input! Sorry");
		}
		}catch(Exception e)
		{
			System.out.println("Error!!");
			System.out.println(e);
			System.exit(0);
		}
		sc.close();
	}
}

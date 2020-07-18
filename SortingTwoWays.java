package Set1;

import java.util.*;

public class SortingTwoWays {

	static void insertionSort(int[] array) {
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
	}
	
	static void insertionString(String[] array)
	{
		int i;
		String key;
		for (int j = 1; j < array.length; j++) { 
		    key = array[j];
		    i = j - 1;
		    while (i >= 0) {
		      if (key.compareTo(array[i]) > 0) {
		        break;
		      }
		      array[i + 1] = array[i];
		      i--;
		    }
		    array[i + 1] = key;
		    
		  }
	}

	static void bubbleSort(String[] str) {
		String temp;
		for (int j = 0; j < str.length; j++) {
		   	   for (int i = j + 1; i < str.length; i++) {
				if (str[i].compareTo(str[j]) < 0) {
					temp = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
			   }
			}
	}

	static void print(String[] arr) {
		System.out.println("After Sorting");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println(" Please enter array size");
		int size = sc.nextInt();
		if(size < 1)
		{
			System.out.println("Size too small");
		}
		else {
		System.out.println(" Enter elements of array");
		String[] arr = new String[size];
		for (int i = 0; i < size; i++)
			arr[i] = sc.next();
		System.out.println("1.Sorting using with Bubble sort \n2.Sorting using Insertion Sort");
		int ch = sc.nextInt();

		if (ch == 2)
			insertionString(arr);
		else
			bubbleSort(arr);
		print(arr);
		}
		}catch(Exception e)
		{
			System.out.println("Error!!");
			System.out.println(e);
		}
		
		sc.close();
	}

}

package Set1;

import java.util.*;

public class TwoArraySum {
	static void sum(double[] array1, double[] array2) {
		double[] array = new double[array1.length];
		for (int i = 0; i < array1.length; i++) {
			array[i] = array1[i] + array2[i];
		}
		System.out.println("Sum array is..");
		for (int i = 0; i < array.length; i++)
			System.out.println((int) array[i]);
	}

	static void findSum(double[] array1, double[] array2) {
		if (array1.length > array2.length) {
			double[] array = new double[array1.length];
			for (int i = 0; i < array2.length; i++) {
				array[i] = array1[i] + array2[i];
			}
			for (int i = array2.length; i < array1.length; i++) {
				array[i] = array1[i];
			}
			System.out.println(" Sum array of two arrays ");
			for (int i = 0; i < array.length; i++)
				System.out.println((int) array[i]);

		} else if (array1.length < array2.length) {
			double[] array = new double[array2.length];
			for (int i = 0; i < array1.length; i++) {
				array[i] = array1[i] + array2[i];
			}
			for (int i = array1.length; i < array2.length; i++) {
				array[i] = array2[i];
			}
			System.out.println(" Sum array of two arrays ");
			for (int i = 0; i < array.length; i++)
				System.out.println((int) array[i]);

		} else {
			double[] array = new double[array1.length];
			for (int i = 0; i < array1.length; i++) {
				array[i] = array1[i] + array2[i];
			}
			System.out.println(" Sum array of two arrays");
			for (int i = 0; i < array.length; i++)
				System.out.println((int) array[i]);

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		int size1;
		int size2;
		System.out.println(" Please enter size of two arrays : ");
		size1 = sc.nextInt();
		size2 = sc.nextInt();
		if(size1<0 || size2<0)
		{
			System.out.println("Invalid size. Try again");
			System.exit(0);
		}
		int size = (size1 > size2) ? size1 : size2;
		double[] array1 = new double[size];
		double[] array2 = new double[size];

		System.out.println(" Enter array1 values");
		for (int i = 0; i < size1; i++) {
			array1[i] = sc.nextDouble();
		}
		System.out.println(" Enter array2 values");
		for (int i = 0; i < size2; i++) {
			array2[i] = sc.nextDouble();
		}

		sc.close();
		sum(array1, array2);
		//findSum(array1, array2);
		}catch(Exception e)
		{
			System.out.println("Error!!");
			System.out.println(e);
		}
	}

}

package Set1;

import java.util.*;

public class Triplets {
	void printTriplets(int[] data) {
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				for (int k = j + 1; k < data.length; k++)
					if ((data[i] + data[j]) == data[k]) {
						System.out.println("<" + data[i] + "," + data[j] + "," + data[k] + ">");
						// System.out.println("i = "+i+" j = "+j);
						count++;
					}
			}
		}
		if (count == 0)
			System.out.println("No triplets");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		Triplets t = new Triplets();
		System.out.println(" Please enter size of array: ");
		int size = sc.nextInt();
		if(size<3)
		{
			System.out.println("Size too small");
			System.exit(0);
		}
		int[] data = new int[size];
		System.out.println(" Enter elements of the array : ");
		for (int i = 0; i < size; i++)
			data[i] = sc.nextInt();
		t.printTriplets(data);
		}catch(Exception e)
		{
			System.out.println("Error");
			System.out.println(e);
		}
		sc.close();

	}

}

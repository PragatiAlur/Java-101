package Set1;

import java.util.*;

public class Multiplication {

	static void printMultiplication(int number) {
		for (int i = 1; i < 13; i++) {
			System.out.println(number + " x " + i + " = " + (number * i));

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		try {
			int number = sc.nextInt();
			if (number == 0) {
				System.out.println("0 multiplication is always 0");
			} else {
				printMultiplication(number);
			}
		} catch (Exception e) {
			System.out.println("Error!!!");
			System.out.println(e);
		}
		sc.close();
	}
}

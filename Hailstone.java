package Set1;

import java.util.*;

public class Hailstone {
	static void hailstone(int num) {
		int count = 0;
		if (num < 0)
			System.out.println("Not possible enter positive number");
		else if(num==0)
		{
			System.out.println("Not possible for zero");
		}
		else {
			while (num != 1) {
				if (num % 2 == 0) {
					System.out.println(num + " is even so I take half : " + (num / 2));
					num = num / 2;
					count++;
				} else {
					System.out.print(num + " is odd so I make 3n+1 : ");
					num = num * 3 + 1;
					System.out.println(num);
					count++;
				}
			}
			System.out.println("There are total of " + count + " steps to reach 1");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter number");
		int num = sc.nextInt();
		hailstone(num);
		}catch(Exception e)
		{
			System.out.println("Bad Choice of input");
			System.out.println(e);
		}
		sc.close();
	}
}

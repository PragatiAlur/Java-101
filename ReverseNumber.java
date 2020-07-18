package Set1;

import java.math.BigDecimal;
import java.util.*;

public class ReverseNumber {
	static int reverse(int num) {
		int n = 0;
		while (num != 0) {
			n = n * 10;
			n = num % 10 + n;
			num = num / 10;
		}
		return n;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter number");
		BigDecimal num = sc.nextBigDecimal();
		sc.close();
		int integerPart = num.intValue();
		BigDecimal decimal = num.remainder(BigDecimal.ONE);
		//System.out.println(decimal.remainder(BigDecimal.ONE).floatValue());
		while(decimal.remainder(BigDecimal.ONE).floatValue() > 0){
				decimal = decimal.movePointRight(1);
		}
		int decimalPart = decimal.intValue();
		int resDecimal = reverse(decimalPart);
		int resInteger = reverse(integerPart);
		System.out.println("Input decimal number in reverse order > ");
		System.out.println(resDecimal+"."+resInteger);
		}
		catch(Exception e)
		{
			System.out.println("Wrong input");
		}
	}

}
	

	
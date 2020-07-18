package Set1;

import java.util.*;

class area {
	double triangleArea(int height, int length) {
		return (0.5 * height * length);
	}

	double rectangleArea(int length, int breadth) {
		return (length * breadth);
	}

	double circleArea(int radius) {
		return 3.14 * radius * radius;
	}
}

public class AreaOfGeometric {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		area a = new area();
		String type;
		try {
		System.out.println(" 1. Circle \n 2. Rectangle \n 3. Triangle");
		System.out.print(" Please enter your choice : ");
		type = sc.next();

		switch (type) {
		case "Circle":
			System.out.println(" Enter radius");
			int radius = sc.nextInt();
			System.out.format(" Circle area " + String.format("%.2f", a.circleArea(radius)));
			break;
		case "Triangle":
			System.out.println(" Enter height and length");
			int height = sc.nextInt();
			int length = sc.nextInt();
			System.out.format(String.format("%.2f" + a.triangleArea(height, length)));
			break;
		case "Rectangle":
			System.out.println(" Enter height and length");
			int lengthRect = sc.nextInt();
			int breadth = sc.nextInt();
			System.out.println(" Rectangle area " + String.format("%.2f" + a.rectangleArea(breadth, lengthRect)));
			break;
		default:
			System.out.println(" Wrong Choice! Sorry");

		}
		}
		catch(Exception e)
		{
			System.out.println("Erorr");
			System.out.println(e);
		}
		sc.close();
	}
}

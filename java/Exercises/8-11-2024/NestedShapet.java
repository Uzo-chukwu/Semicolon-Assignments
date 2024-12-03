import java.util.Scanner;
public class NestedShapet{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	double area;
	System.out.printf("What shape do you have for me:%n1. Circle%n2. Rectangle%n3. Triangle:  ");
	int shape = input.nextInt();

	switch (shape) {
        	case 1:
			System.out.print("Enter the radius of the circle");
			double radius = input.nextDouble();
			area = (22/7) * radius * radius;	
			System.out.printf("The area of the circle is %f",area);	
			break;
        	
		case 2:
			System.out.print("Enter the length and breadth of the rectangle");
			double lenght = input.nextDouble();
			double breadth = input.nextDouble();
			area = lenght * breadth;	
			System.out.printf("The area of the rectangle is %f",area);	
			break;

			
		case 3:
			System.out.print("Enter the base and height of the triangle");
			double base = input.nextDouble();
			double height = input.nextDouble();
			area = 0.5 * base * height;	
			System.out.printf("The area of the circle is %f",area);	
			break;

	}
}
}
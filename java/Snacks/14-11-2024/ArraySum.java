public class ArraySum{
public static void main(String [] args){

	int[] numbers = {1,2,3,4,5,6,7,8,9,10};
	int total = 0;
	for (int count = 0; count < numbers.length; count++){

		total += numbers[count];

	}
	
	System.out.print(total);

}

}
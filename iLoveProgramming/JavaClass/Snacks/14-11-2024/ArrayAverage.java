public class ArrayAverage{
public static void main(String [] args){

	int[] numbers = {1,2,3,4,5,6,7,8,9,10};
	int sum = 0;
	
	for (int count = 0; count < numbers.length; count++){

		sum += numbers[count];

	}
	int average = sum/numbers.length;
	System.out.print(average);

}

}
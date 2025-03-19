public class ArrayIndexFinder{
public static void main(String [] args){

	int[] numbers = {1,2,3,4,5,6,7,8,9,10};

	int index = 0;
	
	for (int count = 0; count < numbers.length; count++) 

		if (numbers[count] == 5){
		
			index = count;
	
		}

		
	System.out.print(index);

	
}

}
import java.util.Arrays;
public class PangramChecker{

	public static void main(String [] args){


}
	
	public static boolean isPangram(String sentence){
		char[] sentenceArray = sentence.toCharArray();
		 
			
		for(char character = 'a'; character <= 'z'; character++){
			int count = 0;
			for(int x = 0; x < sentenceArray.length; x++){
				
				if(character == sentenceArray[x])
					count++;
							}
			if(count < 1)
				return false;
		}
		return true;
	}

	public static int[] getArray(int[] numbers){
		int [] output = new int[2];
		int smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE;
		for(int count = 0; count < numbers.length; count++){
			if(numbers[count] > largest)
				largest = numbers[count];
			if(numbers[count] < smallest)
				smallest = numbers[count];	 
		}
		for(int index = 0; index < numbers.length; index++){
			if(numbers[index] == smallest)
				output[0]=index;	
			if(numbers[index] == largest)
				output[1]=index;
		} 
		return output;
	}



}
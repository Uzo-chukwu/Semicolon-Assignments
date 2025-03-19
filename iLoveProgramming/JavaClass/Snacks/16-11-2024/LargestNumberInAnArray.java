public class LargestNumberInAnArray{
public static void main(String [] args){

	
	int[] numbers ={1,2,3,4,5,6,7,8,9};

	int largest = 0;
	
	for (int count = numbers.length ; count > -1; count--){
	
		if(count > largest){
		
			largest = count;
		}
		
		
	} 

	System.out.print(largest);

}

}
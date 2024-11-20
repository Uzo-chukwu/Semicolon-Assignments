public class SmallestNumberInAnArray{
public static void main(String [] args){

	
	int[] numbers ={1,2,3,4,5,6,7,8,9};

	int smallest =  Integer.MAX_VALUE ;
	
	for (int count = numbers.length-1 ; count > -1; count--){
	
		if(numbers[count] < smallest){
		
			smallest = numbers[count];
		}
		
		
	} 

	System.out.print(smallest);

}

}
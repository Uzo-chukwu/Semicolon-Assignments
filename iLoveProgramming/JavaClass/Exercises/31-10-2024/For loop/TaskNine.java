public class TaskNine {

	public static void main(String [] args){
	
	int fourMultiples = 0;
	int eightMultiples = 0;
	
	for(int count = 1; count <= 10; count++ ){
		
		if(count - 4 == 0   ){
			fourMultiples = count+count * count+count*count*count+count*count*count*count+count*count*count*count*count;	
		}

		if(count - 8 == 0  ){
			eightMultiples = count+count * count+count*count*count+count*count*count*count+count*count*count*count*count;	
		}

		

	}
	
	int sum = fourMultiples + eightMultiples;
	int square = sum * sum;
	System.out.print(square);
}
}
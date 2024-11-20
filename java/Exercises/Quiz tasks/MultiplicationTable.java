public class MultiplicationTable{
public static void main(String [] args){
	
	for(int row = 1; row <= 10; row++){

		for(int column = 1; column <= 10; column++){
			int answer = column * row;
			System.out.printf(" %2dx%2d=%2d",column,row,answer);

		
		}

		System.out.println();
	}
}
}
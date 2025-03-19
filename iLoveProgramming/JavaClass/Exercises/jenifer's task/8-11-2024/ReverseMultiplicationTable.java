
public class ReverseMultiplicationTable{
public static void main(String [] args){
	
	
	for(int row = 1; row < 13; row++){
		for(int column = 12; column >0 ; column--){
			int ans = column * row;
			System.out.printf("%2d * %2d= %3d",column,row,ans);

		}
	System.out.println();	
	}
		
}
}
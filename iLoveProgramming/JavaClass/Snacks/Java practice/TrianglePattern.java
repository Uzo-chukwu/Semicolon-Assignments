public class TrianglePattern{
	public static void main(String [] args){

		
		printUpperTriangle(8);
		printLowerTriangle(7);
		printLine();


	}
	public static void printLine(){
		System.out.println();
	}
	public static void printStar(){
		System.out.print("* ");
	}
	public static void printStar(int numberOfStars){
		for(int i = 1; i <= numberOfStars; i++){
			printStar();
		}
	}
	public static void printUpperTriangle(int lenght){
		for(int i = 1; i <= lenght; i++){
			printStar(i);
			printLine();
	}
		
	}
	public static void printLowerTriangle(int lenght){
		for(int i = lenght; i >= 1; i--){
			printStar(i);
			printLine();
	}
		
	}

}
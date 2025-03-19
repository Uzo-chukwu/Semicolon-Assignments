import java.util.Scanner;
public classBarChart{
public static void main(String [] args){
		Scanner input = new scanner(System.in);
		System.out.println("Enter 5 numbers that will be represented in a bar chart");
		int firstNum=input.nextInt();
		int secondNum=input.nextInt();
		int thirdNum=input.nextInt();
		int fourthNum=input.nextInt();
		int fifthNum=input.nextInt();

		for(int i=0; i < firstNum; i++){
		   System.out.println("*");
		}for( i=0; i < secondNum; i++){
		   System.out.println("*");
		}for( i=0; i < thirdNum; i++){
		   System.out.println("*");
		}for( i=0; i < fourthNum; i++){
		   System.out.println("*");
		}for( i=0; i < fifthNum; i++){
		   System.out.println("*");
		}





}
}

}
import java.util.Scanner;
public class StudentGradingApp{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
		
	System.out.println("How many students do you have? ");
	int numberOfStudents = input.nextInt();
	
	System.out.println("How many subjects do they offer ");
	int numberOfSubjects = input.nextInt();

	int[][] studentsScoresheet = new int[numberOfStudents][numberOfSubjects];
	
	int student;
	int course;
	
	for(int count = 0; count < numberOfStudents; count++){
		student = count + 1;
		for(int subject = 0; subject < numberOfSubjects; subject++){
			course = subject + 1;
			System.out.println("Enter student"+student" score in ")
		
		}
	
	}



	}

	

}
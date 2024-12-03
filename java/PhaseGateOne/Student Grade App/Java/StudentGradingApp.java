import java.util.Scanner;
public class StudentGradingApp{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
		
	System.out.println("How many students do you have? ");
	int numberOfStudents = input.nextInt();
	
	System.out.println("How many subjects do they offer ");
	int numberOfSubjects = input.nextInt();

	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("Saved succesfully");
	System.out.println();


	double[][] studentsScoresheet = compileScores(numberOfStudents,numberOfSubjects);
	displayScoreSheet(studentsScoresheet, numberOfStudents, numberOfSubjects);
	

	}

	private static double[][] compileScores(int numberOfStudents,int numberOfSubjects){

		Scanner input = new Scanner(System.in);
		int numberOfSubjectAndTotalWithAverage = numberOfSubjects + 2;
		double[][] studentsScoresheet = new double[numberOfStudents][numberOfSubjectAndTotalWithAverage];
	
		int student;
		int course;
		double score; 
		double total ;
		double average = 0;
		int scoreIndex = numberOfSubjects ;
		int averageIndex = numberOfSubjects + 1;
		
	
		for(int studier = 0; studier < numberOfStudents; studier++){
			student = studier + 1;
			total = 0;
			for(int subject = 0; subject < numberOfSubjectAndTotalWithAverage; subject++){
				
				if(subject < numberOfSubjects){
					course = subject + 1;
					System.out.println("Enter student"+student+" score in subject"+course);
					score = input.nextDouble();
					if(score >= 0 && score <= 100){
						studentsScoresheet[studier][subject] = score;
						total += score;
					}else{
						System.out.println("Wrong score input enter again:");
						subject--;
						continue;
				     	}
						
					


				}else{
					studentsScoresheet[studier][scoreIndex] = total;
					studentsScoresheet[studier][averageIndex] = average;
				}

							 
		
			}
			System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("Saved succesfully");
					System.out.println();
		}
		return studentsScoresheet;
	}
	
	private static void displayScoreSheet(double [][] studentsScoresheet, int numberOfStudents, int numberOfSubjects){
		System.out.println("======================================================================================");
		for(int header = 0; header < numberOfSubjects + 3; header++){
			if(header < 1) System.out.print("STUDENT     ");
			if(header > 0 && header <= numberOfSubjects ) System.out.print("SUB"+header+"   ");
			if(header == numberOfSubjects + 1) System.out.print("TOT   ");
			if(header == numberOfSubjects + 2) System.out.print("AVE   ");
			if(header == numberOfSubjects + 3) System.out.println("POS   ");
		}
		System.out.println("====================================================");
		
		
		
		for(int column=1; column <= numberOfStudents ; column++){
			for(int row = 0; row <= numberOfSubjects + 2; row++){
				if(row == 0){
					System.out.print("Student "+column+"     "+studentsScoresheet[(column-1)][row]+"   ");
				}else{
					System.out.print(studentsScoresheet[(column-1)][row]+"   s");
				}
			
			}
			System.out.print("");
		
		}

	}
	
}
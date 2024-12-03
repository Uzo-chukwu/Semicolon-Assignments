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
	
	
}
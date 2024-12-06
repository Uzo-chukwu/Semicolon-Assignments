import java.util.Scanner;

public class StudentGradingApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many students do you have? ");
        int numberOfStudents = input.nextInt();
        System.out.println("How many subjects do they offer ");
        int numberOfSubjects = input.nextInt();
        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved succesfully");
        System.out.println();

        double[][] studentsScoresheet = compileScores(numberOfStudents, numberOfSubjects);
        double[] studentTotals = getStudentsTotal(studentsScoresheet, numberOfStudents);
        double[] studentAverages = getStudentsAverage(numberOfSubjects, numberOfStudents, studentTotals);
        int[] studentPositions = calculatePosition(numberOfStudents, studentTotals);

        displayScoreSheet(studentsScoresheet, studentTotals, studentAverages, studentPositions, numberOfStudents, numberOfSubjects);
    }

    private static double[][] compileScores(int numberOfStudents, int numberOfSubjects) {
        Scanner input = new Scanner(System.in);
        double[][] studentsScoresheet = new double[numberOfStudents][numberOfSubjects];
        for (int studier = 0; studier < numberOfStudents; studier++) {
            for (int subject = 0; subject < numberOfSubjects; subject++) {
                System.out.println("Enter student " + (studier + 1) + " score in subject " + (subject + 1));
                double score = input.nextDouble();
                if (score >= 0 && score <= 100) {
                    studentsScoresheet[studier][subject] = score;
                } else {
                    System.out.println("Wrong score input enter again:");
                    subject--;
                    continue;
                }
            }
            System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Saved succesfully");
            System.out.println();
        }
        return studentsScoresheet;
    }

    private static double[] getStudentsTotal(double[][] studentsScoresheet, int numberOfStudents) {
        double[] totalScores = new double[numberOfStudents];
        double total;
        for (int count = 0; count < numberOfStudents; count++) {
            total = 0;
            for (int innerCount = 0; innerCount < studentsScoresheet[0].length; innerCount++) {
                total += studentsScoresheet[count][innerCount];
            }
            totalScores[count] = total;
        }
        return totalScores;
    }

    private static double[] getStudentsAverage(int numberOfSubjects, int numberOfStudents, double[] studentTotals) {
        double[] studentsAverage = new double[numberOfStudents];
        for (int count = 0; count < numberOfStudents; count++) {
            studentsAverage[count] = studentTotals[count] / numberOfSubjects;
        }
        return studentsAverage;
    }

    private static int[] calculatePosition(int numberOfStudents, double[] studentTotals) {
        int[] positions = new int[numberOfStudents];
        for (int count = 0; count < numberOfStudents; count++) {
            int position = 1;
            for (int innerCount = 0; innerCount < numberOfStudents; innerCount++) {
                if (studentTotals[innerCount] > studentTotals[count]) {
                    position++;
                }
            }
            positions[count] = position;
        }
        return positions;
    }

    private static void displayScoreSheet(double[][] studentsScoresheet, double[] studentTotals, double[] studentAverages, int[] studentPositions, int numberOfStudents, int numberOfSubjects) {
        System.out.println("=========================================================================");
        System.out.print("STUDENTS  ");
        for (int header = 0; header < numberOfSubjects; header++) {
            System.out.print("SUB" + (header + 1) + "    ");
        }
        System.out.print("TOT    ");
        System.out.print("AVE    ");
        System.out.println("POS");
        System.out.println("============================================================");
        for (int column = 0; column < numberOfStudents; column++) {
            System.out.print("Student " + (column + 1) + " ");
            for (int row = 0; row < numberOfSubjects; row++) {
                System.out.print(studentsScoresheet[column][row] + "    ");
            }
            System.out.print(studentTotals[column] + "    ");
            System.out.printf("%.2f    ", studentAverages[column]);
            System.out.println(studentPositions[column]);
        }
    }
}
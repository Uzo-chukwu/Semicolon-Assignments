import java.util.Scanner;
public class Pyramid{
public static void main(String [] args){
Scanner input= new Scanner(System.in);

System.out.print("Enter the estimated number of stones used to build the pyramid");
double estimatedStones = input.nextDouble();

System.out.print("Enter the average weight of each stone used to build the pyramid");
double averageWeight = input.nextDouble();

System.out.print("Enter the number of years taken to build the pyramid");
double yearsTaken = input.nextDouble();

double totalWeight = estimatedStones * averageWeight;
double days = yearsTaken * 365;
double hours = days * 24;
double minutes =hours * 60;
double weightPerYear = totalWeight / yearsTaken;
double weightPerHour = totalWeight/ hours;
double weightPerMinute= totalWeight/ minutes;

System.out.printf("Total weight of the pyramid : %f%nWeight built per year : %f%nWeight built per hour : %f%nWeight built per minute : %f. ",totalWeight,weightPerYear,weightPerHour,weightPerMinute);


}
}
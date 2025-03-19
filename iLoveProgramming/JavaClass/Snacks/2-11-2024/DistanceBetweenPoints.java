import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x1 and y1 coordinates of point 1: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Enter x2 and y2 coordinates of point 2: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (x1 == x2) {
            System.out.println("Points are on a line perpendicular to the x-axis");
        } else if (y1 == y2) {
            System.out.println("Points are on a line perpendicular to the y-axis");
        } else {
            System.out.println("Points are not on a line perpendicular to an axis");
        }


    }
}

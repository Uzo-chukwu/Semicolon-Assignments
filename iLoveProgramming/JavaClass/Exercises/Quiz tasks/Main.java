import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your state: ");
        String state = input.nextLine().trim();
        GEOPOLITICALZONES zone = GEOPOLITICALZONES.getZoneForState(state);
        if (zone == null) System.out.println("Invalid state");
        else System.out.println(zone);
    }
}

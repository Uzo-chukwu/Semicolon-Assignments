import java.util.Scanner;

public class PizzaOrderApp  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        displayWelcomeMessage();

        int numberOfGuests = getNumberOfGuests(input);
        int selectedPizzaType = getPizzaTypeChoice(input);

        processOrder(numberOfGuests, selectedPizzaType);

        displayGoodbyeMessage();

        input.close();
    }

    public static void displayWelcomeMessage() {
        System.out.println("==========================================");
        System.out.println(" Welcome to Iya Moses Pizza Joint ");
        System.out.println("==========================================\n");
    }

    public static int getNumberOfGuests(Scanner scanner) {
        System.out.print("Enter the number of guests: ");
        return scanner.nextInt();
    }

    public static int getPizzaTypeChoice(Scanner scanner) {
        String[] pizzaTypes = {"Sapa size", "Small Money", "Big boys", "Odogwu"};
        int[] slicesPerBox = {4, 6, 8, 12};
        int[] pricePerBox = {2500, 2900, 4000, 5200};

        System.out.println("\nAvailable Pizza Types:");
        for (int i = 0; i < pizzaTypes.length; i++) {
            System.out.println((i + 1) + ". " + pizzaTypes[i] + " - " + slicesPerBox[i] + " slices, $" + pricePerBox[i] + " per box");
        }

        System.out.print("\nSelect your pizza type (1-4): ");
        int choice = scanner.nextInt() - 1;

        if (choice < 0 || choice >= pizzaTypes.length) {
            System.out.println("Invalid pizza type selected! Exiting...");
            System.exit(1);
        }
        return choice;
    }

    public static void processOrder(int numberOfGuests, int selectedPizzaType) {
        String[] pizzaTypes = {"Sapa size", "Small Money", "Big boys", "Odogwu"};
        int[] slicesPerBox = {4, 6, 8, 12};
        int[] pricePerBox = {2500, 2900, 4000, 5200};

        String selectedPizza = pizzaTypes[selectedPizzaType];
        int slicesPerBoxForType = slicesPerBox[selectedPizzaType];
        int pricePerBoxForType = pricePerBox[selectedPizzaType];

        int totalBoxes = (numberOfGuests + slicesPerBoxForType - 1) / slicesPerBoxForType;
        int totalSlices = totalBoxes * slicesPerBoxForType;
        int leftoverSlices = totalSlices - numberOfGuests;
        int totalPrice = totalBoxes * pricePerBoxForType;

        System.out.println("\nOrder Summary:");
        System.out.println("Pizza Type: " + selectedPizza);
        System.out.println("Number of boxes to buy: " + totalBoxes + " boxes");
        System.out.println("Leftover slices: " + leftoverSlices + " slices");
        System.out.println("Total price: $" + totalPrice);
    }

    public static void displayGoodbyeMessage() {
        System.out.println("\n==========================================");
        System.out.println(" Thank you for choosing Iya Moses Pizza! ");
        System.out.println(" Enjoy your party and the pizza! ");
        System.out.println("==========================================");
    }
}
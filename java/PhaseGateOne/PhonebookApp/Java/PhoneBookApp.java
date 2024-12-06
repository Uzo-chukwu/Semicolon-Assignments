import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookApp {
    private static Map<String, String> contacts = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean userIsOnApp = true;
        while (userIsOnApp) {
            System.out.println("Phone Book App");
            System.out.println("1. Add contact");
            System.out.println("2. Remove contact");
            System.out.println("3. Find contact by phone number");
            System.out.println("4. Find contact by first name");
            System.out.println("5. Find contact by last name");
            System.out.println("6. Edit contact");
            System.out.println("7. Display contacts");
            System.out.println("8. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    removeContact();
                    break;
                case 3:
                    findContactByPhoneNumber();
                    break;
                case 4:
                    findContactByFirstName();
                    break;
                case 5:
                    findContactByLastName();
                    break;
                case 6:
                    editContact();
                    break;
                case 7:
                    displayContacts();
                    break;
                case 8:
                    System.out.println("Goodbye");
                    userIsOnApp = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        contacts.put(name, phoneNumber);
    }

    private static void removeContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        if (contacts.containsKey(name)) {
            contacts.remove(name);
        } else {
            System.out.println("Contact not found");
        }
    }

    private static void findContactByPhoneNumber() {
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(phoneNumber)) {
                System.out.println("Contact name: " + entry.getKey());
                return;
            }
        }
        System.out.println("Contact not found");
    }

    private static void findContactByFirstName() {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine().toLowerCase();
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            String[] names = entry.getKey().split(" ");
            if (names[0].toLowerCase().equals(firstName)) {
                System.out.println("Contact name: " + entry.getKey() + ", Phone number: " + entry.getValue());
                return;
            }
        }
        System.out.println("Contact not found");
    }

    private static void findContactByLastName() {
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine().toLowerCase();
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            String[] names = entry.getKey().split(" ");
            if (names[names.length - 1].toLowerCase().equals(lastName)) {
                System.out.println("Contact name: " + entry.getKey() + ", Phone number: " + entry.getValue());
                return;
            }
        }
        System.out.println("Contact not found");
    }

    private static void editContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        if (contacts.containsKey(name)) {
            System.out.print("Enter new phone number: ");
            String newPhoneNumber = scanner.nextLine();
            contacts.put(name, newPhoneNumber);
        } else {
            System.out.println("Contact not found");
        }
    }

    private static void displayContacts() {
        System.out.println("Contacts:");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
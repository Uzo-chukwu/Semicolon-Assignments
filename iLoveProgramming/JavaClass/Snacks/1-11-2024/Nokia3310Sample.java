import java.util.Scanner;

public class Nokia3310Sample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Nokia Menu:");
            System.out.println("1. Phone book");
            System.out.println("2. Messages");
            System.out.println("3. Chat");
            System.out.println("4. Call Register");
            System.out.println("5. Tones");
            System.out.println("6. Settings");
            System.out.println("7. Call Divert");
            System.out.println("8. Games");
            System.out.println("9. Calculator");
            System.out.println("10. Reminders");
            System.out.println("11. Clock");
            System.out.println("12. Profiles");
            System.out.println("13. SIM services");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            int menuSelection = input.nextInt();

            switch (menuSelection) {
                case 1:
                    phoneBookMenu(input);
                    break;
                case 2:
                    messagesMenu(input);
                    break;
                case 3:
                    System.out.println("Chat selected.");
                    break;
                case 4:
                    callRegisterMenu(input);
                    break;
                case 5:
                    tonesMenu(input);
                    break;
                case 6:
                    settingsMenu(input);
                    break;
                case 7:
                    System.out.println("Call Divert selected.");
                    break;
                case 8:
                    System.out.println("Games selected.");
                    break;
                case 9:
                    System.out.println("Calculator selected.");
                    break;
                case 10:
                    System.out.println("Reminders selected.");
                    break;
                case 11:
                    clockMenu(input);
                    break;
                case 12:
                    System.out.println("Profiles selected.");
                    break;
                case 13:
                    System.out.println("SIM services selected.");
                    break;
                case 0:
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
    }

    public static void phoneBookMenu(Scanner input) {
        boolean back = false;
        while (!back) {
            System.out.println("Phone Book:");
            System.out.println("1. Search");
            System.out.println("2. Service Nos.");
            System.out.println("3. Add name");
            System.out.println("4. Erase");
            System.out.println("5. Edit");
            System.out.println("6. Assign tone");
            System.out.println("7. Send b'card");
            System.out.println("8. Options");
            System.out.println("9. Speed dials");
            System.out.println("10. Voice tags");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            
            int selection = input.nextInt();
            switch (selection) {
                case 1: System.out.println("Search selected."); break;
                case 2: System.out.println("Service Nos. selected."); break;
                case 3: System.out.println("Add name selected."); break;
                case 4: System.out.println("Erase selected."); break;
                case 5: System.out.println("Edit selected."); break;
                case 6: System.out.println("Assign tone selected."); break;
                case 7: System.out.println("Send b'card selected."); break;
                case 8:
                    System.out.println("Options:");
                    System.out.println("1. Type of view");
                    System.out.println("2. Memory status");
                    int optionsSelection = input.nextInt();
                    if (optionsSelection == 1) System.out.println("Type of view selected.");
                    else if (optionsSelection == 2) System.out.println("Memory status selected.");
                    break;
                case 9: System.out.println("Speed dials selected."); break;
                case 10: System.out.println("Voice tags selected."); break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
    }

    public static void messagesMenu(Scanner input) {
        boolean back = false;
        while (!back) {
            System.out.println("Messages:");
            System.out.println("1. Write messages");
            System.out.println("2. Inbox");
            System.out.println("3. Outbox");
            System.out.println("4. Picture messages");
            System.out.println("5. Templates");
            System.out.println("6. Smileys");
            System.out.println("7. Message settings");
            System.out.println("8. Info service");
            System.out.println("9. Voice mailbox number");
            System.out.println("10. Service command editor");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            
            int selection = input.nextInt();
            switch (selection) {
                case 1: System.out.println("Write messages selected."); break;
                case 2: System.out.println("Inbox selected."); break;
                case 3: System.out.println("Outbox selected."); break;
                case 4: System.out.println("Picture messages selected."); break;
                case 5: System.out.println("Templates selected."); break;
                case 6: System.out.println("Smileys selected."); break;
                case 7:
                    System.out.println("Message settings:");
                    System.out.println("1. Set 1");
                    System.out.println("2. Common");
                    int settingsSelection = input.nextInt();
                    if (settingsSelection == 1) {
                        System.out.println("Set 1:");
                        System.out.println("1. Message centre number");
                        System.out.println("2. Messages sent as");
                        System.out.println("3. Message validity");
                    } else if (settingsSelection == 2) {
                        System.out.println("Common:");
                        System.out.println("1. Delivery reports");
                        System.out.println("2. Reply via same centre");
                        System.out.println("3. Character support");
                    }
                    break;
                case 8: System.out.println("Info service selected."); break;
                case 9: System.out.println("Voice mailbox number selected."); break;
                case 10: System.out.println("Service command editor selected."); break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
 
        public static void callRegisterMenu(Scanner input) {
    boolean back = false;
    while (!back) {
        System.out.println("Call Register:");
        System.out.println("1. Missed calls");
        System.out.println("2. Received calls");
        System.out.println("3. Dialled numbers");
        System.out.println("4. Erase recent call lists");
        System.out.println("5. Show call duration");
        System.out.println("6. Show call costs");
        System.out.println("7. Call cost settings");
        System.out.println("8. Prepaid credit");
        System.out.println("0. Back to Main Menu");
        System.out.print("Enter your choice: ");

        int selection = input.nextInt();
        switch (selection) {
            case 1: System.out.println("Missed calls selected."); break;
            case 2: System.out.println("Received calls selected."); break;
            case 3: System.out.println("Dialled numbers selected."); break;
            case 4: System.out.println("Erase recent call lists selected."); break;
            case 5: System.out.println("Show call duration selected."); break;
            case 6: System.out.println("Show call costs selected."); break;
            case 7: System.out.println("Call cost settings selected."); break;
            case 8: System.out.println("Prepaid credit selected."); break;
            case 0: back = true; break;
            default: System.out.println("Invalid selection. Please try again.");
        }
    }
}

public static void tonesMenu(Scanner input) {
    boolean back = false;
    while (!back) {
        System.out.println("Tones:");
        System.out.println("1. Ringing tone");
        System.out.println("2. Ringing volume");
        System.out.println("3. Incoming call alert");
        System.out.println("4. Composer");
        System.out.println("5. Message alert tone");
        System.out.println("6. Keypad tones");
        System.out.println("7. Warning and game tones");
        System.out.println("8. Vibrating alert");
        System.out.println("9. Screen saver");
        System.out.println("0. Back to Main Menu");
        System.out.print("Enter your choice: ");

        int selection = input.nextInt();
        switch (selection) {
            case 1: System.out.println("Ringing tone selected."); break;
            case 2: System.out.println("Ringing volume selected."); break;
            case 3: System.out.println("Incoming call alert selected."); break;
            case 4: System.out.println("Composer selected."); break;
            case 5: System.out.println("Message alert tone selected."); break;
            case 6: System.out.println("Keypad tones selected."); break;
            case 7: System.out.println("Warning and game tones selected."); break;
            case 8: System.out.println("Vibrating alert selected."); break;
            case 9: System.out.println("Screen saver selected."); break;
            case 0: back = true; break;
            default: System.out.println("Invalid selection. Please try again.");
        }
    }
}

public static void settingsMenu(Scanner input) {
    boolean back = false;
    while (!back) {
        System.out.println("Settings:");
        System.out.println("1. Call settings");
        System.out.println("2. Phone settings");
        System.out.println("3. Security settings");
        System.out.println("4. Restore factory settings");
        System.out.println("0. Back to Main Menu");
        System.out.print("Enter your choice: ");

        int selection = input.nextInt();
        switch (selection) {
            case 1: System.out.println("Call settings selected."); break;
            case 2: System.out.println("Phone settings selected."); break;
            case 3: System.out.println("Security settings selected."); break;
            case 4: System.out.println("Restore factory settings selected."); break;
            case 0: back = true; break;
            default: System.out.println("Invalid selection. Please try again.");
        }
    }
}

public static void clockMenu(Scanner input) {
    boolean back = false;
    while (!back) {
        System.out.println("Clock:");
        System.out.println("1. Alarm clock");
        System.out.println("2. Clock settings");
        System.out.println("3. Date setting");
        System.out.println("4. Stopwatch");
        System.out.println("5. Countdown timer");
        System.out.println("6. Auto update of date and time");
        System.out.println("0. Back to Main Menu");
        System.out.print("Enter your choice: ");

        int selection = input.nextInt();
        switch (selection) {
            case 1: System.out.println("Alarm clock selected."); break;
            case 2: System.out.println("Clock settings selected."); break;
            case 3: System.out.println("Date setting selected."); break;
            case 4: System.out.println("Stopwatch selected."); break;
            case 5: System.out.println("Countdown timer selected."); break;
            case 6: System.out.println("Auto update of date and time selected."); break;
            case 0: back = true; break;
            default: System.out.println("Invalid selection. Please try again.");
        }
    }
}
    
    }
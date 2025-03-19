ffimport java.util.Scanner;

public class Nokia3310Sample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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
        System.out.print("Enter your choice: ");
        
        int menuSelection = input.nextInt();

        switch (menuSelection) {
            case 1:
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
                
                int phonebookSelection = input.nextInt();
                switch (phonebookSelection) {
                    case 1: System.out.println("Search selected"); break;
                    case 2: System.out.println("Service Nos. selected"); break;
                    case 3: System.out.println("Add name selected"); break;
                    case 4: System.out.println("Erase selected"); break;
                    case 5: System.out.println("Edit selected"); break;
                    case 6: System.out.println("Assign tone selected"); break;
                    case 7: System.out.println("Send b'card selected"); break;
                    case 8:
                        System.out.println("Options:");
                        System.out.println("1. Type of view");
                        System.out.println("2. Memory status");
                        int optionsSelection = input.nextInt();
                        if (optionsSelection == 1) System.out.println("Type of view selected");
                        else if (optionsSelection == 2) System.out.println("Memory status selected");
                        break;
                    case 9: System.out.println("Speed dials selected"); break;
                    case 10: System.out.println("Voice tags selected"); break;
                }
                break;

            case 2:
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

                int messageSelection = input.nextInt();
                switch (messageSelection) {
                    case 1: System.out.println("Write messages selected"); break;
                    case 2: System.out.println("Inbox selected"); break;
                    case 3: System.out.println("Outbox selected"); break;
                    case 4: System.out.println("Picture messages selected"); break;
                    case 5: System.out.println("Templates selected"); break;
                    case 6: System.out.println("Smileys selected"); break;
                    case 7:
                        System.out.println("Message settings:");
                        System.out.println("1. Set 1");
                        System.out.println("2. Common");
                        int messageSettingsSelection = input.nextInt();
                        if (messageSettingsSelection == 1) {
                            System.out.println("Set 1:");
                            System.out.println("1. Message centre number");
                            System.out.println("2. Messages sent as");
                            System.out.println("3. Message validity");
                        } else if (messageSettingsSelection == 2) {
                            System.out.println("Common:");
                            System.out.println("1. Delivery reports");
                            System.out.println("2. Reply via same centre");
                            System.out.println("3. Character support");
                        }
                        break;
                    case 8: System.out.println("Info service selected"); break;
                    case 9: System.out.println("Voice mailbox number selected"); break;
                    case 10: System.out.println("Service command editor selected"); break;
                }
                break;

            case 3:
                System.out.println("Chat selected.");
                break;

            case 4:
                System.out.println("Call Register:");
                System.out.println("1. Missed calls");
                System.out.println("2. Received calls");
                System.out.println("3. Dialled numbers");
                System.out.println("4. Erase recent call lists");
                System.out.println("5. Show call duration");
                System.out.println("6. Show call cost");
                System.out.println("7. Call cost settings");
                System.out.println("8. Prepaid credit");

                int callRegisterSelection = input.nextInt();
                switch (callRegisterSelection) {
                    case 1: System.out.println("Missed calls selected"); break;
                    case 2: System.out.println("Received calls selected"); break;
                    case 3: System.out.println("Dialled numbers selected"); break;
                    case 4: System.out.println("Erase recent call lists selected"); break;
                    case 5:
                        System.out.println("Show call duration:");
                        System.out.println("1. Last call duration");
                        System.out.println("2. All calls’ duration");
                        System.out.println("3. Received calls’ duration");
                        System.out.println("4. Dialled calls’ duration");
                        System.out.println("5. Clear timers");
                        break;
                    case 6:
                        System.out.println("Show call cost:");
                        System.out.println("1. Last call cost");
                        System.out.println("2. All calls’ cost");
                        System.out.println("3. Clear counters");
                        break;
                    case 7:
                        System.out.println("Call cost settings:");
                        System.out.println("1. Call cost limit");
                        System.out.println("2. Show costs in");
                        break;
                    case 8: System.out.println("Prepaid credit selected"); break;
                }
                break;

            case 5:
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
                break;

            case 6:
                System.out.println("Settings:");
                System.out.println("1. Call settings");
                System.out.println("2. Phone settings");
                System.out.println("3. Security settings");
                System.out.println("4. Restore factory settings");
                break;

            case 7: System.out.println("Call Divert selected."); break;
            case 8: System.out.println("Games selected."); break;
            case 9: System.out.println("Calculator selected."); break;
            case 10: System.out.println("Reminders selected."); break;
            case 11:
                System.out.println("Clock:");
                System.out.println("1. Alarm clock");
                System.out.println("2. Clock settings");
                System.out.println("3. Date setting");
                System.out.println("4. Stopwatch");
                System.out.println("5. Countdown timer");
                System.out.println("6. Auto update of date and time");
                break;
            case 12: System.out.println("Profiles selected."); break;
            case 13: System.out.println("SIM services selected."); break;

            default:
                System.out.println("Invalid selection. Please try again.");
        }

        
    }
}

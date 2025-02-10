package diaryApp;
import java.io.*;
import javax.swing.*;

public class MyDiaryApp  {
    public static void main(String[] args) {
        Diaries diaries = new Diaries();
        landingPage(diaries);
    }

    private static void landingPage(Diaries diaries) {
        boolean active = true;
        Diaries deserializedDiaries = deserializeDiaries();
        if (deserializedDiaries != null) {
            diaries = deserializedDiaries;
        }

        while (active) {
            String choice = input("""
                    Welcome to MyDiaryApp!
                    Your secrets are safe with me 😊
                    
                    1. Create a new diary
                    2. Sign in if you already have a diary
                    3. Exit
                    """);

            switch (choice) {
                case "1" -> createNewDiary(diaries);
                case "2" -> signInAndUseDiary(diaries);
                case "3" -> {
                    serializeDiaries(diaries);
                    display("""
                            Your diaries has been saved successfully.
                            Goodbye!
                            """);
                    System.exit(0);

                }
                default -> display("Invalid choice. Try again.");
            }
        }
    }
    private static void serializeDiaries(Diaries diaries) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("myDiaries.ser"))) {
            out.writeObject(diaries);
        } catch (IOException e) {
            System.err.println("Error serializing diaries: " + e.getMessage());
        }
    }

    private static Diaries deserializeDiaries() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("myDiaries.ser"))) {
            return (Diaries) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }


    private static void createNewDiary(Diaries diaries) {
        String username = input("Enter Your Username:");
        String password = input("Create Password:");
        String confirmPassword = input("Confirm Password:");
        if (!password.equals(confirmPassword)) {
            display("Passwords do not match! Try again.");
            return;
        }

        diaries.createDiary(username, password);
        display("Diary created successfully!");
        mainMenu(diaries.findDiaryByUserName(username, password), diaries);
    }

    private static void signInAndUseDiary(Diaries diaries) {
        String username = input("Enter your username:");
        String password = input("Enter your password:");

        try {
            Diary diary = diaries.findDiaryByUserName(username, password);
            display("Login successful! Welcome back, " + username);
            mainMenu(diary, diaries);
        } catch (IllegalArgumentException e) {
            display(e.getMessage());
        }
    }

    private static void mainMenu(Diary diary, Diaries diaries) {
        while (true) {
            String option = input("""
                    Main Menu:
                    1. Create an entry
                    2. Find entry by ID
                    3. Update an entry
                    4. Delete an entry
                    5. Lock diary
                    6. Delete diary
                    7. Exit (Back to sign-in)
                    """);

            switch (option) {
                case "1" -> createEntry(diary);
                case "2" -> findEntry(diary);
                case "3" -> updateEntry(diary);
                case "4" -> deleteEntry(diary);
                case "5" -> lockDiary(diary);
                case "6" -> deleteDiary(diary, diaries);
                case "7" -> {
                    display("Logging out... Redirecting to sign-in.");
                    return;
                }
                default -> display("Invalid choice. Try again.");
            }
        }
    }

    private static void createEntry(Diary diary) {
        while(diary.getisLocked()){
            display("Diary is locked. Enter password to continue.");
            unlockDiary(diary);
        }
        String title = input("Enter title:");
        String body = input("Enter entry body:");
        diary.createEntry(title, body);
        display("Entry added successfully. Your id is "+ (diary.getEntryCount()-1));
    }

    private static void findEntry(Diary diary) {
        while(diary.getisLocked()){
            display("Diary is locked. Enter password to continue.");
            unlockDiary(diary);
        }
        int id = Integer.parseInt(input("Enter entry ID:"));
        try {
            String entry = diary.findEntryById(id);
            display("Entry found:\n" + entry);
        } catch (IllegalArgumentException e) {
            display(e.getMessage());
        }
    }

    private static void updateEntry(Diary diary) {
        while(diary.getisLocked()){
            display("Diary is locked. Enter password to continue.");
            unlockDiary(diary);
        }
        int id = Integer.parseInt(input("Enter entry ID to update:"));
        String newTitle = input("Enter new title:");
        String newBody = input("Enter new body:");
        try {
            diary.updateEntry(id, newTitle, newBody);
            display("Entry updated successfully.");
        } catch (IllegalArgumentException e) {
            display(e.getMessage());
        }
    }

    private static void deleteEntry(Diary diary) {
        while(diary.getisLocked()){
            display("Diary is locked. Enter password to continue.");
            unlockDiary(diary);
        }
        int id = Integer.parseInt(input("Enter entry ID to delete:"));
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this entry?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            diary.deleteEntry(id);
            display("Entry deleted successfully.");
        } else {
            display("Entry deletion canceled.");
        }
    }

    private static void lockDiary(Diary diary) {
        diary.lockDiary();
        display("Diary locked.");
    }

    private static void unlockDiary(Diary diary) {
        String pin = input("Enter your password to unlock:");
        if (diary.validatePassword(pin)) {
            diary.unlockDiary();
            display("Diary unlocked.");
        } else {
            display("Incorrect password. Diary remains locked.");
        }
    }

    private static void deleteDiary(Diary diary, Diaries diaries) {
        String username = input("Enter your username:");
        String password = input("Enter your password:");
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete your diary?", "Confirm Delete", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                diaries.removeDiary(username, password);
                display("Diary deleted successfully.");
                landingPage(diaries);
            } catch (IllegalArgumentException e) {
                display(e.getMessage());
            }
        } else {
            display("Diary deletion canceled.");
        }
    }

    public static void display(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public static String input(String prompt) {
            return JOptionPane.showInputDialog(prompt);
    }
}
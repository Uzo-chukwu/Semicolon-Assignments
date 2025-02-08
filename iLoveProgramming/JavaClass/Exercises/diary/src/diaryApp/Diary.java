package diaryApp;

import java.io.Serializable;
import java.util.ArrayList;

public class Diary implements Serializable {

    private String username;
    private String password;
    private boolean isLocked;
    private int entryCount = 1;

    private ArrayList<Entry> entries = new ArrayList<>();

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public String getUsername() {
        return username;
    }
    public int getEntryCount() {
        return entryCount;
    }

    public boolean validatePassword(String pasword) {
        return this.password.equals(pasword);

    }


    public boolean isEmpty() {
        return entries.isEmpty();
    }

    public void createEntry(String title, String body) {
        int id = entryCount;
        entryCount++;
        if (title.trim().isEmpty() || body.trim().isEmpty())
            throw new IllegalArgumentException("Field cannot be empty");
        else{
            Entry entry = new Entry(title, body, id);
            entries.add(entry);

        }
    }
    public String findEntryById(int id) {
       for (Entry entry : entries) {
           if(entry.getId() == id) return entry.toString();
       }
        throw new IllegalArgumentException("Entry not found");
    }

    public void deleteEntry(int id) {
        entries.removeIf(entry -> entry.getId() == id);

    }
    public int countEntries() {
        return entries.size();
    }
    public void lockDiary() {
        this.isLocked = true;
    }
    public boolean getisLocked() {
        return isLocked;
    }

    public void unlockDiary() {
        this.isLocked = false;
    }

    public void updateEntry(int id, String title, String body) {

        for (Entry entry : entries) {
            if (id == entry.getId()){ entry.setTitle(title); entry.setBody(body);}
            else  throw new IllegalArgumentException("Entry not found");





        }
    }


}

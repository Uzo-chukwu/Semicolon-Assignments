package diaryApp;

import java.util.ArrayList;

public class Diary {

    private String username;
    private String password;
    private boolean isLocked;
//    private int idCounter = 1;
    private ArrayList<Entry> entries = new ArrayList<>();

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public boolean isEmpty() {
        return entries.isEmpty();
    }

    public void createEntry(String title, String body) {
        int id = entries.size() + 1 ;
        if (title.trim().isEmpty() || body.trim().isEmpty()) {
            throw new IllegalArgumentException("Field cannot be empty");
        }else{
            Entry entry = new Entry(title, body, id);
            entries.add(entry);

        }
    }

    public String findEntryById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) return entry.getTitle();
            else throw new IllegalArgumentException("Entry not found");
        }
        return null;
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

package diaryApp;

import java.util.ArrayList;

public class Diary {

    private String username;
    private String password;
    private boolean isLocked;
    private ArrayList<Entry> entries;

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public boolean isEmpty() {
        return null == entries || entries.isEmpty();
    }

    public void createEntry(String title, String body) {
        int id = 100; id++;
        Entry entry = new Entry(title,body,id);
        entries.add(entry);
    }
}

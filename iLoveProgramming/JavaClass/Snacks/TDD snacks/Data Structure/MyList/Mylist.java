package MyList;

public class Mylist {
    private int size;
    private int capacity;
    private String[] elements;


    public boolean isempty() {
        return size == 0;

    }

    public void add(String text) {
        String[] newElements = new String[size + 1];
        newElements[0] = text;
        size++;
    }

    public int getSize() {
        return size;
    }

    public void remove(String text) {
        String[] newElements = new String[size - 1];
        newElements[0] = text;
        size--;


    }

    public void removeAll() {
        String[] newElements = new String[size];
        size = 0;


    }

    public void removeFirst() {
        String[] newElements = new String[size];
        newElements[0] = null;
    }
}

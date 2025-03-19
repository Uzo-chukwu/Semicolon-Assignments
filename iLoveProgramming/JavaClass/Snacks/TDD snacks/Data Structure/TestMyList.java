import MyList.Mylist;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMyList {
    @Test
    public void testEmptyList() {
        Mylist list = new Mylist();
        assertTrue(list.isempty());
    }

    @Test
    public void testAdd(){
        Mylist list = new Mylist();

        list.add("ade");
        list.add("adam");
        list.add("adamu");
        assertFalse(list.isempty());
        assertEquals(3,list.getSize());
        assertEquals(list[0], "adamu");

    }

    @Test
    public void testRemove(){
        Mylist list = new Mylist();
        list.add("ade");
        list.add("shade");
        list.add("David");
        list.remove("ade");
    }
    @Test
    public void testRemoveAll(){
        Mylist list = new Mylist();
        list.add("ade");
        list.add("shade");
        list.add("David");
        list.removeAll();
        assertTrue(list.isempty());
    }



}

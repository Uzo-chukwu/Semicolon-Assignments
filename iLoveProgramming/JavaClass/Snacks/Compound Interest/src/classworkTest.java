import org.junit.Test;
import static org.junit.Assert.*;

public class classworkTest {

    @Test
    public void testgetIndexofFound() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(3, classwork.getIndexof(4, numbers));
        assertEquals(0, classwork.getIndexof(1, numbers));
        assertEquals(6, classwork.getIndexof(7, numbers));
    }

    @Test
    public void testgetIndexofNotFound() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(-1, classwork.getIndexof(8, numbers));
        assertEquals(-1, classwork.getIndexof(0, numbers));
    }

    @Test
    public void testgetIndexofEmptyArray() {
        int[] numbers = {};
        assertEquals(-1, classwork.getIndexof(1, numbers));
    }

    @Test
    public void testgetIndexofSingleElementArray() {
        int[] numbers = {5};
        assertEquals(0, classwork.getIndexof(5, numbers));
        assertEquals(-1, classwork.getIndexof(1, numbers));
    }
}
import org.junit.Test;

public class MainTest{
    @Test
     public void testThatGetIndexOfMethodWorks() {
        Main testMain = new Main();
        int[] numbers = {1, 2, 3, 4, 5};
        int actual = Main.getIndexOf(4, numbers);
    }
    public void testThatGetIndexOfMethodReturns() {
        Main testMain = new Main();
        int[] numbers = {1, 2, 3, 4, 5};
        int actual = Main.getIndexOf(4, numbers);
        int expected = Main.getIndexOf(4, numbers);

    }
}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryDeterminantTest {
    @Test
    public void testBinaryDeterminant() {
        BinaryDeterminant binaryDeterminant = new BinaryDeterminant();
    }
    @Test
    public void testThatDetermine_ReturnsCorrectValue() {
        BinaryDeterminant binaryDeterminant = new BinaryDeterminant();
        String [][] words = {{"x","o","x"},{"x","o","x"},{"x","o","x"}};
        int [][] values = {{1,0,1},{1,0,1},{1,0,1}};
        Assertions.assertArrayEquals(binaryDeterminant.determineBinary(words), values);
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEqual;

public class TestPangramChecker{

	@Test
	public void isPangram(){
		//given
		PangramChecker pangramChecker = new PangramChecker();	
		String sentence = "The quick brown fox jumps over the lazy dog";

		//action
		boolean result = pangramChecker.isPangram(sentence);
		
		//check
		assertTrue(result)

	}
	@Test
	public void getArray(){
		//given
		PangramChecker pangramChecker = new PangramChecker();	
		int[] input = [1,2,3,4,5];

		//action
		int[] actual = pangramChecker.getArray(input);
		int[] expected = [0,4];
		
		//check
		assertArrayEqual(actual,expected);   x
	}
	





}

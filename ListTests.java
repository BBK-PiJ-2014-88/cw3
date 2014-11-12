import org.junit.*;
import static org.junit.Assert.*;

public class ListTests{
	private FunctionalArrayList arrayListTester;
	private FunctionalLinkedList linkedListTester;

	@Before
	public void buildUp(){
		arrayListTester = new FunctionalArrayList();
		linkedListTester = new FunctionalLinkedList();
	}
	@Test
	public void testIsEmpty(){
		boolean expected = true;
		boolean output = arrayListTester.isEmpty();
		assertEquals(output, expected);
	}
}
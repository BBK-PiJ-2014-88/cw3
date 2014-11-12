import org.junit.*;
import static org.junit.Assert.*;

public class ListTests{
	private FunctionalArrayList arrayListTester;
	private FunctionalLinkedList linkedListTester;

	//Testing isEmpty() with an empty list
	@Before
	public void buildUp(){
		arrayListTester = new FunctionalArrayList();
		linkedListTester = new FunctionalLinkedList();
	}
	@Test
	public void testIsEmptyArrayOnEmptyList(){
		boolean expected = true;
		boolean output = arrayListTester.isEmpty();
		assertEquals(output, expected);
	}
	@Test
	public void testIsEmptyLinkedOnEmptyList(){
		boolean expected = true;
		boolean output = linkedListTester.isEmpty();
		assertEquals(output, expected);
	}

	//Testing isEmpty() with a non-empty List
	@Test
	public void testIsEmptyArrayOnNonEmptyList(){
		arrayListTester.add("hello");
		boolean expected = false;
		boolean output = arrayListTester.isEmpty();
		assertEquals(output, expected);
	}
	@Test
	public void testIsEmptyLinkedOnNonEmptyList(){
		linkedListTester.add("Goodbye");
		boolean expected = false;
		boolean output = linkedListTester.isEmpty();
		assertEquals(output, expected);
	}

}
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

	//Tests size() method on empty list
	@Test
	public void checkSizeOnEmptyArrayList(){
		int expected = 0;
		int output = arrayListTester.size();
		assertEquals(output, expected);
	}

	@Test
	public void checkSizeOnEmptyLinkedList(){
		int expected = 0;
		int output = linkedListTester.size();
		assertEquals(output, expected);
	}

	//Tests size() method on non-empty List
	@Test
	public void checkSizeOnNonEmptyArrayList(){
		arrayListTester.add("hello");
		arrayListTester.add("what");
		arrayListTester.add("is");
		arrayListTester.add("this");
		arrayListTester.add("madness");
		arrayListTester.add("hello");
		int expected = 6;
		int output = arrayListTester.size();
		assertEquals(output, expected);
	}

	@Test
	public void checkSizeOnNonEmptyLinkedList(){
		linkedListTester.add("Goodbye");
		linkedListTester.add("cruel");
		linkedListTester.add("world");
		linkedListTester.add("Goodbye");
		int expected = 4;
		int output = linkedListTester.size();
		assertEquals(output, expected);
	}

}
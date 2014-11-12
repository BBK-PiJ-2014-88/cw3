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

	//Testing get method on empty structure
	@Test
	public void checkGetOnEmptyArrayList(){
		ErrorMessage expected = ErrorMessage.EMPTY_STRUCTURE;
		ErrorMessage output = (arrayListTester.get(0).getError());
		assertEquals(output, expected);
	}
	@Test
	public void checkGetOnEmptyLinkedList(){
		ErrorMessage expected = ErrorMessage.EMPTY_STRUCTURE;
		ErrorMessage output = (linkedListTester.get(0).getError());
		assertEquals(output, expected);
	}
	//Testing get method with invalid index
	@Test
	public void checkGetInvalidIndexArrayList(){
		arrayListTester.add("Not empty Yay");
		ErrorMessage expected = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		ErrorMessage output = (arrayListTester.get(3).getError());
		assertEquals(output, expected);
	}
	@Test
	public void checkGetInvalidIndexLinkedList(){
		linkedListTester.add("Not empty Yay");
		ErrorMessage expected = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		ErrorMessage output = (linkedListTester.get(5).getError());
		assertEquals(output, expected);
	}
	//Testing get method on NonEmpty structure with a valid index
	@Test
	public void checkGetArrayList(){
		arrayListTester.add("Not empty Yay");
		arrayListTester.add("Not empty Yay1");
		arrayListTester.add("Not empty Yay2");
		arrayListTester.add("Not empty Yay3");
		arrayListTester.add("Not empty Yay4");
		arrayListTester.add("Not empty Yay5");
		Object expected = "Not empty Yay3";
		Object output = (arrayListTester.get(3)).getReturnValue();
		assertEquals(output, expected);
	}
	@Test
	public void checkGetLinkedList(){
		linkedListTester.add("Not empty Yay");
		linkedListTester.add("Not empty Yay1");
		linkedListTester.add("Not empty Yay2");
		linkedListTester.add("Not empty Yay3");
		linkedListTester.add("Not empty Yay4");
		linkedListTester.add("Not empty Yay5");
		Object expected = "Not empty Yay3";
		Object output = (linkedListTester.get(3)).getReturnValue();
		assertEquals(output, expected);
	}
	//Tests Remove method returns correct Object
	@Test
	public void checkRemoveArrayList(){
		arrayListTester.add("Not empty Yay");
		arrayListTester.add("Not empty Yay1");
		arrayListTester.add("Not empty Yay2");
		arrayListTester.add("Not empty Yay3");
		arrayListTester.add("Not empty Yay4");
		arrayListTester.add("Not empty Yay5");
		Object expected = "Not empty Yay4";
		Object output = (arrayListTester.remove(4)).getReturnValue();
		assertEquals(output, expected);
	}
	@Test
	public void checkRemoveLinkedList(){
		linkedListTester.add("Not empty Yay");
		linkedListTester.add("Not empty Yay1");
		linkedListTester.add("Not empty Yay2");
		linkedListTester.add("Not empty Yay3");
		linkedListTester.add("Not empty Yay4");
		linkedListTester.add("Not empty Yay5");
		Object expected = "Not empty Yay4";
		Object output = (linkedListTester.remove(4)).getReturnValue();
		assertEquals(output, expected);
	}
	//Tests Remove method has removed Object from list correctly by using get method to check new value at index
	@Test
	public void checkRemove2ArrayList(){
		arrayListTester.add("Not empty Yay");
		arrayListTester.add("Not empty Yay1");
		arrayListTester.add("Not empty Yay2");
		arrayListTester.add("Not empty Yay3");
		arrayListTester.add("Not empty Yay4");
		arrayListTester.add("Not empty Yay5");
		arrayListTester.remove(4);
		Object expected = "Not empty Yay5";
		Object output = (arrayListTester.get(4)).getReturnValue();
		assertEquals(output, expected);
	}
	@Test
	public void checkRemove2LinkedList(){
		linkedListTester.add("Not empty Yay");
		linkedListTester.add("Not empty Yay1");
		linkedListTester.add("Not empty Yay2");
		linkedListTester.add("Not empty Yay3");
		linkedListTester.add("Not empty Yay4");
		linkedListTester.add("Not empty Yay5");
		linkedListTester.remove(4);
		Object expected = "Not empty Yay5";
		Object output = (linkedListTester.get(4)).getReturnValue();
		assertEquals(output, expected);
	}
	// Tests adding a value into a position in the list using an index
	@Test
	public void checkAddIndexArrayList(){
		arrayListTester.add("Not empty Yay");
		arrayListTester.add("Not empty Yay1");
		arrayListTester.add("Not empty Yay2");
		arrayListTester.add("Not empty Yay3");
		arrayListTester.add("Not empty Yay4");
		arrayListTester.add("Not empty Yay5");
		arrayListTester.add(4, "New Object");
		Object expected = "New Object";
		Object output = (arrayListTester.get(4)).getReturnValue();
		assertEquals(output, expected);
	}
	@Test
	public void checkAddIndexLinkedList(){
		linkedListTester.add("Not empty Yay");
		linkedListTester.add("Not empty Yay1");
		linkedListTester.add("Not empty Yay2");
		linkedListTester.add("Not empty Yay3");
		linkedListTester.add("Not empty Yay4");
		linkedListTester.add("Not empty Yay5");
		linkedListTester.add(4, "New Object");
		Object expected = "New Object";
		Object output = (linkedListTester.get(4)).getReturnValue();
		assertEquals(output, expected);
	}

	//Checking Functional List functionality below

	@Test
	public void checkHeadOnEmptyArrayList(){
		ErrorMessage expected = ErrorMessage.EMPTY_STRUCTURE;
		Object output = (arrayListTester.head()).getError();
		assertEquals(output, expected);
	}
	@Test
	public void checkHeadOnEmptyLinkedList(){
		ErrorMessage expected = ErrorMessage.EMPTY_STRUCTURE;
		ErrorMessage output = (linkedListTester.head()).getError();
		assertEquals(output, expected);
	}


}
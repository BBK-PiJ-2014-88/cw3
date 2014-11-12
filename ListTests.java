import org.junit.*;
import static org.junit.Assert.*;

public class ListTests{
	private FunctionalArrayList arrayListTester;
	private FunctionalLinkedList linkedListTester;
	private SampleableListImpl sampleableListTester;

	//Testing isEmpty() with an empty list
	@Before
	public void buildUp(){
		arrayListTester = new FunctionalArrayList();
		linkedListTester = new FunctionalLinkedList();
		sampleableListTester = new SampleableListImpl();
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
	//Testing head() method on EmptyList
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
	//Checking head() method on non-empty List
	@Test
	public void checkHeadArrayList(){
		arrayListTester.add("Not empty Yay");
		arrayListTester.add("Not empty Yay1");
		arrayListTester.add("Not empty Yay2");
		arrayListTester.add("Not empty Yay3");
		arrayListTester.add("Not empty Yay4");
		arrayListTester.add("Not empty Yay5");
		Object expected = "Not empty Yay";
		Object output = (arrayListTester.head()).getReturnValue();
		assertEquals(output, expected);
	}
	@Test
	public void checkHeadLinkedList(){
		linkedListTester.add("Not empty Yay");
		linkedListTester.add("Not empty Yay1");
		linkedListTester.add("Not empty Yay2");
		linkedListTester.add("Not empty Yay3");
		linkedListTester.add("Not empty Yay4");
		linkedListTester.add("Not empty Yay5");
		Object expected = "Not empty Yay";
		Object output = (linkedListTester.head()).getReturnValue();
		assertEquals(output, expected);
	}

	//SampleAbleList tests begin here
	//Following set of tests check that sampleableList has correctly extended List

	@Test
	public void testIsEmptySampleableOnEmptyList(){
		boolean expected = true;
		boolean output = sampleableListTester.isEmpty();
		assertEquals(output, expected);
	}

	@Test
	public void testIsEmptySampleAbleOnNonEmptyList(){
		sampleableListTester.add("hello");
		boolean expected = false;
		boolean output = sampleableListTester.isEmpty();
		assertEquals(output, expected);
	}
	@Test
	public void checkSizeOnEmptySampleableList(){
		int expected = 0;
		int output = sampleableListTester.size();
		assertEquals(output, expected);
	}
	@Test
	public void checkSizeOnNonEmptySampleableList(){
		sampleableListTester.add("hello");
		sampleableListTester.add("what");
		sampleableListTester.add("is");
		sampleableListTester.add("this");
		sampleableListTester.add("madness");
		sampleableListTester.add("hello");
		int expected = 6;
		int output = sampleableListTester.size();
		assertEquals(output, expected);
	}
	@Test
	public void checkGetOnEmptySampleableList(){
		ErrorMessage expected = ErrorMessage.EMPTY_STRUCTURE;
		ErrorMessage output = (sampleableListTester.get(0).getError());
		assertEquals(output, expected);
	}
	public void checkGetInvalidIndexSampleableList(){
		sampleableListTester.add("Not empty Yay");
		ErrorMessage expected = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		ErrorMessage output = (sampleableListTester.get(3).getError());
		assertEquals(output, expected);
	}
	@Test
	public void checkRemoveSampleableList(){
		sampleableListTester.add("Not empty Yay");
		sampleableListTester.add("Not empty Yay1");
		sampleableListTester.add("Not empty Yay2");
		sampleableListTester.add("Not empty Yay3");
		sampleableListTester.add("Not empty Yay4");
		sampleableListTester.add("Not empty Yay5");
		Object expected = "Not empty Yay4";
		Object output = (sampleableListTester.remove(4)).getReturnValue();
		assertEquals(output, expected);
	}
	@Test
	public void checkAddIndexSampleableList(){
		sampleableListTester.add("Not empty Yay");
		sampleableListTester.add("Not empty Yay1");
		sampleableListTester.add("Not empty Yay2");
		sampleableListTester.add("Not empty Yay3");
		sampleableListTester.add("Not empty Yay4");
		sampleableListTester.add("Not empty Yay5");
		sampleableListTester.add(4, "New Object");
		Object expected = "New Object";
		Object output = (sampleableListTester.get(4)).getReturnValue();
		assertEquals(output, expected);
	}

	//The next Test will check that the sample() method works
	@Test
	public void checkSampleMethod(){
		sampleableListTester.add("1");
		sampleableListTester.add("2");
		sampleableListTester.add("3");
		sampleableListTester.add("4");
		sampleableListTester.add("5");
		sampleableListTester.add("6");
		sampleableListTester.add("7");
		SampleableListImpl temp = sampleableListTester.sample();
		int[] comparer = {"1","3","5","7"};
		int[] comparer2;
		for (int x = 0; x < temp.size(); x++){
			comparer2[x] = temp[x];
		}
		int[] expected = comparer;
		int[] output = comparer2;
		assertEquals(output, expected);
	}

}
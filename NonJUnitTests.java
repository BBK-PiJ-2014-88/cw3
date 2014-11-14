public class NonJUnitTests{
	public static void main(String[] args){
		NonJUnitTests tests = new NonJUnitTests();
		tests.launch();
	}
	public void launch(){
		ArrayList arrayListTester = new ArrayList();
		LinkedList linkedListTester = new LinkedList();
		Matrix testMatrix = new Matrix(2,2);
		arrayListTester.add(testMatrix);
		System.out.println("Checking that complex types like a matrix can be added onto arrayList. Expect matrix below");
		System.out.println(arrayListTester);
		linkedListTester.add(testMatrix);
		System.out.println("Checking that complex types like a matrix can be added onto linkedList. Expect matrix below");
		System.out.println(linkedListTester);

		System.out.println();
		System.out.println("Functional List tests start here");
		FunctionalLinkedList functionalLinkedTester = new FunctionalLinkedList();
		FunctionalArrayList functionalArrayTester = new FunctionalArrayList();
		System.out.println("Testing head on empty FunctionalLinkedlist:");
		System.out.println(functionalLinkedTester.head());
		functionalLinkedTester.add("1");
		functionalLinkedTester.add("2");
		functionalLinkedTester.add("3");
		functionalLinkedTester.add("4");
		functionalLinkedTester.add("5");
		functionalLinkedTester.add("6");
		System.out.println("Current list;");
		System.out.println(functionalLinkedTester);
		System.out.println("Head:");
		System.out.println(functionalLinkedTester.head());
		System.out.println("rest:");
		System.out.println(functionalLinkedTester.rest());
		System.out.println("Testing head on empty FunctionalArraylist:");
		System.out.println(functionalArrayTester.head());
		functionalArrayTester.add("1");
		functionalArrayTester.add("2");
		functionalArrayTester.add("3");
		functionalArrayTester.add("4");
		functionalArrayTester.add("5");
		functionalArrayTester.add("6");
		functionalArrayTester.add("7");
		System.out.println("Current list;");
		System.out.println(functionalArrayTester);
		System.out.println("Head:");
		System.out.println(functionalArrayTester.head());
		System.out.println("rest:");
		System.out.println(functionalArrayTester.rest());

		System.out.println();
		System.out.println("SampleableList tests start here");
		SampleableListImpl sampleableTester = new SampleableListImpl();
		System.out.println("Test sample on empty list");
		System.out.println(sampleableTester.sample());
		sampleableTester.add("1");
		sampleableTester.add("2");
		sampleableTester.add("3");
		sampleableTester.add("4");
		sampleableTester.add("5");
		sampleableTester.add("6");
		sampleableTester.add("7");
		System.out.println("Current List:");
		System.out.println(sampleableTester);
		System.out.println("Sample:");
		System.out.println(sampleableTester.sample());
		sampleableTester.remove(5);
		System.out.println("Sample after removing number 6");
		System.out.println(sampleableTester.sample());

		System.out.println();
		ImprovedStackImpl improvedStackTester = new ImprovedStackImpl();
		System.out.println("Testing Improved Stack");
		System.out.println("Testing isEmpty on empty stack. Expect true:");
		System.out.println(improvedStackTester.isEmpty());
		System.out.println("Testing size method. Expect zero");
		System.out.println(improvedStackTester.size());
		System.out.println("Printing out the Improved stack below expect empty:");
		System.out.println(improvedStackTester);
		System.out.println("Testing popping from an empty stack, should return appropriate error message");
		System.out.println(improvedStackTester.pop());
		improvedStackTester.push("Element 1");
		improvedStackTester.push("Element 2");
		improvedStackTester.push("Element 3");
		improvedStackTester.push("Element 4");
		improvedStackTester.push("Element 5");
		System.out.println("Printing out the Improved stack below. Expect 5 elements:");
		System.out.println(improvedStackTester);
		System.out.println("Testing top. Expect element 5");
		System.out.println(improvedStackTester.top());
		System.out.println("Stack should be unchaged after top");
		System.out.println(improvedStackTester);
		System.out.println("Testing pop. Expect element 5");
		System.out.println(improvedStackTester.pop());
		System.out.println("Testing pop. Expect element 5 to have been removed from Stack");
		System.out.println(improvedStackTester);
		System.out.println("Testing isEmpty on non-empty stack. Expect false:");
		System.out.println(improvedStackTester.isEmpty());
		System.out.println("Testing size method. Expect 4");
		System.out.println(improvedStackTester.size());
		improvedStackTester.push("Element 5");
		improvedStackTester.push("Element 6");
		improvedStackTester.push("Element 7");
		System.out.println("Improved stack should contain 7 elements:");
		System.out.println(improvedStackTester);
		improvedStackTester.remove("Element 4");
		System.out.println("Testing remove method. Element 4 should be gone");
		System.out.println(improvedStackTester);
		improvedStackTester.push("Element 5");
		System.out.println("Stack now has 2 element 5's");
		System.out.println(improvedStackTester);
		improvedStackTester.remove("Element 5");
		System.out.println("Remove should get rid of both of them");
		System.out.println(improvedStackTester);
		System.out.println("Testing reverse method below");
		System.out.println(improvedStackTester.reverse());
		System.out.println("Original List below should be unchanged");
		System.out.println(improvedStackTester);



	}
}
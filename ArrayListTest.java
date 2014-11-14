public class ArrayListTest{
	//This file is called ArrayListTest but i use it as a test file for all my lists for certain things
	//For example printing out the lists and looking at them to make sure the other elements haven't been changed
	//after an add or remove method
	public static void main(String[] args){
		ArrayListTest tester = new ArrayListTest();
		tester.launch();
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




	}
}
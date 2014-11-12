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
		System.out.println(arrayListTester);
		System.out.println(arrayListTester.isEmpty());
		System.out.println(arrayListTester.get(0));
		System.out.println(arrayListTester.remove(5));
		System.out.println(arrayListTester.remove(-1));
		System.out.println(arrayListTester.remove(20));
		System.out.println(arrayListTester.get(10));
		System.out.println(arrayListTester.add("Hello"));
		System.out.println(arrayListTester.add("Dude"));
		System.out.println(arrayListTester);
		System.out.println(arrayListTester.add(4,"Hello"));
		System.out.println(arrayListTester);
		System.out.println(arrayListTester.add(null));
		Matrix testMatrix = new Matrix(5,6);
		System.out.println(arrayListTester.add(testMatrix));
		System.out.println(arrayListTester);
		arrayListTester.add("Butterflies");
		arrayListTester.add("are");
		arrayListTester.add("awesome");
		arrayListTester.add("in");
		arrayListTester.add("summertime");
		arrayListTester.add("but");
		arrayListTester.add("sometimes");
		arrayListTester.add("they");
		arrayListTester.add("suck");
		System.out.println(arrayListTester);
		arrayListTester.remove(2);
		System.out.println(arrayListTester);
		arrayListTester.remove(0);
		System.out.println(arrayListTester);
		System.out.println(arrayListTester.add(4,"four"));
		System.out.println(arrayListTester.add(4,"four"));
		System.out.println(arrayListTester.add(4,"four"));
		System.out.println(arrayListTester);
		System.out.println(arrayListTester.remove(2));
		arrayListTester.add("final");
		arrayListTester.remove(2);
		arrayListTester.remove(2);
		System.out.println(arrayListTester);

		System.out.println("Linked List tests start here");
		LinkedList linkedListTester = new LinkedList();
			linkedListTester.add("are");
			linkedListTester.add("awesome");
			linkedListTester.add("in");
			linkedListTester.add("summertime");
			linkedListTester.add("but");
			linkedListTester.add("sometimes");
			linkedListTester.add("they");
			linkedListTester.add("suck");
			System.out.println(linkedListTester);
			linkedListTester.add(new Matrix(1,1));
			System.out.println(linkedListTester);
			linkedListTester.add(4, "four");
			System.out.println(linkedListTester);

			System.out.println("Functional List tests start here");
			FunctionalLinkedList functionalLinkedTester = new FunctionalLinkedList();
			FunctionalArrayList functionalArrayTester = new FunctionalArrayList();
			System.out.println(functionalLinkedTester.head());
			functionalLinkedTester.add("1");
			functionalLinkedTester.add("2");
			functionalLinkedTester.add("3");
			functionalLinkedTester.add("4");
			functionalLinkedTester.add("5");
			functionalLinkedTester.add("6");
			System.out.println(functionalLinkedTester.head());
			System.out.println(functionalLinkedTester.rest());

			System.out.println(functionalArrayTester.head());
			functionalArrayTester.add("1");
			functionalArrayTester.add("2");
			functionalArrayTester.add("3");
			functionalArrayTester.add("4");
			functionalArrayTester.add("5");
			functionalArrayTester.add("6");
			functionalArrayTester.add("7");
			System.out.println(functionalArrayTester);
			System.out.println(functionalArrayTester.head());
			System.out.println(functionalArrayTester.rest());

	}
}
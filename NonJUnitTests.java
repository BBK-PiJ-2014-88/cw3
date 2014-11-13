public class NonJUnitTests{
	public static void main(String[] args){
		NonJUnitTests tests = new NonJUnitTests();
		tests.launch();
	}
	public void launch(){
		ImprovedStackImpl improvedStackTester = new ImprovedStackImpl();
		System.out.println("Testing Improved Stack");
		System.out.println("Testing isEmpty on empty stack. Expect true:");
		System.out.println(improvedStackTester.isEmpty());
		System.out.println("Testing size method. Expect zero");
		System.out.println(improvedStackTester.size());
		System.out.println("Printing out the Improved stack below expect empty:");
		System.out.println(improvedStackTester);
		improvedStackTester.push("Element 1");
		improvedStackTester.push("Element 2");
		improvedStackTester.push("Element 3");
		improvedStackTester.push("Element 4");
		improvedStackTester.push("Element 5");
		System.out.println("Printing out the Improved stack below. Expect 5 elements:");
		System.out.println(improvedStackTester);
		System.out.println("Testing top. Expect element 5");
		System.out.println(improvedStackTester.top());
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




	}
}
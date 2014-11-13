public class NonJUnitTests{
	public static void main(String[] args){
		NonJUnitTests tests = new NonJUnitTests();
		tests.launch();
	}
	public void launch(){
		ImprovedStackImpl improvedStackTester = new ImprovedStackImpl();
		System.out.println("Testing Improved Stack");
		System.out.println("Testing isEmpty on empty stack. Expect true");
		System.out.println(improvedStackTester.isEmpty());
	}
}
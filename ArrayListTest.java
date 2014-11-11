public class ArrayListTest{
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
		arrayListTester.add("Hello");
		arrayListTester.add("Dude");
		System.out.println(arrayListTester);

	}
}
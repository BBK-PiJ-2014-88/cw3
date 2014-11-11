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
	}
}
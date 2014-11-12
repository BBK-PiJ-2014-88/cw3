public class SampleableListImpl implements SampleableList{
	private FunctionalLinkedList listMethodsContainer;
	public SampleableListImpl(){
		listMethodsContainer = new FunctionalLinkedList();
	}
	public boolean isEmpty(){
		return listMethodsContainer.isEmpty();
	}
	public int size(){
		return listMethodsContainer.size();
	}
	public ReturnObject get(int index){
		return listMethodsContainer.get(index);
	}
	public ReturnObject remove(int index){
		return listMethodsContainer.remove(index);
	}
	public ReturnObject add(int index, Object item){
		return listMethodsContainer.add(index, item);
	}
	public ReturnObject add(Object item){
		return listMethodsContainer.add(item);
	}
	public SampleableList sample(){
		if (isEmpty() == true){
			return (new SampleableListImpl);
		}
		else{
			SampleableList newSampleableList = new SampleableListImpl();
			for (int x = 0; x <
		}
	}
}

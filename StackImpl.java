public class StackImpl extends AbstractStack implements Stack{
	@Override
	public boolean isEmpty(){
		return internalList.getEmpty();
	}
	public int size(){
		return internalList.size();
	}
	public void push(){

	}

}
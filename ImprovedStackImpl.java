public class ImprovedStackImpl implements ImprovedStack{
	FunctionalLinkedList stackInternalList = new FunctionalLinkedList();
	StackImpl internalStack = new StackImpl(stackInternalList);

	public boolean isEmpty(){
		return internalStack.isEmpty();
	}
	public int size(){
		return internalStack.size();
	}
	public void push(Object item){
		internalStack.push(item);
	}
	public ReturnObject top(){
		return internalStack.top();
	}
	public ReturnObject pop(){
		return internalStack.pop();
	}

}
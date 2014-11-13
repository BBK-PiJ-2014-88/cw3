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
	public ImprovedStack reverse(){
		ImprovedStack reversedStack = new ImprovedStackImpl();
		for (int x = 0; x < this.size(); x++){
			reversedStack.push((internalStack.internalList.get(x)).getReturnValue());
		}
		return reversedStack;
	}
	public void remove(Object object){

	}


}
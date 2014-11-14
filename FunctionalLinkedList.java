public class FunctionalLinkedList extends LinkedList implements FunctionalList{
	public ReturnObject head(){
		if (isEmpty() == true){
			return (new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE));
		}
		else{
			return (new ReturnObjectImpl(firstNodeInList.getElement()));
		}
	}
	public FunctionalList rest(){
		FunctionalLinkedList newFunctionalList = new FunctionalLinkedList();
		if (isEmpty() == true){
			return newFunctionalList;
		}
		else{
			for (int x = 1; x < this.size(); x++){
				newFunctionalList.add((this.get(x)).getReturnValue());
			}
			return newFunctionalList;
		}
	}
}
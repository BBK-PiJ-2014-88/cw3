public class FunctionalLinkedList extends LinkedList implements FunctionalList {
	public ReturnObject head(){
		if (this.isEmpty() == true){
			ReturnObject errorObject2 = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return errorObject2;
		}
		else{
			return (new ReturnObjectImpl(firstNodeInList.getElement()));
		}
	}
	public FunctionalList rest(){
		FunctionalList newFunctionalList = new LinkedList();
		if (this.isEmpty() == true){
			return newFunctionalList;
		}
		else{
			for (int x = 1; x < this.size(); x++){
				newFunctionalList.add((this.get(x)).getReturnValue());
				return newFunctionalList;
			}
		}


	}
}
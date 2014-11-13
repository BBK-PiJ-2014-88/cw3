public class LinkedList implements List{
	public Node firstNodeInList = null;

	public boolean isEmpty(){
		if (firstNodeInList == null){
			return true;
		}
		else{
			return false;
		}
	}

	public String toString(){    //used this method for testing
		String output = "";
		for (int x = 0; x < size(); x++){
			output = output + " " + (this.get(x)).getReturnValue();
		}
		return output;
	}


	public int size(){
		if (firstNodeInList == null){
			return 0;
		}
		else{
			return findLength(firstNodeInList);
		}
	}

	public int findLength(Node position){
		if (position.next == null){
			return 1;
		}
		else{
			return 1 + findLength(position.next);
		}
	}

	public ReturnObject get(int index){
		if (this.isEmpty() == true){
			ReturnObject errorObject2 = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return errorObject2;
		}
		else if (index < 0 || index >= this.size()){
			ReturnObject errorObject = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return errorObject;
		}
		else{
			Object gottenElement = (firstNodeInList.getNodeAtIndex(index)).getElement();
			return (new ReturnObjectImpl(gottenElement));

		}
	}

	public ReturnObject remove(int index){
		if (this.isEmpty() == true){
			ReturnObject errorObject2 = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return errorObject2;
		}
		else if (index < 0 || index >= this.size()){
			ReturnObject errorObject = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return errorObject;
		}
		else if (index == 0){
			Node removedNode = firstNodeInList;
			firstNodeInList = firstNodeInList.next;
			return new ReturnObjectImpl(removedNode.getElement());
		}
		else{
			Node removedNode = firstNodeInList.getNodeAtIndex(index);
			if (index != this.size() -1){
				(firstNodeInList.getNodeAtIndex(index - 1)).setNext(firstNodeInList.getNodeAtIndex(index + 1));
				return new ReturnObjectImpl(removedNode.getElement());
			}
			else{
			(firstNodeInList.getNodeAtIndex(index - 1)).next = null;
			return new ReturnObjectImpl(removedNode.getElement());
			}
		}

	}

	public ReturnObject add(int index, Object item){
		if (index < 0 || (index >= size() && size() != 0)){
			ReturnObject errorObject = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return errorObject;
		}
		else if (item == null){
			ReturnObject errorObject = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
			return errorObject;
		}
		else{
			Node newNode = new Node(item);
			newNode.setNext(firstNodeInList.getNodeAtIndex(index));
			(firstNodeInList.getNodeAtIndex(index - 1)).setNext(newNode);
			return (new ReturnObjectImpl(null));
		}
	}

	public ReturnObject add(Object item){
		Node newNode = new Node(item);
		if (item == null){
			ReturnObject errorObject = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
			return errorObject;
		}
		else if(this.isEmpty() == true ){
			firstNodeInList = newNode;
			return (new ReturnObjectImpl(null));
		}
		else{
			(firstNodeInList.getLastNode()).setNext(newNode);
			return (new ReturnObjectImpl(null));
		}
	}


}
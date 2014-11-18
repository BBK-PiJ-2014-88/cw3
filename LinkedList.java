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
		if (position.getNext() == null){
			return 1;
		}
		else{
			return 1 + findLength(position.getNext());
		}
	}

	public ReturnObject get(int index){
		if (isEmpty() == true){
			return (new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE));
		}
		else if (index < 0 || index >= size()){
			return (new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS));
		}
		else{
			Object gottenElement = (firstNodeInList.getNodeAtIndex(index)).getElement();
			return (new ReturnObjectImpl(gottenElement));

		}
	}

	public ReturnObject remove(int index){
		if (isEmpty() == true){
			return (new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE));
		}
		else if (index < 0 || index >= size()){
			return (new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS));
		}
		else if (index == 0){
			Node removedNode = firstNodeInList;
			firstNodeInList = firstNodeInList.getNext();
			return new ReturnObjectImpl(removedNode.getElement());
		}
		else if (index == size()-1){
			Node removedNode = firstNodeInList.getNodeAtIndex(index);
			(firstNodeInList.getNodeAtIndex(index - 1)).setNext(null);
			return new ReturnObjectImpl(removedNode.getElement());
		}
		else{
			Node removedNode = firstNodeInList.getNodeAtIndex(index);
			(firstNodeInList.getNodeAtIndex(index - 1)).setNext(firstNodeInList.getNodeAtIndex(index + 1));
			return new ReturnObjectImpl(removedNode.getElement());
		}

	}

	public ReturnObject add(int index, Object item){
		if (index < 0 || (index >= size() && size() != 0)){
			return (new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS));
		}
		else if (item == null){
			return (new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT));
		}
		else if (isEmpty() == true){
			Node newNode = new Node(item);
			firstNodeInList = newNode;
			return (new ReturnObjectImpl(null));
		}
		else if (index == 0){
			Node newNode = new Node(item);
			Node temp = firstNodeInList;
			newNode.setNext(temp);
			firstNodeInList = newNode;
			return (new ReturnObjectImpl(null));
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
			return (new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT));
		}
		else if(isEmpty() == true ){
			firstNodeInList = newNode;
			return (new ReturnObjectImpl(null));
		}
		else{
			(firstNodeInList.getLastNode()).setNext(newNode);
			return (new ReturnObjectImpl(null));
		}
	}


}
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
		if (index < 0 || index >= this.size()){
			ReturnObject errorObject = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return errorObject;
		}
		else if (this.isEmpty() == true){
			ReturnObject errorObject2 = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return errorObject2;
		}
		else{
			Object gottenElement = (firstNodeInList.getNodeAtIndex(index)).getElement();
			return (new ReturnObjectImpl(gottenElement));

		}
	}

	public ReturnObject remove(int index){
		if (index < 0 || index >= this.size()){
			ReturnObject errorObject = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return errorObject;
		}
		else if (this.isEmpty() == true){
			ReturnObject errorObject2 = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return errorObject2;
		}
		else if (index == 1){
			Node removedNode = firstNodeInList.getNodeAtIndex(index);
			ReturnObject returnObjectWithRemovedElement = new ReturnObjectImpl(removedNode.getElement());
		}
		else{
			Node removedNode = firstNodeInList.getNodeAtIndex(index);
			ReturnObject returnObjectWithRemovedElement = new ReturnObjectImpl(removedNode.getElement());
			(firstNodeInList.getNodeAtIndex(index - 1)).next = firstNodeInList.getNodeAtIndex(index + 1);
			return returnObjectWithRemovedElement;
			//need to edit this later to add special method or else clause if the first node in list is being removed.
		}

	}

	public ReturnObject add(int index, Object item){
		if (index < 0 || index >= this.size()){
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
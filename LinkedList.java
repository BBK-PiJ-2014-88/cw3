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
			Object gottenElement = (getNodeAtIndex(index, firstNodeInList)).getElement();
			ReturnObject returnObjectWithElement = new ReturnObjectImpl(gottenElement);
			return returnObjectWithElement;
		}
	}

	public Node getNodeAtIndex(int index, Node position){
		if (index == 0){
			return position;
		}
		else{
			return (getNodeAtIndex(index - 1, position.next));
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
		else{
			Node removedNode = getNodeAtIndex(index, firstNodeInList);
			ReturnObject returnObjectWithRemovedElement = new ReturnObjectImpl(removedNode.getElement());
			(getNodeAtIndex(index - 1, firstNodeInList)).next = getNodeAtIndex(index + 1, firstNodeInList);
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


	}

	public ReturnObject add(Object item){

	}
}
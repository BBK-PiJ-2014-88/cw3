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
			Object gottenElement = getValueAtIndex(index, firstNodeInList);
			ReturnObject returnObjectWithElement = new ReturnObjectImpl(gottenElement);
			return returnObjectWithElement;
		}
	}

	public Object getValueAtIndex(int index, Node position){

	}

	public ReturnObject remove(int index){
	}
	public ReturnObject add(int index, Object item){
	}
	public ReturnObject add(Object item){

	}
}
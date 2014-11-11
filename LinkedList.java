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
	}
	public ReturnObject remove(int index){
	}
	public ReturnObject add(int index, Object item){
	}
	public ReturnObject add(Object item){

	}
}
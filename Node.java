public class Node{
	//Wrapper for linkedList Implementation. Holds an Object and points to next element in LinkedList
	private Object element;
	private Node next;

	public Object getElement(){
		return element;
	}
	public Node(Object objectStoredInNode){
		element = objectStoredInNode;
		next = null;
	}
	public void setNext(Node nextNode){
		next = nextNode;
	}
	public Node getNext(){
		return next;
	}
	public String toString(){
		//Prints Object, useful for testing list
		return "" + element;
	}
	public Node getLastNode(){
		if (this.getNext() == null){
			return this;
		}
		else{
			return this.getNext().getLastNode();
		}
	}
	public Node getNodeAtIndex(int index){
		if (index == 0){
			return this;
		}
		else{
			return this.getNext().getNodeAtIndex(index - 1);
		}
	}
}
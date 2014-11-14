public class Node{
	//Wrapper for linkedList Implementation. Holds an Object and points to next element in LinkedList
	public Object element;
	public Node next;

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
	public String toString(){
		//Prints Object, useful for testing list
		return "" + element;
	}
	public Node getLastNode(){
		if (this.next == null){
			return this;
		}
		else{
			return this.next.getLastNode();
		}
	}
	public Node getNodeAtIndex(int index){
		if (index == 0){
			return this;
		}
		else{
			return this.next.getNodeAtIndex(index - 1);
		}
	}
}
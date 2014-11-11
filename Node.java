public class Node{
	//Wrapper for linkedList Implementation. Holds an Object and points to next element in LinkedList
	public Object Element;
	public Node next;
	public Object getElement(){
		return this.Element;
	}
	public Node(Object objectStoredInNode){
		this.Element = objectStoredInNode;
		this.next = null;
	}
	public void setNext(Node nextNode){
		this.next = nextNode;
	}
	public String toString(){
		//Prints Object, useful for testing list
		return "" + this.Element;
	}
	public Node getLastNode(){
		if (this.next == null){
			return this;
		}
		else{
			return this.next.getLastNode();
		}

	}
}
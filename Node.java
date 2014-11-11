public class Node{
	//Wrapper for linkedList Implementation. Holds an Object and points to next element in LinkedList
	public Object Element;
	public Node next;
	public Object getElement(){
		return this.Element;
	}
	public Node(Object objectStoredInNode){
		this.Element = objectStoredInNode;
	}
	public void setNext(Node nextNode){
		this.next = nextNode;
	}
}
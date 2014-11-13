public class ImprovedStackImpl implements ImprovedStack{
	FunctionalLinkedList stackInternalList = new FunctionalLinkedList();
	StackImpl internalStack = new StackImpl(stackInternalList);
}
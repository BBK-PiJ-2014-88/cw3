public class FunctionalArrayList extends ArrayList implements FunctionalList {

	public ReturnObject head(){
		if (isEmpty() == true){
			return (new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE));
		}
		else{
			return new ReturnObjectImpl(theActualList[0]);
		}
	}

	public FunctionalList rest(){
		if (isEmpty() == true){
			return new FunctionalArrayList();
		}
		else{
			Object[] temp = new Object[theActualList.length];
			for (int x = 0; x < theActualList.length - 1; x++){
				temp[x] = theActualList[x+1];
			}
			FunctionalArrayList newFunctionalList = new FunctionalArrayList();
			newFunctionalList.theActualList = temp;
			return newFunctionalList;
		}
	}

}
public class FunctionalArrayList extends ArrayList implements FunctionalList {

	public ReturnObject head(){
		if (this.isEmpty() == true){
			ReturnObject errorObject2 = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return errorObject2;
		}
		else{
			return new ReturnObjectImpl(theActualList[0]);
		}
	}

	public FunctionalList rest(){
		if (this.Empty() == true){
			return new FunctionalArrayList();
		}
		else{
			Object[] temp = new Object[theActualList.length];
			for (int x = 0; x < temp.length; x++){
				temp[x] = theActualList[x+1];
			}
			FunctionalList newFunctionalList = new ArrayList();
			newFunctionalList.theActualList = temp;
			return newFunctionalList;
		}

	}

}
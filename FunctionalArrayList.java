public class FunctionalArrayList extends ArrayList implements FunctionalList{

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
	}

}
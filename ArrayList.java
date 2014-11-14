public class ArrayList implements List{
	public Object[] theActualList = new Object[10];

	public String toString(){    //used this method for testing
		String output = "";
		for (int x = 0; x < size(); x++){
			output = output + " " + theActualList[x];
		}
		return output;
	}

	public boolean isEmpty(){
		if (this.size() == 0){
			return true;
		}
		else{
			return false;
		}
	}

	public int size(){
		//Number of elements in the list are the number of elements not equal to null
		int size = 0;
		for (int x = 0; x < theActualList.length; x++){
			if (!(theActualList[size] == null)){
				size++;
			}
			else if (theActualList[size] == null){ //no need to continue down the list. All values will be null after a null is found
				break;
			}
		}
		return size;
	}

	public ReturnObject get(int index){
		if (this.isEmpty() == true){
			return (new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE));
		}
		else if (index < 0 || index >= this.size()){
			return (new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS));
		}
		else{
			return (new ReturnObjectImpl(theActualList[index]));
		}
	}

	public ReturnObject remove(int index){
		if (this.isEmpty() == true){
			return (new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE));
		}
		else if (index < 0 || index >= this.size()){
			return (new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS));
		}
		else{
			ReturnObject returnObjectWithRemovedElement = new ReturnObjectImpl(theActualList[index]);
		    Object[] temp = new Object[theActualList.length];
			for (int x = 0; x < temp.length - 1; x++){
				if (x < index){
					temp[x] = theActualList[x];
				}
				else{
					temp[x] = theActualList[x + 1];
				}
			}
			theActualList = temp;
			return returnObjectWithRemovedElement;
		}
	}

	public ReturnObject add(int index, Object item){
		if (index < 0 || index >= this.size()){
			ReturnObject errorObject = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return errorObject;
		}
		else if (item == null){
			ReturnObject errorObject = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
			return errorObject;
		}
		else{
			this.isNearlyFull(); //check if list is nearly full first before moving objects one place to the right to make room for new item
			Object temp = theActualList[index];
			Object temp2;
			for (int x = index; x < theActualList.length - 1; x++){
				temp2 = this.theActualList[x + 1];
				this.theActualList[x + 1] = temp;
				temp = temp2;
			}
			this.theActualList[index] = item;
			return (new ReturnObjectImpl(null));
		}
	}

	public ReturnObject add(Object item){
		if (item == null){
			ReturnObject errorObject = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
			return errorObject;
		}
		this.isNearlyFull();
		theActualList[this.size()] = item;
		return (new ReturnObjectImpl(null));
	}

	public void isNearlyFull(){
		if (!(this.theActualList[this.theActualList.length - 2] == null)){  //ArrayList nearly full
			Object[] temp = new Object[(this.theActualList.length) *2];
			for (int x = 0; x < temp.length; x++){
				if (x < this.size()){
					temp[x] = this.theActualList[x];
				}
				else{
					temp[x] = null;
				}
			}
			this.theActualList = temp;
		}
	}
}
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
			for (int x = index; x < theActualList.length - 1; x++){
					theActualList[x] = theActualList[x + 1];
				}
			return returnObjectWithRemovedElement;
		}
	}

	public ReturnObject add(int index, Object item){
		if (index < 0 || index >= this.size()){
			return (new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS));
		}
		else if (item == null){
			return (new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT));
		}
		else{
			isFull();
			Object temp = theActualList[index];
			Object temp2;
			for (int x = index; x < theActualList.length - 1; x++){
				temp2 = theActualList[x + 1];
				theActualList[x + 1] = temp;
				temp = temp2;
			}
			theActualList[index] = item;
			return (new ReturnObjectImpl(null));
		}
	}

	public ReturnObject add(Object item){
		if (item == null){
			return (new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT));
		}
		isFull();
		theActualList[this.size()] = item;
		return (new ReturnObjectImpl(null));
	}

	public void isFull(){
		if (!(theActualList[theActualList.length - 1] == null)){  //ArrayList full
			Object[] temp = new Object[(theActualList.length) *2];
			for (int x = 0; x < temp.length; x++){
				if (x < this.size()){
					temp[x] = this.theActualList[x];
				}
				else{
					temp[x] = null;
				}
			}
			theActualList = temp;
		}
	}
}
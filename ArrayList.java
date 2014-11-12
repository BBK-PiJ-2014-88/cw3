public class ArrayList implements List{
	public Object[] theActualList;

	public ArrayList(){
		theActualList = new Object[10];
		for (int x = 0; x < theActualList.length; x++){
			//default value of Object is null. This list cannot hold null values so setting all to empty String
			theActualList[x] = new String("Empty");
		}
	}



	public String toString(){    //used this method for testing
		String output = "";
		for (int x = 0; x < theActualList.length; x++){
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
		//Number of elements in the list are the number of elements not equal to an empty string along length of the list
		int size = 0;
		for (int x = 0; x < theActualList.length; x++){
			if (!(theActualList[size].equals(new String("Empty")))){
				size++;
			}
		}
		return size;
	}



	public ReturnObject get(int index){
		if (index < 0 || index >= this.size()){
			ReturnObject errorObject = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return errorObject;
		}
		else if (this.isEmpty() == true){
			ReturnObject errorObject2 = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return errorObject2;
		}
		else{
			ReturnObject returnObjectWithElement = new ReturnObjectImpl(theActualList[index]);
			return returnObjectWithElement;
		}

	}
	public ReturnObject remove(int index){
		if (index < 0 || index >= this.size()){
			ReturnObject errorObject = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return errorObject;
		}
		else if (this.isEmpty() == true){
			ReturnObject errorObject2 = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return errorObject2;
		}
		else{
			ReturnObject returnObjectWithRemovedElement = new ReturnObjectImpl(theActualList[index]);
		    Object[] temp = new Object[this.theActualList.length];
			for (int x = 0; x < temp.length - 1; x++){
				if (x < index){
					temp[x] = theActualList[x];
				}
				else{
					temp[x] = theActualList[x + 1];
				}
			}
			temp[temp.length -1] = new String("Empty");
			this.theActualList = temp;
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
		if (!(this.theActualList[this.theActualList.length - 2].equals(new String("Empty")))){  //ArrayList nearly full
			Object[] temp = new Object[(this.theActualList.length) *2];
			for (int x = 0; x < temp.length; x++){
				if (x < this.size()){
					temp[x] = this.theActualList[x];
				}
				else{
					temp[x] = new String("Empty");
				}
			}
			this.theActualList = temp;
		}
	}
}
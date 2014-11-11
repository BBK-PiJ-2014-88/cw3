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
		int position = 0;
		int size = 0;
		while(position < theActualList.length){
			if (!(theActualList[size].equals(new String("Empty")))){
				size++;
			}
			position++;
		}
		return size;
	}



	public ReturnObject get(int index){
		if (index < 0 || index >= theActualList.length){
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
		if (index < 0 || index >= theActualList.length){
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
			for (int x = 0; x < index; x++){
				temp[x] = theActualList[x];
			}
			for (int y = index+1; y < temp.length; y++){
				temp[y-1] = theActualList[y];
			}
			this.theActualList = temp;
			return returnObjectWithRemovedElement;
		}
	}

	public ReturnObject add(int index, Object item){
		if (index < 0 || index >= theActualList.length){
			ReturnObject errorObject = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return errorObject;
		}
		else if (item == null){
			ReturnObject errorObject = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
			return errorObject;
		}
		else if(this.theActualList[index].equals(new String("Empty"))){
			this.theActualList[index] = item;
			return (new ReturnObjectImpl(null)); //returning empty ReturnObject as operation was successful
		}
		else{ //this means there is already an object in the list at that index so will need to rearrange objects to make room
			this.isNearlyFull(); //check if list is nearly full first before moving objects one place to the right
			Object temp = theActualList[index];
			Object temp2;
			for (int x = index; x < theActualList.length; x++){
				temp2 = theActualList[x + 1];
				this.theActualList[index + 1] = temp;
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
		int lengthMinusOne = this.theActualList.length -2;
		String str = new String("Empty");
		if (!((this.theActualList[lengthMinusOne]).equals(str))){  //ArrayList nearly full
			Object[] temp = new Object[(this.theActualList.length) *2];
			for (int x = 0; x < this.size(); x++){
				temp[x] = this.theActualList[x];
			}
			for (int y = this.size(); y < temp.length; y++){
				temp[y] = new String("");
			}
			this.theActualList = temp;
		}

	}
}
public class ArrayList implements List{
	public int size = 0;
	Object[] theActualList;

	public void ArrayList(){
		theActualList = new Object[10];
		for (int x = 0; x < theActualList.length; x++){
			//default value of Object is null. This list cannot hold null values so setting all to empty String
			theActualList[x] = new String("Empty");
		}
	}

	public boolean isEmpty(){
		if (this.size == 0){
			return true;
		}
		else{
			return false;
		}
	}

	public int size(){
		return this.size;
	}

	public int getSize(){
		int size = 0;
		while(theActualList[size] != new String("Empty")){
			size++;
		}
		return size;
	}

	public ReturnObjectImpl get(int index){
	}
	public ReturnObjectImpl remove(int index){
	}
	public ReturnObjectImpl add(Object item){
		if (item == null){
			ReturnObjectImpl nullInserted = new ReturnObjectImpl();

		}
		this.isNearlyFull();
		theActualList[size] = item;
		size++;
	}
	public ReturnObjectImpl add(int index, Object item){
	}

	public void isNearlyFull(){
		int lengthMinusOne = this.theActualList.length -1;
		String str = new String("Empty");
		if (!((this.theActualList[lengthMinusOne]).equals(str))){  //ArrayList nearly full
			Object[] temp = new Object[(this.theActualList.length) *2];
			for (int x = 0; x < this.size; x++){
				temp[x] = this.theActualList[x];
			}
			for (int y = this.size; y < temp.length; y++){
				temp[y] = new String("");
			}
			this.theActualList = temp;
		}

	}
}
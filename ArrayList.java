public class ArrayList implements List{
	public int size = 0;
	ReturnObject[] theActualList;
	//Constructor method below, makes arrayList of 10 ReturnObjects and sets all values to null
	public void ArrayList(){
		theActualList = new ReturnObject[10];
		for (int x = 0; x < theActualList.length; x++){
			theActualList[x] = null;
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
	public ReturnObject get(int index){
	}
	public ReturnObject add(Object item){
	}
	public ReturnObject add(int index, Object item){
	}
	public void isNearlyFull(){
		if (this.theActualList[this.theActualList.length - 1] != null){  //ArrayList nearly full
			ReturnObject[] temp = new ReturnObject[(this.theActualList.length) *2];
			for (int x = 0; x < this.size; x++){
				temp[x] = this.theActualList[x];
			}
			for (int y = this.size; y < temp.length; y++){
				temp[y] = null;
			}
			this.theActualList = temp;
		}

	}
}
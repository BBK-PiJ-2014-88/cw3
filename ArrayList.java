public class ArrayList implements List{
	public int size = 0;
	ReturnObjectImpl[] theActualList;
	//Constructor method below, makes arrayList of 10 ReturnObjects and sets all values to 'empty'
	public void ArrayList(){
		String empty = new String("String");
		theActualList = new ReturnObjectImpl[10];
		for (int x = 0; x < theActualList.length; x++){
			theActualList[x] = new ReturnObjectImpl(empty);
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
	public ReturnObjectImpl get(int index){
	}
	public ReturnObjectImpl add(Object item){
	}
	public ReturnObjectImpl add(int index, Object item){
	}
	public void isNearlyFull(){
		String empty = new String("String");
		if (this.theActualList[this.theActualList.length - 1].containsSomething == true){  //ArrayList nearly full
			ReturnObject[] temp = new ReturnObject[(this.theActualList.length) *2];
			for (int x = 0; x < this.size; x++){
				temp[x] = this.theActualList[x];
			}
			for (int y = this.size; y < temp.length; y++){
				temp[y] = new ReturnObjectImpl(empty);
			}
			this.theActualList = temp;
		}

	}
}
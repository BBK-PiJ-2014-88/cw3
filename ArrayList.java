public class ArrayList implements List{
	private int size = 0;
	ReturnObject[] theActualList;
	//Constructor method below, makes arrayList of 10 ReturnObjects.
	public void ArrayList(){
		theActualList = new ReturnObject[10];
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
		if (this.theActualList[theActualList.length - 1].containsSomething == true){

		}

	}
}
public class ReturnObjectImpl implements ReturnObject{

	Object Value;
	boolean containsSomething = false;

	public void ReturnObjectImpl(Object valueToAdd){
		this.Value = valueToAdd;
	}
	public boolean hasError(){
	}
	public ErrorMessage getError(){
	}
	public Object getReturnValue(){
	}

}

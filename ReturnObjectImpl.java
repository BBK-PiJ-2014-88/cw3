public class ReturnObjectImpl implements ReturnObject{

	private Object Value;
	private ErrorMessage errorMsg;

	public void ReturnObjectImpl(ErrorMessage msg){
		this.errorMsg = msg;
		this.Value = null;
	}

	public void ReturnObjectImpl(Object valueToAdd){
		this.Value = valueToAdd;
		this.errorMsg = ErrorMessage.NO_ERROR;
	}

	public boolean hasError(){
		if (errorMsg.equals(ErrorMessage.NO_ERROR)){
			return true;
		}
		else{
			return false;
		}
	}
	public ErrorMessage getError(){
	}
	public Object getReturnValue(){
	}

}

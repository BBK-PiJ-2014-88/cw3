public class ReturnObjectImpl implements ReturnObject{

	private Object Value;
	private ErrorMessage errorMsg;

	public void ReturnObjectImpl(Object nullValue, ErrorMessage msg){
		this.errorMsg = msg;
		this.Value = nullValue;
	}

	public void ReturnObjectImpl(Object valueToAdd){
		this.Value = valueToAdd;
		this.errorMsg = ErrorMessage.NO_ERROR;
	}

	public boolean hasError(){
		if (errorMsg.equals(ErrorMessage.NO_ERROR)){
			return false;
		}
		else{
			return true;
		}
	}
	public ErrorMessage getError(){
		if (this.hasError() == false){
			return ErrorMessage.NO_ERROR;
		}
		else{
			return this.errorMsg;
		}
	}
	public Object getReturnValue(){
		return this.Value;
	}

}

public class ReturnObjectImpl implements ReturnObject{

	private Object value;
	private ErrorMessage errorMsg;

	public ReturnObjectImpl(ErrorMessage msg){
		errorMsg = msg;
		value = null;
	}

	public ReturnObjectImpl(Object valueToAdd){
		value = valueToAdd;
		errorMsg = null;
	}

	public boolean hasError(){
		if (this.errorMsg == null){
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
			return errorMsg;
		}
	}
	public Object getReturnValue(){
		return value;
	}

	public String toString(){
		if (this.errorMsg != null){
			return "" + errorMsg;
		}
		else{
			return "" + value;
		}
	}

}

public class ReturnObjectImpl implements ReturnObject{

	private Object Value;
	private ErrorMessage errorMsg;

	public ReturnObjectImpl(ErrorMessage msg){
		this.errorMsg = msg;
		this.Value = null;
	}

	public ReturnObjectImpl(Object valueToAdd){
		this.Value = valueToAdd;
		this.errorMsg = null;
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
			return this.errorMsg;
		}
	}
	public Object getReturnValue(){
		return this.Value;
	}

	public String toString(){
		if (this.errorMsg != null){
			return "" + this.errorMsg;
		}
		else{
			return "" + this.Value;
		}
	}

}

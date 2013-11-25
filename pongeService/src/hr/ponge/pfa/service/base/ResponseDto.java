package hr.ponge.pfa.service.base;

import hr.ponge.util.ProxyMethod;

public interface ResponseDto extends Dto {

	@ProxyMethod(origMethod = "getErrors")
	public ErrorType[] getErrors_();

	@ProxyMethod(origMethod = "setErrors")
	public void setErrors_(ErrorType[] param);

	@ProxyMethod(origMethod = "addErrors")
	public void addErrors_(ErrorType param);
}

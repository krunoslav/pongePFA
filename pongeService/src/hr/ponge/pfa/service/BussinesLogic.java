package hr.ponge.pfa.service;

import hr.ponge.pfa.service.base.ErrorType;
import hr.ponge.util.PfaSingleton;

public abstract class BussinesLogic {

	public ErrorType createError(String errorCode, String errorMessageKey,
			String... params) {

		ErrorType er = PfaSingleton.getReference()
				.createObject(ErrorType.class);
		er.setErrorCode(errorCode);
		er.setErrorMessageKey(errorMessageKey);
		er.setErrorParams(params);

		return er;
	}

}

package hr.ponge.util;

import hr.ponge.pfa.service.base.ErrorType;

import java.util.ArrayList;
import java.util.List;

public class PlainTest {
	
	public static void main(String[] args) {
		PlainTest pt= new PlainTest();
		pt.test();
	}

	
	public void test(){
		List<ErrorType> errors = new ArrayList<ErrorType>();
		ErrorType e= new hr.ponge.pfa.axis.base.ErrorType();
		e.setErrorCode("11111");
		errors.add(e);
		
		ErrorType[] array = errors.toArray(new ErrorType[errors.size()]);
		hr.ponge.pfa.axis.base.ErrorType[] ar = new hr.ponge.pfa.axis.base.ErrorType[1]; 
		ar[0]=(hr.ponge.pfa.axis.base.ErrorType) e;
	}
}

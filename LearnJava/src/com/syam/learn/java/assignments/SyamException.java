package com.syam.learn.java.assignments;

public class SyamException extends RuntimeException {
	
	String eReason;

	public SyamException(String string) {
		eReason = string;
	}
	
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return eReason;
	}

}

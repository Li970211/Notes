package com.lijia.execption;

public class NameException extends StudentException {
	private static final long serialVersionUID = 1L;
	
	public NameException(){
		super();
	}
	public NameException(String message){
		super(message);
	}

}

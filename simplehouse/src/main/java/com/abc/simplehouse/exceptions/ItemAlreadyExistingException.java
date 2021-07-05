package com.abc.simplehouse.exceptions;

public class ItemAlreadyExistingException extends RuntimeException{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	public ItemAlreadyExistingException(String message)
	{
		super(message);
	}

}

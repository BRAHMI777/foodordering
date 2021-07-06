package com.abc.simplehouse.exceptions;

public class ItemNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	public ItemNotFoundException(String msg)
	{
		super(msg);
	}

}

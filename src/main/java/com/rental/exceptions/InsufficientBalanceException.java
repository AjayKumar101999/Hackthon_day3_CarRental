package com.rental.exceptions;

public class InsufficientBalanceException extends GlobalException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	
	public InsufficientBalanceException(String message) {
		super(message,GlobalErrorCode.ERROR_RESOURCE_NOT_FOUND);
	}
	public InsufficientBalanceException() {
		super("User Not Found exception",GlobalErrorCode.ERROR_RESOURCE_NOT_FOUND);
	}
	
}

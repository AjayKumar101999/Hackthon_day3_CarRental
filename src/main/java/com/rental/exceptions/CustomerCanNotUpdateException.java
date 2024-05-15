package com.rental.exceptions;


public class CustomerCanNotUpdateException extends GlobalException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CustomerCanNotUpdateException(String message) {
		super(message,GlobalErrorCode.ERROR_RESOURCE_NOT_FOUND);
	}
	public CustomerCanNotUpdateException() {
		super("Customer Cant Create/Update the Car Table",GlobalErrorCode.ERROR_RESOURCE_NOT_FOUND);
	}


}

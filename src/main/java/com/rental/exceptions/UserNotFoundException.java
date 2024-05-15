package com.rental.exceptions;


public class UserNotFoundException extends GlobalException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public UserNotFoundException(String message) {
		super(message,GlobalErrorCode.ERROR_RESOURCE_NOT_FOUND);
	}
	public UserNotFoundException() {
		super("User Not Found exception",GlobalErrorCode.ERROR_RESOURCE_NOT_FOUND);
	}


}

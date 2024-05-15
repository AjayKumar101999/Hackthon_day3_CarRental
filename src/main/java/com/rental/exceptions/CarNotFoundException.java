package com.rental.exceptions;


public class CarNotFoundException extends GlobalException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CarNotFoundException(String message) {
		super(message,GlobalErrorCode.ERROR_RESOURCE_NOT_FOUND);
	}
	public CarNotFoundException() {
		super("Car Not added yet",GlobalErrorCode.ERROR_RESOURCE_NOT_FOUND);
	}


}

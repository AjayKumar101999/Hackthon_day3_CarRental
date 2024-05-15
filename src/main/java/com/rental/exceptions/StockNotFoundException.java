package com.rental.exceptions;

public class StockNotFoundException extends GlobalException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	public StockNotFoundException(String message) {
//		super(message);
//	}
//	public StockNotFoundException() {
//		super("User Not Found exception");
//	}
	
	
	public StockNotFoundException(String message) {
		super(message,GlobalErrorCode.ERROR_RESOURCE_NOT_FOUND);
	}
	public StockNotFoundException() {
		super("User Not Found exception",GlobalErrorCode.ERROR_RESOURCE_NOT_FOUND);
	}
}

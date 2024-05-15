package com.rental.exceptions;

public class ResourceConflictException extends GlobalException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ResourceConflictException(String message) {
		super(message,GlobalErrorCode.ERROR_RESOURCE_CONFLICT_EXISTS);
	}
	public ResourceConflictException() {
		super("Resource conflict exception",GlobalErrorCode.ERROR_RESOURCE_CONFLICT_EXISTS);
	}

}

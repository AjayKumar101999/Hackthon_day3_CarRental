package com.rental.exceptions;

public class GlobalErrorCode {

	public static final String ERROR_RESOURCE_NOT_FOUND = "404";
	public static final String ERROR_RESOURCE_CONFLICT_EXISTS = "409";
	public static final String ERROR_UNAUTHOURIZED_EMPLOYEE = "401";
	public static final String ERROR_BAD_REQUEST = "400";

	private GlobalErrorCode() {
		super();
	}

}

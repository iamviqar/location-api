package com.hqv.location.exception;

public class UniqueRecordException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UniqueRecordException(String message, Throwable cause) {
		super(message, cause);
	}

	public UniqueRecordException(String message) {
		super(message);
	}

	public UniqueRecordException(Throwable cause) {
		super(cause);
	}

	public UniqueRecordException() {
		super();
	}

}

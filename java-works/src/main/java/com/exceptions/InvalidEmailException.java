package com.exceptions;

public class InvalidEmailException {

	private String msg;

	public InvalidEmailException() {

	}

	public InvalidEmailException(String msg) {
		this.msg = msg;
	}

	public String toString() {
		return "InvalidEmailExceptionn [msg=" + msg + "]";
	}

	public String getMessage() {
		return "MESSAGE: " + msg;
	}

}

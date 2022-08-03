package com.exceptions;

public class InvalidNumberException {
	private String msg;

	public InvalidNumberException() {

	}

	public InvalidNumberException(String msg) {
		this.msg = msg;
	}

	public String toString() {
		return "InvalidNumberExceptionn [msg=" + msg + "]";
	}

	public String getMessage() {
		return "MESSAGE: " + msg;
	}

}

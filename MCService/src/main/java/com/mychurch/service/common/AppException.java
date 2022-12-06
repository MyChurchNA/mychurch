package com.mychurch.service.common;

public class AppException extends Exception {

	public AppException(int errcode, String message, boolean notification) {
		super(message);
		this.errcode = errcode;
		this.notification = notification;
	}

	public AppException(int errcode, String message) {
		super(message);
		this.errcode = errcode;
	}

	public AppException(String message) {
		super(message);
		this.errcode = -1;
	}

	private static final long serialVersionUID = 1L;
	public int errcode;
	public boolean notification = false;

	public String toJson() {
		return "{\"errcode\":" + errcode + ",\"message\":\"" + this.getMessage() + "\"}";
	}

}

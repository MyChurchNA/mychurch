package com.mychurch.service.system;

public final class SystemVars {
	private static String APPID = "MCSERVICE";
	public static final String SYS_API_PREFIX = "/mcservice/api";

	private SystemVars() {
		throw new InstantiationError("Must not instantiate this class");
	}

	public static String getAPPID() {
		return APPID;
	}
}

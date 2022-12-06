package com.mychurch.service.common;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseRest {

	@Autowired
	protected HttpServletRequest request;

}

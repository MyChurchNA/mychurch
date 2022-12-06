package com.mychurch.service.system;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.mychurch.service.common.AppException;

@ControllerAdvice
@ComponentScan(basePackages = { "com.mychurch.service" })
public class ControllerAdviceHandler {

	private static final Logger logger = LoggerFactory.getLogger(ControllerAdviceHandler.class);

	@ExceptionHandler(AppException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<String> handleAppException(final AppException e) {
		e.printStackTrace();
		logger.debug(e.getMessage(), e);
		return ResponseEntity.badRequest().body(e.toJson());
	}

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<String> handleException(final Exception e) {
		e.printStackTrace();
		logger.debug(e.getMessage(), e);
		return ResponseEntity.badRequest().body("{\"errcode\":" + HttpStatus.BAD_REQUEST.value() + ",\"message\":\"" + e.getMessage() + "\"}");
	}

	public String getStackTrace(final Throwable throwable) {
		final StringWriter sw = new StringWriter();
		final PrintWriter pw = new PrintWriter(sw, true);
		throwable.printStackTrace(pw);
		return sw.getBuffer().toString();
	}

}

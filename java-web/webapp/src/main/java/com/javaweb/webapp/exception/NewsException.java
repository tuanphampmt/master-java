package com.javaweb.webapp.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NewsException extends Exception {
	private static final long serialVersionUID = 7838223077902910679L;

	private String message;
	private int status;

}

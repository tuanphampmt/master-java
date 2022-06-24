package com.javaweb.webapp.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewsResponse {

	private String message;
	private int status;
	private Object data;

	public NewsResponse(String message, int status, Object data) {
		super();
		this.message = message;
		this.status = status;
		this.data = data;
	}

	public NewsResponse(String message, int status) {
		super();
		this.message = message;
		this.status = status;
	}

}

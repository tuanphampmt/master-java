package com.javaweb.webapp.response;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaginationResponse<T> {

	private int page;
	private int totalPages;
	List<T> listResult = new ArrayList<>();
}

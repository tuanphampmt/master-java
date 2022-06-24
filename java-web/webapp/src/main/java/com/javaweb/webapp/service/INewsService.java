package com.javaweb.webapp.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.javaweb.webapp.dto.NewsDTO;
import com.javaweb.webapp.response.PaginationResponse;

public interface INewsService {

	NewsDTO save(NewsDTO newsDTO) throws Exception;
	void delete(long[] ids) throws Exception;
	List<NewsDTO> findAll(Pageable pageable) throws Exception;
	int totalItems() throws Exception;
	PaginationResponse<NewsDTO> pagination(int page, int limit) throws Exception;
}

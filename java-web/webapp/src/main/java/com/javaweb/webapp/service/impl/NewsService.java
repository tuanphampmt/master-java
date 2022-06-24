package com.javaweb.webapp.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.javaweb.webapp.common.constant;
import com.javaweb.webapp.converter.NewsConverter;
import com.javaweb.webapp.dto.NewsDTO;
import com.javaweb.webapp.entity.CategoryEntity;
import com.javaweb.webapp.entity.NewsEntity;
import com.javaweb.webapp.exception.NewsException;
import com.javaweb.webapp.repository.CategoryRepository;
import com.javaweb.webapp.repository.NewsRepository;
import com.javaweb.webapp.response.PaginationResponse;
import com.javaweb.webapp.service.INewsService;

@Service
public class NewsService implements INewsService {

	@Autowired
	private NewsRepository newsRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private NewsConverter newsConverter;

//	@Override
//	public NewsDTO save(NewsDTO newsDTO) throws Exception {
//		NewsEntity newsEntity = new NewsEntity();
//		if (newsDTO.getId() != null) {
//			Optional<NewsEntity> optionalOldNewsEntity = newsRepository.findById(newsDTO.getId());
//			if (!optionalOldNewsEntity.isPresent()) {
//				throw new NewsException("Posts not found by Id: " + newsDTO.getId(), constant.HTTP_STATUS_BAD_REQUEST);
//			}
//			newsEntity = newsConverter.toEntity(newsDTO, optionalOldNewsEntity.get());
//		} else {
//			newsEntity = newsConverter.toEntity(newsDTO);
//		}
//		CategoryEntity category = categoryRepository.findOneByCode(newsDTO.getCategoryCode());
//		if (category == null) {
//			throw new NewsException("Couldn't find the post category", constant.HTTP_STATUS_BAD_REQUEST);
//		}
//		newsEntity.setCategory(category);
//		newsEntity = newsRepository.save(newsEntity);
//		return newsConverter.toDTO(newsEntity);
//	}
	
	@Override
	public NewsDTO save(NewsDTO newsDTO) throws Exception {
		NewsEntity newsEntity = new NewsEntity();
		if (newsDTO.getId() != null) {
			Optional<NewsEntity> optionalOldNewsEntity = newsRepository.findByNewsId(newsDTO.getId());
			if (!optionalOldNewsEntity.isPresent()) {
				throw new NewsException("Posts not found by Id: " + newsDTO.getId(), constant.HTTP_STATUS_BAD_REQUEST);
			}
			newsEntity = newsConverter.toEntity(newsDTO, optionalOldNewsEntity.get());
		} else {
			newsEntity = newsConverter.toEntity(newsDTO);
		}
		Optional<CategoryEntity> optionalCategory = categoryRepository.findCategoryByCode(newsDTO.getCategoryCode());
		if (!optionalCategory.isPresent()) {
			throw new NewsException("Couldn't find the post category", constant.HTTP_STATUS_BAD_REQUEST);
		}
		newsEntity.setCategory(optionalCategory.get());
		newsEntity = newsRepository.save(newsEntity);
		return newsConverter.toDTO(newsEntity);
	}

//	@Override
//	public void delete(long[] ids) throws Exception {
//		for (long id : ids) {
//			newsRepository.deleteById(id);
//		}
//	}
	
	@Override
	public void delete(long[] ids) throws Exception {
		for (long id : ids) {
			newsRepository.deleteById(id);
		}
	}

	@Override
	public List<NewsDTO> findAll(Pageable pageable) throws Exception {
		List<NewsDTO> listNewsDTO = new ArrayList<>();
		List<NewsEntity> listNewsEntity = newsRepository.findAll(pageable).getContent();
		listNewsEntity.stream().forEach(Item -> listNewsDTO.add(newsConverter.toDTO(Item)));
		return listNewsDTO;
	}

	@Override
	public int totalItems() throws Exception {
		return (int) newsRepository.count();
	}

	@Override
	public PaginationResponse<NewsDTO> pagination(int page, int limit) throws Exception {
		PaginationResponse<NewsDTO> result = new PaginationResponse<NewsDTO>();
		result.setPage(page);
		Pageable pageable = PageRequest.of(page - 1, limit);
		result.setListResult(this.findAll(pageable));
		result.setTotalPages((int) Math.ceil((double) (this.totalItems()) / limit));
		return result;
	}
}

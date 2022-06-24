package com.javaweb.webapp.converter;

import org.springframework.stereotype.Component;

import com.javaweb.webapp.dto.NewsDTO;
import com.javaweb.webapp.entity.NewsEntity;

@Component
public class NewsConverter {

	public NewsEntity toEntity(NewsDTO dto) {
		NewsEntity entity = new NewsEntity();
		entity.setTitle(dto.getTitle());
		entity.setShortDescription(dto.getShortDescription());
		entity.setThumbnail(dto.getThumbnail());
		entity.setContent(dto.getContent());
		return entity;
	}

	public NewsDTO toDTO(NewsEntity entity){
		NewsDTO dto = new NewsDTO();
		if (entity.getId() != null) {
			dto.setId(entity.getId());
		}
		dto.setTitle(entity.getTitle());
		dto.setShortDescription(entity.getShortDescription());
		dto.setThumbnail(entity.getThumbnail());
		dto.setContent(entity.getContent());
//		dto.setCategoryCode(entity.getCategory().getCode());

//		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String createDate = df.format(entity.getCreatedDate());
//		String modifiedDate = df.format(entity.getModifiedDate());
//		dto.setCreatedDate(df.parse(createDate).toString());
//		dto.setModifiedDate(df.parse(modifiedDate).toString());
		dto.setCreatedDate(entity.getCreatedDate());
		dto.setModifiedDate(entity.getModifiedDate());
		return dto;
	}

	public NewsEntity toEntity(NewsDTO dto, NewsEntity entity) {
		entity.setTitle(dto.getTitle());
		entity.setShortDescription(dto.getShortDescription());
		entity.setThumbnail(dto.getThumbnail());
		entity.setContent(dto.getContent());
		return entity;
	}
}

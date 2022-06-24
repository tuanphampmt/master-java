package com.javaweb.webapp.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewsDTO extends AbstractDTO<NewsDTO> {

	@NotBlank(message = "Title is require") // dùng cho kiểu String
	private String title;
	
	@NotBlank(message = "Thumbnail is require")
	private String thumbnail;
	
	@NotBlank(message = "Short Description is require")
	private String shortDescription;
	
	@NotBlank(message = "Content is require")
	private String content;
	
	@NotBlank(message = "Category Code is require")
	private String categoryCode;
	
	@NotEmpty(message = "ids Code is require") // dùng cho StringBuffer và StringBuilder, Collection, Map, Array
	private List<Integer> ids;
	
	@NotNull(message = "count Code is require") // dùng cho int, long, float, double, char, byte...
	private Integer count;

}

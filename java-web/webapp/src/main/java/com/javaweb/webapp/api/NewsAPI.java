package com.javaweb.webapp.api;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.webapp.common.constant;
import com.javaweb.webapp.dto.NewsDTO;
import com.javaweb.webapp.dto.PersonDTO;
import com.javaweb.webapp.exception.NewsException;
import com.javaweb.webapp.response.NewsResponse;
import com.javaweb.webapp.service.INewsService;

@RestController
@RequestMapping("api/news")
public class NewsAPI {

	@Autowired
	private INewsService newsService;

	@GetMapping(value = { "", "/{id}" })
	public ResponseEntity<Object> getNews(@RequestParam("page") int page, @RequestParam("limit") int limit,
			@PathVariable(value = "id", required = false) Optional<String> opt) {
		// nếu id = null thì get all còn nếu id != null thì get by key
		if (opt.isPresent()) {
			return null;
		}

		try {
			return new ResponseEntity<>(newsService.pagination(page, limit), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new NewsResponse(e.getMessage(), constant.HTTP_STATUS_BAD_REQUEST),
					HttpStatus.BAD_REQUEST);
		}

	}

	@PostMapping
	public ResponseEntity<Object> createNews(@Valid @RequestBody NewsDTO newsDTO) {
		try {
			NewsDTO result = newsService.save(newsDTO);
			return new ResponseEntity<>(new NewsResponse("Create post successfully.", constant.HTTP_STATUS_OK, result),
					HttpStatus.OK);
		} catch (NewsException e) {
			e.printStackTrace();
			return new ResponseEntity<>(
					new NewsResponse("The post creation process failed. " + e.getMessage(), e.getStatus()),
					HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new NewsResponse(e.getMessage(), constant.HTTP_STATUS_INTERNAL_SERVER_ERROR),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<Object> updateNews(@RequestBody NewsDTO newsDTO, @PathVariable("id") long id) {
		try {
			newsDTO.setId(id);
			NewsDTO result = newsService.save(newsDTO);
			return new ResponseEntity<>(new NewsResponse("Post update successfully.", constant.HTTP_STATUS_OK, result),
					HttpStatus.OK);
		} catch (NewsException e) {
			e.printStackTrace();
			return new ResponseEntity<>(new NewsResponse("Data update failed. " + e.getMessage(), e.getStatus()),
					HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new NewsResponse(e.getMessage(), constant.HTTP_STATUS_INTERNAL_SERVER_ERROR),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping
	public ResponseEntity<Object> deleteNews(@RequestBody long[] ids) {
		try {
			newsService.delete(ids);
			return new ResponseEntity<>(new NewsResponse("Post deleted successfully.", constant.HTTP_STATUS_OK),
					HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new NewsResponse(e.getMessage(), constant.HTTP_STATUS_BAD_REQUEST),
					HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/person")
	public ResponseEntity<Object> createPerson(@Valid @RequestBody PersonDTO PersonDTO) {
		try {
			return new ResponseEntity<Object>("Create Person successfully", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new NewsResponse(e.getMessage(), constant.HTTP_STATUS_INTERNAL_SERVER_ERROR),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = ((FieldError) error).getField();
			String errorMessage = error.getDefaultMessage();
			errors.put(fieldName, errorMessage);
		});
		return errors;
	}
}

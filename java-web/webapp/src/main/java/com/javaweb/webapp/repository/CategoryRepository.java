package com.javaweb.webapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.javaweb.webapp.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
//	CategoryEntity findOneByCode(String code);
	
// 	Đây là Native SQL	
//	@Query(value = "select * from category c where c.code = ?1", nativeQuery = true)
//	Optional<CategoryEntity> findCategoryByCode(String code);
	
// 	Đây là Native SQL	
	@Query(value = "select * from category c where c.code = :code", nativeQuery = true)
	Optional<CategoryEntity> findCategoryByCode(@Param("code") String code);
}

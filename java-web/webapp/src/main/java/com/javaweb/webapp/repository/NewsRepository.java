package com.javaweb.webapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.javaweb.webapp.entity.CategoryEntity;
import com.javaweb.webapp.entity.NewsEntity;

public interface NewsRepository extends JpaRepository<NewsEntity, Long> {
	// tham số thứ 2 là kiểu dữ liệu khóa chính

// 	Đây là Native SQL	
//	@Query(value = "select * from news n where n.id = ?1", nativeQuery = true)
//	Optional<NewsEntity> findByNewsId(Long id);
	
// 	Đây là Native SQL	
	@Query(value = "select * from news n where n.id = :id", nativeQuery = true)
	Optional<NewsEntity> findByNewsId(@Param("id") Long id);
	
// 	Đây là Native SQL	
	@Query(value = "select * from news n where n.id = :id", nativeQuery = true)
	Optional<NewsEntity> deleteNews(@Param("id") Long id);
	
// 	Đây là Native SQL
	@Modifying
	@Query(value = "update news n set n.status = :status where u.name = :name", nativeQuery = true)
	Optional<NewsEntity> updateNewsForId(@Param("id") Long id);
}

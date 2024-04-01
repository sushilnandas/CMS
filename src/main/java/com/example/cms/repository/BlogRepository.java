package com.example.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cms.entity.Blog;

import lombok.AllArgsConstructor;


@Repository

public interface BlogRepository extends JpaRepository<Blog, Integer>{

	
	
	
}

package com.adriano.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.adriano.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	// Query Methods - Consultador documentação
	List<Post> findByTitleContainingIgnoreCase(String text);
	
	
}

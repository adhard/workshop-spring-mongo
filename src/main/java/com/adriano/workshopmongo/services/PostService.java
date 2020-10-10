package com.adriano.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriano.workshopmongo.domain.Post;
import com.adriano.workshopmongo.domain.User;
import com.adriano.workshopmongo.dto.UserDTO;
import com.adriano.workshopmongo.repository.PostRepository;
import com.adriano.workshopmongo.repository.UserRepository;
import com.adriano.workshopmongo.services.exception.ObjectNotFoundException;

import java.util.Optional;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Post não encontrado"));
	}
	
	
}

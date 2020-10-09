package com.adriano.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.adriano.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{ //String é o tipo  do int (que é nossa chave seriazable)
	
	
	
	
}

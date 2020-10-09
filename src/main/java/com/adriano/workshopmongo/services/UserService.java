package com.adriano.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriano.workshopmongo.domain.User;
import com.adriano.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	// Responsável por retornar todos os usuarios do banco de dados
	public List<User> findAll(){
		return repo.findAll();
	}
}

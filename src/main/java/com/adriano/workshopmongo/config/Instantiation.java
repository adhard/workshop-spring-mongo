package com.adriano.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.adriano.workshopmongo.domain.User;
import com.adriano.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		userRepository.deleteAll();
		
		User userSeed1 = new User(null, "John Smith", "john@mail.com");
		User userSeed2 = new User(null, "Joe Doe", "joe@mail.com");
		User userSeed3 = new User(null, "Uncle Bob", "bob@mail.com");
		
		userRepository.saveAll(Arrays.asList(userSeed1, userSeed2, userSeed3));
		
	}
	
}

package com.adriano.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.adriano.workshopmongo.domain.Post;
import com.adriano.workshopmongo.domain.User;
import com.adriano.workshopmongo.repository.PostRepository;
import com.adriano.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		/* Seed Users */
		User userSeed1 = new User(null, "John Smith", "john@mail.com");
		User userSeed2 = new User(null, "Joe Doe", "joe@mail.com");
		User userSeed3 = new User(null, "Uncle Bob", "bob@mail.com");
		userRepository.saveAll(Arrays.asList(userSeed1, userSeed2, userSeed3));
		
		/* Seed Posts */
		Post post1 = new Post(null,sdf.parse("21/03/2018"), "Partiu Viagem", "Vou viajar para Gramado!", userSeed1);
		Post post2 = new Post(null,sdf.parse("23/03/2018"), "Bom dia!", "Tenha um bom dia.", userSeed1);
		postRepository.saveAll(Arrays.asList(post1, post2));
	}
	
}

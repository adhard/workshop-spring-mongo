package com.adriano.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adriano.workshopmongo.domain.User;
import com.adriano.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET)
	// Ou:
	// @GetMapping
	public ResponseEntity<List<User>> findAll(){ // ctrl + shift + o => gerar imports automaticos
//		User maria = new User("1","Maria","maria@gmail.com");
//		User alex = new User("2","Alex","alex@gmail.com");
//		List<User> list = new ArrayList<>();
//		list.addAll(Arrays.asList(maria, alex));
		
		
		List <User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}

package com.vishnu.Validation.controller;

import com.vishnu.Validation.models.User;
import com.vishnu.Validation.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("v1/user")
	public String addUser(@RequestBody @Valid User user){
		return userService.addUser(user);
	}

	@GetMapping("v1/users")
	public List<User> getUsers(){
		return userService.getUsers();
	}

	@GetMapping("v1/users/{id}")
	public Object getUser(@PathVariable Integer id){
		return userService.getUser(id);
	}

	@PutMapping("v1/users/{id}")
	public String updateUser(@PathVariable Integer id,@RequestBody @Valid User user){
		return userService.update(id,user);
	}

	@DeleteMapping("v1/users/{id}")
	public String deleteUser(@PathVariable Integer id){
		return userService.deleteUser(id);
	}
}

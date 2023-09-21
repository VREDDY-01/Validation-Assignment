package com.vishnu.Validation.service;

import com.vishnu.Validation.models.User;
import com.vishnu.Validation.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
	@Autowired
	UserRepo userRepo;

	public String addUser(User user) {
		userRepo.getUserList().add(user);
		return "1 user added";
	}

	public List<User> getUsers() {
		return userRepo.getUserList();
	}

	public Object getUser(Integer id) {
		for (User user:userRepo.getUserList()){
			if (user.getUserId().equals(id)){
				return user;
			}
		}
		return "error with id: "+id;
	}

	public String deleteUser(Integer id) {
		for (User user:userRepo.getUserList()){
			if (user.getUserId().equals(id)){
				userRepo.getUserList().remove(user);
				return "deleted user with id: "+id;
			}
		}
		return "Invalid Id";
	}

	public String update(Integer id, User updatedUser) {
		for (User user:userRepo.getUserList()){
			if (user.getUserId().equals(id)){
				user.setUsername(updatedUser.getUsername());
				user.setDateOfBirth(updatedUser.getDateOfBirth());
				user.setEmail(updatedUser.getEmail());
				user.setPhoneNumber(updatedUser.getPhoneNumber());
				return "updated user with id: "+id;
			}
		}
		return "Invalid Id";
	}
}

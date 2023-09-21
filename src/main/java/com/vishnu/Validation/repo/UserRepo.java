package com.vishnu.Validation.repo;

import com.vishnu.Validation.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {
	@Autowired
	private List<User> userList;

	public List<User> getUserList() {
		return userList;
	}
}

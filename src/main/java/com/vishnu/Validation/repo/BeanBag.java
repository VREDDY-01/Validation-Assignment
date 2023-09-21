package com.vishnu.Validation.repo;

import com.vishnu.Validation.models.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanBag {
	@Bean
	public List<User> getUserList(){
		return new ArrayList<>();
	}
}

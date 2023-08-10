package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
	
	private final UserRepository userRepository;

	@Override
	public User findByUserName(String userName) {
		User user=userRepository.findByUserName(userName);
		if(user==null) {
			return null;
		}
		else {
			return user;
		}
	}

	@Override
	public User findByUserId(Long id) {
		
		Optional<User> optionalUser=userRepository.findById(id);
		if(optionalUser.isPresent()) {
			return optionalUser.get();
		}
		else {
			return null;
		}
		
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

}

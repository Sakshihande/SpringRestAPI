package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository userRepository;
	public List<User> listAllUser(){
		return userRepository.findAll();
	}
	//INSERT ONE RECORD
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findById(37).get();
	}
		public void deleteUser(Integer id) {
			userRepository.deleteById(36);
			
	}

}

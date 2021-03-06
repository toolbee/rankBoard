package com.rankBoard.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rankBoard.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
    private LoginRepository loginRepository;
	
	public String requestLogin(String id, String password) {
		
		return loginRepository.requestLoginUsingCustomQuery(id, password);
	}

}

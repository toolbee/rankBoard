package com.rankBoard.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rankBoard.domain.PlayerRecord;
import com.rankBoard.domain.User;
import com.rankBoard.service.BoardService;
import com.rankBoard.service.LoginService;

@Controller	
public class LoginController {

	Logger logger = Logger.getLogger(LoginController.class.getName());

	private LoginService service;
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
		
        return "html/login/loginLayout.html";
    }
	
	
	
	@RequestMapping(value = "/requestLogin", method = RequestMethod.POST)
    @ResponseBody
    public String requestLogin(Model model) {
		
		User user = new User();
		Map<?,?> map = model.asMap();
		
		@SuppressWarnings("unchecked")
		Set<String> keys = (Set<String>) map.keySet();
		
		String id = (String) map.get("id");
		String password = (String) map.get("password");

		String result = service.requestLogin(id, password);
		
        return result;
    }
	
	
}

package com.rankBoard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommonController {

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
		
        return "html/record/listLayout.html";
    }
	
}

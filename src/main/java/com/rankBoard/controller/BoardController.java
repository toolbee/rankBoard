package com.rankBoard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller	
public class BoardController {

	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
    //@ResponseStatus(value = HttpStatus.OK)
    public String list(Model model) {
		
        return "list.html";
    }
}

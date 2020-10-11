package com.rankBoard.controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rankBoard.service.BoardService;

@Controller	
public class BoardController {

	Logger logger = Logger.getLogger(BoardController.class.getName());

	private BoardService service;
	
	

	@RequestMapping(value = "/list", method = RequestMethod.GET)
    //@ResponseStatus(value = HttpStatus.OK)
    public String list(Model model) {
		
//        return "html/record/list.html";
        return "html/record/listLayout.html";
    }
	
	
	@RequestMapping(value = "/viewDetail", method = RequestMethod.GET)
    public String viewDetail(@RequestParam("seq") int seq) {

        return "html/record/detailLayout.html";
    }
	
	
	@RequestMapping(value = "/matchList", method = RequestMethod.GET)
    public String matchList(Model model) {
		
        return "html/record/matchListLayout.html";
    }
	
	@RequestMapping(value = "/writeMatch", method = RequestMethod.GET)
    public String writeMatch(Model model) {
		
        return "html/record/write.html";
    }
	
	
}

package com.rankBoard.controller;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller	
public class BoardController {

	Logger logger = Logger.getLogger(BoardController.class.getName());

	@RequestMapping(value = "/list", method = RequestMethod.GET)
    //@ResponseStatus(value = HttpStatus.OK)
    public String list(Model model) {
		
//        return "list.html";
        return null;
    }
	
	@RequestMapping(value = "/putLocationData", method = RequestMethod.POST)
    @ResponseBody
    public String putLocationData(@RequestParam Map map) {

		String uuid = (String) map.get("uuid");
		String latitude = (String) map.get("latitude");
		String longitude = (String) map.get("longitude");
		String address = (String) map.get("address");
		
		String result = uuid + "+" + latitude + "+" + longitude;
		logger.log(Level.INFO, "#INPUT : "+uuid+"/"+latitude+"/"+longitude+" #OUTPUT : "+result);
		
        return result;
    }
}

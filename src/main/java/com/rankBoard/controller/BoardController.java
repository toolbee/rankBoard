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
import com.rankBoard.service.BoardService;

@Controller	
public class BoardController {

	Logger logger = Logger.getLogger(BoardController.class.getName());

	private BoardService service;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String mainList(Model model) {
		
        return "list.html";
    }
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
    //@ResponseStatus(value = HttpStatus.OK)
    public String list(Model model) {
		
        return "list.html";
    }
	
	
	@RequestMapping(value = "/getPlayerList", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<PlayerRecord> getPlayerList(Model model) {
		
		Iterable<PlayerRecord> playerRecordList = service.findAll();
		
        return playerRecordList;
    }
	
	
	@RequestMapping(value = "/getPlayerOne", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<PlayerRecord> getPlayerOne(Model model) {
		
		String nameToFind = "변지훈";
		Page<PlayerRecord> recordByName = service.findByPlayers(nameToFind, PageRequest.of(0, 10));
		
		logger.info(recordByName.toString());
		
        return recordByName;
    }
	
	
	@RequestMapping(value = "/updateRecord", method = RequestMethod.POST)
    @ResponseBody
    public Iterable<PlayerRecord> updateRecord(Model model) {
		
		PlayerRecord record = new PlayerRecord();
		Map<?,?> map = model.asMap();
		
		@SuppressWarnings("unchecked")
		Set<String> keys = (Set<String>) map.keySet();
		
		record.setName((String) map.get("name"));
		record.setNickname((String) map.get("nickname"));
		record.setPhoto((String) map.get("photo"));
		record.setRivalry((Map<?,?>) map.get("rivalry"));
		record.setSeq(Integer.parseInt((String) map.get("seq")));
		record.setTeam((String[]) map.get("team"));
		record.setTeamMatch((Map[]) map.get("teamMatch"));
		record.setTribe((String) map.get("tribe"));
		
		keys.forEach(key -> System.out.println(key));
		
		Page<PlayerRecord> recordByName = (Page<PlayerRecord>) service.save(record);
		
		logger.info(recordByName.toString());
		
        return recordByName;
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

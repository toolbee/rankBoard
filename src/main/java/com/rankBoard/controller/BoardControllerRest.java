package com.rankBoard.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rankBoard.domain.MatchRecord;
import com.rankBoard.domain.PlayerRecord;
import com.rankBoard.service.BoardService;
import com.rankBoard.service.RecordService;

@Controller	
public class BoardControllerRest {

	Logger logger = Logger.getLogger(BoardControllerRest.class.getName());

	@Resource
	private BoardService service;
	
	@Resource
	private RecordService recordService;
	
	
	@RequestMapping(value = "/getPlayerList", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<PlayerRecord> getPlayerList(Model model) {
		
		Iterable<PlayerRecord> playerRecordList = recordService.findAll();
		
        return playerRecordList;
    }
	
	
	@RequestMapping(value = "/selectAll", method = RequestMethod.POST)
    @ResponseBody
    public List<MatchRecord> selectAll(Model model) throws Exception {
		
		List<MatchRecord> list = service.selectAll();
		
        return list;
    }
	
	
	
	@RequestMapping(value = "/selectOne", method = RequestMethod.POST)
	@ResponseBody
    public PlayerRecord selectOne(@RequestParam("seq") String seq, Model model) {
		PlayerRecord playerRecord = null;
		//String seq2 = Integer.toString(seq);
		playerRecord = recordService.findBySeq(seq);
		
		//model.addAttribute("playerRecord", playerRecord);
		//model.addAttribute("seq", seq);
		
        return playerRecord;
    }
	
	
	@RequestMapping(value = "/getPlayerOne", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<PlayerRecord> getPlayerOne(Model model) {
		
		String nameToFind = "변지훈";
		Page<PlayerRecord> recordByName = recordService.findByPlayers(nameToFind, PageRequest.of(0, 10));
		
		logger.info(recordByName.toString());
		
        return recordByName;
    }
	
	
	@RequestMapping(value = "/writeRecord", method = RequestMethod.POST)
    @ResponseBody
    public void writeRecord(@RequestParam Model model) throws Exception {
		
		MatchRecord record = new MatchRecord();
		Map<?,?> map = model.asMap();
		
		@SuppressWarnings("unchecked")
		Set<String> keys = (Set<String>) map.keySet();
		
		
		
		keys.forEach(key -> System.out.println(key));
		
		service.insert(record);
		
    }
	
	
	@RequestMapping(value = "/editRecord", method = RequestMethod.POST)
    @ResponseBody
    public Iterable<PlayerRecord> editRecord(Model model) {
		
		PlayerRecord record = new PlayerRecord();
		Map<?,?> map = model.asMap();
		
		@SuppressWarnings("unchecked")
		Set<String> keys = (Set<String>) map.keySet();
		
		String id = (String) map.get("seq");
		record.setName((String) map.get("name"));
		record.setNickname((String) map.get("nickname"));
		record.setPhoto((String) map.get("photo"));
		record.setRivalry((Map<?,?>) map.get("rivalry"));
		record.setSeq(Integer.parseInt((String) map.get("seq")));
		record.setTeam((String[]) map.get("team"));
		record.setTeamMatch((Map[]) map.get("teamMatch"));
		record.setTribe((String) map.get("tribe"));
		
		// id 존재하면 update 
		if(recordService.findById(id)) {
			
		} else {
			// 존재하지 않으면 insert
		}
		
		keys.forEach(key -> System.out.println(key));
		
		Page<PlayerRecord> recordByName = (Page<PlayerRecord>) recordService.save(record);
		
		logger.info(recordByName.toString());
		
        return recordByName;
    }
	
	
	@RequestMapping(value = "/insertRecord", method = RequestMethod.POST)
    @ResponseBody
    public Iterable<PlayerRecord> insertRecord(Model model) {
		
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
		
		Page<PlayerRecord> recordByName = (Page<PlayerRecord>) recordService.save(record);
		
		logger.info(recordByName.toString());
		
        return recordByName;
    }
}

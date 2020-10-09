package com.rankBoard.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.rankBoard.domain.PlayerRecord;


public interface RecordService {

	public boolean findById(String id);
	
    public PlayerRecord save(PlayerRecord playerRecord);	
 
    public void delete(PlayerRecord playerRecord);
 
	/*
	 * public Optional<PlayerRecord> findOne(Integer number) { // return
	 * boardRepository.findById(number); }
	 */
    
    public Iterable<PlayerRecord> findAll();
 
    public Page<PlayerRecord> findByPlayers(String name, Pageable pageable);
    
    public PlayerRecord findBySeq(String seq);
    
	public void getRecordAll();

	
 
	/*
	 * public List<MatchRecord> findByPlayer(String player) { return
	 * boardRepository.findByPlayer(player); }
	 */
}

package com.rankBoard.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.rankBoard.domain.MatchRecord;
import com.rankBoard.domain.PlayerRecord;
import com.rankBoard.repository.BoardRepository;

@Service
public class BoardService {

	@Autowired
    private BoardRepository boardRepository;
 
	public boolean findById(String id) {
        return boardRepository.existsById(id);
    }
	
    public PlayerRecord save(PlayerRecord playerRecord) {
        return boardRepository.save(playerRecord);
    }	
 
    public void delete(PlayerRecord playerRecord) {
        boardRepository.delete(playerRecord);
    }
 
	/*
	 * public Optional<PlayerRecord> findOne(Integer number) { // return
	 * boardRepository.findById(number); }
	 */
    
    public Iterable<PlayerRecord> findAll() {
        return boardRepository.findAll();
    }
 
    public Page<PlayerRecord> findByPlayers(String name, Pageable pageable) {
        return boardRepository.findByPlayers(name, pageable);
    }
    
    public PlayerRecord findBySeq(int seq) {
        return boardRepository.findBySeq(seq);
    }
    
	public void getRecordAll() {
		// TODO Auto-generated method stub
		
	}
 
	/*
	 * public List<MatchRecord> findByPlayer(String player) { return
	 * boardRepository.findByPlayer(player); }
	 */
}

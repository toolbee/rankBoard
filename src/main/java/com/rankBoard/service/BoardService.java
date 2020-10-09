package com.rankBoard.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.rankBoard.domain.MatchRecord;
import com.rankBoard.domain.PlayerRecord;
import com.rankBoard.repository.BoardRepository;


public interface BoardService {

	public List<MatchRecord> selectAll() throws Exception;
	
	public void insert(MatchRecord matchRecord) throws Exception;

	//List<MatchRecord> list(PageMaker pageMaker) throws Exception; // 목록
	
	//int listCount(PageMaker pageMaker) throws Exception;

	public MatchRecord selectOne(int num) throws Exception; // 조회
	
	public void delete(int num) throws Exception; // 삭제
	
	public void update(MatchRecord matchRecord) throws Exception; // 수정
	
	
	
 
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

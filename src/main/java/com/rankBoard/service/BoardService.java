package com.rankBoard.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.rankBoard.domain.MatchRecord;
import com.rankBoard.repository.BoardRepository;

@Service
public class BoardService {

	@Autowired
    private BoardRepository boardRepository;
 
    public MatchRecord save(MatchRecord matchRecord) {
        return boardRepository.save(matchRecord);
    }
 
    public void delete(MatchRecord matchRecord) {
        boardRepository.delete(matchRecord);
    }
 
    public Optional<MatchRecord> findOne(Integer number) {
        return boardRepository.findById(number);
    }
 
    public Iterable<MatchRecord> findAll() {
        return boardRepository.findAll();
    }
 
    public Page<MatchRecord> findByMap(String map, PageRequest pageRequest) {
        return boardRepository.findByMap(map, pageRequest);
    }
 
	/*
	 * public List<MatchRecord> findByPlayer(String player) { return
	 * boardRepository.findByPlayer(player); }
	 */
}

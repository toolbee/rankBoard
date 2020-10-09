package com.rankBoard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rankBoard.domain.MatchRecord;
import com.rankBoard.domain.PlayerRecord;
import com.rankBoard.repository.BoardRepository;

@Component
@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardRepository boardRepository; 
	
	@Override
	public List<MatchRecord> selectAll() throws Exception {
		return boardRepository.selectAll();
	}

	@Override
	public void insert(MatchRecord matchRecord) throws Exception {
		boardRepository.insert(matchRecord);
	}

	@Override
	public MatchRecord selectOne(int num) throws Exception {
		return boardRepository.selectOne(num);
	}

	@Override
	public void delete(int num) throws Exception {
		boardRepository.delete(num);
	}

	@Override
	public void update(MatchRecord matchRecord) throws Exception {
		boardRepository.update(matchRecord);
	}
	
	
	
	
	@Override
	public boolean findById(String id) {
		return boardRepository.existsById(id);
	}

	@Override
	public PlayerRecord save(PlayerRecord playerRecord) {
		return boardRepository.save(playerRecord);
	}

	@Override
	public void delete(PlayerRecord playerRecord) {
		boardRepository.delete(playerRecord);
		
	}

	@Override
	public Iterable<PlayerRecord> findAll() {
		return boardRepository.findAll();
	}

	@Override
	public Page<PlayerRecord> findByPlayers(String name, Pageable pageable) {
		return boardRepository.findByPlayers(name, pageable);
	}

	@Override
	public PlayerRecord findBySeq(String seq) {
		return boardRepository.findBySeq(seq);
	}

	@Override
	public void getRecordAll() {
		// TODO Auto-generated method stub
		
	}

	

}

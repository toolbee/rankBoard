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
	private BoardRepository repository; 
	
	@Override
	public List<MatchRecord> selectAll() throws Exception {
		return repository.selectAll();
	}

	@Override
	public void insert(MatchRecord matchRecord) throws Exception {
		repository.insert(matchRecord);
	}

	@Override
	public MatchRecord selectOne(int num) throws Exception {
		return repository.selectOne(num);
	}

	@Override
	public void delete(int num) throws Exception {
		repository.delete(num);
	}

	@Override
	public void update(MatchRecord matchRecord) throws Exception {
		repository.update(matchRecord);
	}
	
	

}

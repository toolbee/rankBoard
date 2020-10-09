package com.rankBoard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rankBoard.domain.PlayerRecord;
import com.rankBoard.repository.RecordRepository;

@Component
@Service
public class RecordServiceImpl implements RecordService {

	@Autowired
	private RecordRepository repository; 
	
	
	@Override
	public boolean findById(String id) {
		return repository.existsById(id);
	}

	@Override
	public PlayerRecord save(PlayerRecord playerRecord) {
		return repository.save(playerRecord);
	}

	@Override
	public void delete(PlayerRecord playerRecord) {
		repository.delete(playerRecord);
		
	}

	@Override
	public Iterable<PlayerRecord> findAll() {
		return repository.findAll();
	}

	@Override
	public Page<PlayerRecord> findByPlayers(String name, Pageable pageable) {
		return repository.findByPlayers(name, pageable);
	}

	@Override
	public PlayerRecord findBySeq(String seq) {
		return repository.findBySeq(seq);
	}

	@Override
	public void getRecordAll() {
		// TODO Auto-generated method stub
		
	}

	

}

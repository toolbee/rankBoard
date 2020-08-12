package com.rankBoard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.rankBoard.domain.PlayerRecord;

@Repository("boardRepository")
public interface BoardRepository extends ElasticsearchRepository<PlayerRecord, Integer> {

	Page<PlayerRecord> findByMap(String map, PageRequest pageRequest);
	//List<MatchRecord> findByPlayer(String player);

    
}

package com.rankBoard.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.rankBoard.domain.MatchRecord;

@Repository("boardRepository")
public interface BoardRepository extends ElasticsearchRepository<MatchRecord, Integer> {

	Page<MatchRecord> findByMap(String map, PageRequest pageRequest);
	//List<MatchRecord> findByPlayer(String player);

    
}

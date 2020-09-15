package com.rankBoard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.rankBoard.domain.PlayerRecord;

@Repository("boardRepository")
public interface BoardRepository extends ElasticsearchRepository<PlayerRecord, String> {

	//Page<PlayerRecord> findByMap(String map, PageRequest pageRequest);
	//List<MatchRecord> findByPlayer(String player);

	Page<PlayerRecord> findByPlayers(String name, Pageable pageable);
	
	PlayerRecord findBySeq(String seq);


    @Query("{\"bool\": {\"must\": [{\"match\": {\"players.name\": \"?0\"}}]}}")
    Page<PlayerRecord> findByPlayersNameUsingCustomQuery(String name, Pageable pageable);
}

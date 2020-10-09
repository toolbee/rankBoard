package com.rankBoard.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.rankBoard.domain.MatchRecord;
import com.rankBoard.domain.PlayerRecord;

@Repository
@Mapper
public interface BoardRepository extends ElasticsearchRepository<PlayerRecord, String> {

	List<MatchRecord> selectAll() throws Exception;

	void insert(MatchRecord matchRecord) throws Exception;

	MatchRecord selectOne(int num) throws Exception;

	void delete(int num) throws Exception;

	void update(MatchRecord matchRecord) throws Exception;
	
	
	
	
	//Page<PlayerRecord> findByMap(String map, PageRequest pageRequest);
	//List<MatchRecord> findByPlayer(String player);

	Page<PlayerRecord> findByPlayers(String name, Pageable pageable);
	
	PlayerRecord findBySeq(String seq);


    @Query("{\"bool\": {\"must\": [{\"match\": {\"players.name\": \"?0\"}}]}}")
    Page<PlayerRecord> findByPlayersNameUsingCustomQuery(String name, Pageable pageable);

	
}

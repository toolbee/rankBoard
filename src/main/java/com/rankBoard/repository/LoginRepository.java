package com.rankBoard.repository;

import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.rankBoard.domain.PlayerRecord;

@Repository("loginRepository")
public interface LoginRepository extends ElasticsearchRepository<PlayerRecord, String> {


    @Query("{\"bool\": {\"must\": [{\"match\": {\"user.id\": \"?0\", \"user.password\": \"?0\"}}]}}")
    String requestLoginUsingCustomQuery(String id, String password);

}

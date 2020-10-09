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
	
	
}

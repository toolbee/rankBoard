package com.elastic;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rankBoard.domain.PlayerRecord;
import com.rankBoard.service.BoardService;

@SpringBootTest
class elasticConnetionTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private BoardService boardService;	
	
	
	@Test
	public void put() {
	    PlayerRecord record = new PlayerRecord(1, "test", "test");
	    PlayerRecord testRecord = boardService.save(record);
	 
	    assertNotNull(testRecord.getSeq());
//	    assertThat(testRecord.getSeq(), is(record.getSeq()));
	}
	 
	@Test
	public void get() {
		PlayerRecord record = new PlayerRecord(1, "test", "test");
	    boardService.save(record);
	 
//	    Optional<PlayerRecord> testRecord = boardService.findOne(1);
//	    assertNotNull(testRecord.getSeq());
//	    assertThat(testRecord.getName(), is(testRecord.getNumber()));
	}

}

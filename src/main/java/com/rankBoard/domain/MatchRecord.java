package com.rankBoard.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@lombok.ToString
@Document(indexName = "match_record")
public class MatchRecord {

	@Id
	private int number; //매치번호
	private String type; //매치 타입 : 개인 or 팀
	private String map; //맵
	private String matchTime; //매치 시간
	private String[] players; //플레이어들
	private String winnerId; //승자 아이디
	private String winnerName; //승자 이름
	private String winnerTribe; //승자 종족
	private String loserId; //패자 아이디
	private String loserName; //패자 이름
	private String loserTribe; //패자 종족
	
	
}

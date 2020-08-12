package com.rankBoard.domain;

import java.util.Map;

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
@Document(indexName = "player_record")
public class PlayerRecord {

	@Id
	private int seq; //매치번호
	private String name; //이름
	private String nickname; //닉네임, 아이디
	private String photo; //프로필사진
	private String tribe; //주종족
	private String[] team; //소속팀
	private String teamMatch_ko; //팀전 한글버전
	private Map<?,?>[] teamMatch; //팀전 전적
	private String rivalry_ko; //개인전 한글버전
	private Map<?,?> rivalry; //개인전 전적
	
	
}

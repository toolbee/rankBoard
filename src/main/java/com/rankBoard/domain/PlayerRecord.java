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
	
	public PlayerRecord(int seq, String name, String nickname, String photo, String tribe, String[] team,
			String teamMatch_ko, Map<?, ?>[] teamMatch, String rivalry_ko, Map<?, ?> rivalry) {
		super();
		this.seq = seq;
		this.name = name;
		this.nickname = nickname;
		this.photo = photo;
		this.tribe = tribe;
		this.team = team;
		this.teamMatch_ko = teamMatch_ko;
		this.teamMatch = teamMatch;
		this.rivalry_ko = rivalry_ko;
		this.rivalry = rivalry;
	}
	
	public PlayerRecord(int seq, String name, String nickname) {
		super();
		this.seq = seq;
		this.name = name;
		this.nickname = nickname;
	}
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getTribe() {
		return tribe;
	}
	public void setTribe(String tribe) {
		this.tribe = tribe;
	}
	public String[] getTeam() {
		return team;
	}
	public void setTeam(String[] team) {
		this.team = team;
	}
	public String getTeamMatch_ko() {
		return teamMatch_ko;
	}
	public void setTeamMatch_ko(String teamMatch_ko) {
		this.teamMatch_ko = teamMatch_ko;
	}
	public Map<?, ?>[] getTeamMatch() {
		return teamMatch;
	}
	public void setTeamMatch(Map<?, ?>[] teamMatch) {
		this.teamMatch = teamMatch;
	}
	public String getRivalry_ko() {
		return rivalry_ko;
	}
	public void setRivalry_ko(String rivalry_ko) {
		this.rivalry_ko = rivalry_ko;
	}
	public Map<?, ?> getRivalry() {
		return rivalry;
	}
	public void setRivalry(Map<?, ?> rivalry) {
		this.rivalry = rivalry;
	}

	
	
	
}

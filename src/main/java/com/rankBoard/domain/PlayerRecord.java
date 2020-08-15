package com.rankBoard.domain;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(indexName = "playerRecord")
public class PlayerRecord {

	@Id
	private int seq; //매치번호

	private String name; //이름
	private String nickname; //닉네임, 아이디
	private String photo; //프로필사진
	private String tribe; //주종족
	private String[] team; //소속팀
	private String teamMatchko; //팀전 한글버전
	private Map<?,?>[] teamMatch; //팀전 전적
	private String rivalryko; //개인전 한글버전
	private Map<?,?> rivalry; //개인전 전적
	
	@Field(type = FieldType.Nested, includeInParent = true)
	private List<PlayerRecord> players;
	
	public PlayerRecord(int seq, String name, String nickname, String photo, String tribe, String[] team,
			String teamMatchko, Map<?, ?>[] teamMatch, String rivalryko, Map<?, ?> rivalry) {
		super();
		this.seq = seq;
		this.name = name;
		this.nickname = nickname;
		this.photo = photo;
		this.tribe = tribe;
		this.team = team;
		this.teamMatchko = teamMatchko;
		this.teamMatch = teamMatch;
		this.rivalryko = rivalryko;
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
	public String getTeamMatchko() {
		return teamMatchko;
	}
	public void setTeamMatchko(String teamMatchko) {
		this.teamMatchko = teamMatchko;
	}
	public Map<?, ?>[] getTeamMatch() {
		return teamMatch;
	}
	public void setTeamMatch(Map<?, ?>[] teamMatch) {
		this.teamMatch = teamMatch;
	}
	public String getRivalryko() {
		return rivalryko;
	}
	public void setRivalryko(String rivalryko) {
		this.rivalryko = rivalryko;
	}
	public Map<?, ?> getRivalry() {
		return rivalry;
	}
	public void setRivalry(Map<?, ?> rivalry) {
		this.rivalry = rivalry;
	}

	
	
	
}

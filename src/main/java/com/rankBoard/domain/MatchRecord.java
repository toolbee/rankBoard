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
public class MatchRecord {

	@Id
	private int seq; //매치번호
	private String type; //매치 타입 : 개인 or 팀
	private String map; //맵
	private String lapTime; //매치 시간
	private String[] players; //플레이어들
	private String homeTeamId; //홈팀 아이디
	private String awayTeamId; //어웨이팀 아이디
	private String winner; //승자 아이디
	private String winnerName; //승자 이름
	private String winnerTribe; //승자 종족
	private String loser; //패자 아이디
	private String loserName; //패자 이름
	private String loserTribe; //패자 종족
	private String matchDate ; //매치일자
	private String replayFileId; //리플레이파일
	private String registDate; //등록일
	private String modifyDate; //수정일
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMap() {
		return map;
	}
	public void setMap(String map) {
		this.map = map;
	}
	public String getLapTime() {
		return lapTime;
	}
	public void setLapTime(String lapTime) {
		this.lapTime = lapTime;
	}
	public String[] getPlayers() {
		return players;
	}
	public void setPlayers(String[] players) {
		this.players = players;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	public String getWinnerName() {
		return winnerName;
	}
	public void setWinnerName(String winnerName) {
		this.winnerName = winnerName;
	}
	public String getWinnerTribe() {
		return winnerTribe;
	}
	public void setWinnerTribe(String winnerTribe) {
		this.winnerTribe = winnerTribe;
	}
	public String getLoser() {
		return loser;
	}
	public void setLoser(String loser) {
		this.loser = loser;
	}
	public String getLoserName() {
		return loserName;
	}
	public void setLoserName(String loserName) {
		this.loserName = loserName;
	}
	public String getLoserTribe() {
		return loserTribe;
	}
	public void setLoserTribe(String loserTribe) {
		this.loserTribe = loserTribe;
	}
	public String getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}
	public String getReplayFileId() {
		return replayFileId;
	}
	public void setReplayFileId(String replayFileId) {
		this.replayFileId = replayFileId;
	}
	public String getRegistDate() {
		return registDate;
	}
	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getHomeTeamId() {
		return homeTeamId;
	}
	public void setHomeTeamId(String homeTeamId) {
		this.homeTeamId = homeTeamId;
	}
	public String getAwayTeamId() {
		return awayTeamId;
	}
	public void setAwayTeamId(String awayTeamId) {
		this.awayTeamId = awayTeamId;
	}
	
	
}

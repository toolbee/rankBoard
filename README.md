# rankBoard
 
### 2020. 7. 17. 스타크래프트 문화를 향유하길 즐기는, 작은 모임을 위한 기록 게시판입니다. 

1. 데이터베이스 : 일래스틱서치 예정
2. 현재 JSON파일형태로 리코드 데이터 관리  
3. 동적 HTML 생성 완료

### 2020. 8. 31.
1. 관리자 로그인 기능 개발 중..
2. 플레이어 기록 상세보기 기능 개발 중..

### 2020. 9. 4.
플레이어 추가
JavaScript sorting 기능 추가
- sort 기준
 1) 승률
 2) 다승
 3) 다전적

### Requirements
For building and running the application you need:

- [JDK 11](http://www.oracle.com/technetwork/java/javase/downloads)
- Maven

### Stack
- spring-boot 2.5.x
- use mybatis
- use `mysql` database > jdbc

### JAR 또는 WAR 배포
접속 URL : http://rankboard.toolbee.in

### docker 배포
docker-compose
nginx and tomcat
elastic stack(elastic search, kibana)

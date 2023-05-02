## JimCarry
스프링 부트 : 공유 창고 중개 서비스


### :desktop_computer: 프로젝트 소개
개개인의 창고에 다른 사람의 짐을 보관할 수 있는 서비스.
창고 제공자는 방치된 빈 방을 경제적이고 활용성 있게 만들 수 있으며, 창고 사용자는 집의 여유공간을 확보할 수 있다.


### :mantelpiece_clock: 개발 기간
* 23.03.13 ~ 23.04.07


### :people_holding_hands: 맴버구성 - 백엔드 업무
 - 팀장  : 황자현 - 관리자페이지
 - 부팀장 : 문은서 - 창고등록, 문의하기, 공지사항
 - 팀원1 : 강민구 - 마이페이지
 - 팀원2 : 김주연 - 검색 및 상세페이지
 - 팀원3 : 김서현 - 메인페이지, 결제페이지
 - 팀원4 : 정현진 - 로그인, 회원가입, ID찾기, PW찾기


### 프로젝트 목적
창고 제공자와 창고 사용자 간의 새로운 사회적 연결망이 형성하여, 창고제공자와, 사용자의 경제성과 공간 효율성을 확보하여 사람들의 삶의 질을 향상시킬 수 있는 서비스 기획


### 기획배경
현대 사회에서 많은 사람들이 도시에 살며 작은 공간에서 살아가고 있음에 따라 집안에 물건을 보관하는 것도 쉽지 않은 문제가 되고 있다. 이러한 문제점을 해결하기 위해, 창고 제공자와 창고 사용자를 연결해주는 서비스를 만들어 창고 제공자는 방치된 빈 방을 경제적이고 활용성 있게 만들 수 있고, 창고 사용자는 집의 여유공간을 확보하여 더 편안한 생활을 할 수 있도록 기획하였습니다.


### 목적 및 기대 효과
- 창고 제공자 : 방치된 빈 방을 경제적으로 활용 가능
- 창고 사용자 : 협소한 주거공간 확보 가능
- 1인 가구 및 이삿짐, 취미용품 등 창고 보관을 통해 공간성 확보


### 프로젝트에서 맡은 역할
- 서비스 기획 및 전반적인 디자인 업무 수행
- 프론트 업무 : 창고등록페이지, FAQ, 문의하기, 서비스 이용안내 페이지
- 백엔드 업무 : 검색페이지, 창고 상세페이지 기능 구현


### :gear: 개발 환경
- java
- jQuery
- Thymeleaf
- QueryDSL
- JPA
- Spring Boot
- HTML, CSS, JS
- MySQL
- JDK 11.0.15
- YAML
- JSON
- REST:API
- Sourcetree
- DBeaver
- IntelliJ IDEA
- git, gitHub
- JUnit5
- POSTMAN
- Lombok
- Boot pay
- Naver OAuth
- Kakao OAuth
- Cool SMS api


## :pushpin: 맡은 역할
### 프론트 진행 - <a href="https://github.com/coder-juyeon/JimCarry/wiki/front">상세보기 - WIKI 이동</a>
- 창고등록페이지
- FAQ
- 문의하기
- 서비스 이용안내 페이지
- 주소 API 연동


### 백엔드 진행 - <a href="https://github.com/coder-juyeon/JimCarry/wiki/backend">상세보기 - WIKI </a>
#### 검색페이지
 - 지역별 검색
 - 규모별 검색
 - 정렬별 검색
 - 주소 키워드 검색


#### 창고상세페이지
- 창고 상세 정보
- 후기 목록 


### ERD
![jimcarry_erd](https://user-images.githubusercontent.com/122768623/235347527-31c6f09b-fc3b-4317-8b5c-dcab609d0bf3.png)


### 프로젝트에서 느낀점
- 어려웠던 부분
 : 검색 페이지의 중복 필터 부분이 어려웠습니다. 어떤식으로 해야할 지 감을 잡지 못해서 
   처음에는 페이지 이동으로 모든 걸 처리했다가 페이지 이동으로는 불가능한 점이 많아서
   페이지 이동과 ajax를 혼합하는 코드로 변경했다가, 나중에는 아예 ajax만 쓰는 코드로 다시 한번 갈아엎느라
   많은 시간이 걸렸고 힘들었습니다.
   
- 문제를 해결했던 부분
 : 항상 문제해결은 최대한 혼자서 해보려고 했었습니다. 하지만 혼자서 붙잡고 있으면 기간 내에 프로젝트를 완료하지 못할 것 같았고 여러 동기들에게 물어보고 강사님께도 도움을      요청했습니다. 그 결과 문제해결에 대한 협업의 중요성과 팀원들과의 소통을 배웠고 ajax를 어떤식으로 쓰는지 감을 잡았던 것 같습니다. 
 
- 협업의 중요성
 : 위에 언급했던 것 처럼 도움을 받으며 문제를 해결 할 수 있었고 소통과 협업의 중요성을 깨달았습니다.
- 총평
: 처음으로 해본 프로젝트였는데 너무나도 부족한 부분이 많았습니다. 퍼블리싱을 할 때 백엔드를 생각하지 못해서 여러 문제가 발생했던 점,
   어려운 것부터 붙잡고 있어서 마지막에 시간이 부족했던 점, 오류를 혼자 힘으로 해결하려고 몇시간이고 붙들고 있어 시간이 자꾸 지체된 점 등 저의 부족한 부분을 알았고
   쉬운 것부터 먼저 하기, 오류는 30분 이상 붙잡고 있지 않기, 모르는것은 바로바로 물어보기를 시도하여 다음 프로젝트때는 조금 더 나아진 제가 되도록 노력할 것입니다.

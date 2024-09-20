# **Hw1 - hajin**  
나만의 컨트롤러 만들기 - Checklist Controller(간단한 Checklist CURD) 
<br><br>
*임의로 리스트를 controller 내에 만들어 결과가 나오게 하였음 
<br>
*MAP 형태로 리스트를 만들지 않아 user에 대한 list는 나오지 않고 통일된 전체 list로 결과가 나옴
<br><br>

**1. 전체 리스트 조회**<br>

GET - http://localhost:8080/list

<br>

**2.User가 체크 리스트 추가하기** <br>
POST - http://localhost:8080/list/{userId}?item={content}
<br>*userid는 pathvariable, item은 requestparam 사용
<br>ex - http://localhost:8080/list/hajin?item=잘살자

<br>결과
<br>
사진
<br>
**3.User의 체크리스트 조회하기**
<br>GET - http://localhost:8080/list/{userId}
<br>*userid는 pathvariable 사용, MAP 형태로 리스트를 만들지 않아 user에 대한 list는 나오지 않고 통일된 전체 list로 결과가 나옴
<br>ex - http://localhost.1:8080/list/hajin
<br>
사진
<br>
**4. User의 체크리스트 수정하기**
<br>PATCH - http://localhost.1:8080/list/{userId}/{number}?newContent={content}
<br>*userid와 number는 pathvariable, newContent requestparam 사용
<br>ex - http://localhost:8080/list/hajin/4?newContent=잘지내자
<br>
사진
<br>
**5.User의 체크리스트 삭제하기**
<br>DELETE - http://localhost:8080/list/{userId}/{number}
<br>*userid와 number는 pathvariable 사용
<br>ex- http://localhost:8080/list/hajin/4
<br>
사진
<br>

---
**짝궁 Controller 접속하기!**

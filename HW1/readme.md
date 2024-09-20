# **Hw1 - hajin**  
나만의 컨트롤러 만들기 - Checklist Controller(간단한 Checklist CURD) 
<br><br>
*임의로 리스트를 controller 내에 만들어 결과가 나오게 하였음 
<br>
*MAP 형태로 리스트를 만들지 않아 user에 대한 리스트는 나오지 않고 통일된 전체 리스트로 결과가 나옴
<br><br>

**1. 전체 리스트 조회**<br>

GET - http://localhost:8080/list
![1번](https://github.com/user-attachments/assets/76e526c7-2289-49df-992d-90609024d8c2)
<br>
<br>

**2.User가 체크 리스트 추가하기** <br>
POST - http://localhost:8080/list/{userId}?item={content}
<br>*userid는 pathvariable, item은 requestparam 사용
<br>ex - http://localhost:8080/list/hajin?item=잘살자

<br>

![2-1](https://github.com/user-attachments/assets/4757045a-1156-4f56-93e0-4e619d83ee03)

<br>
결과<br>

![2-2](https://github.com/user-attachments/assets/d019b14b-0a97-497d-a82a-9c2407805e88)


<br>
<br>

**3.User의 체크리스트 조회하기**
<br>GET - http://localhost:8080/list/{userId}
<br>*userid는 pathvariable 사용, MAP 형태로 리스트를 만들지 않아 user에 대한 list는 나오지 않고 통일된 전체 list로 결과가 나옴
<br>ex - http://localhost.1:8080/list/hajin
<br>

![3](https://github.com/user-attachments/assets/4ae3efba-6a15-4b4a-b938-6825f16c0a96)

<br>
<br>

**4. User의 체크리스트 수정하기**
<br>PATCH - http://localhost.1:8080/list/{userId}/{number}?newContent={content}
<br>*userid와 number는 pathvariable, newContent requestparam 사용
<br>ex - http://localhost:8080/list/hajin/4?newContent=잘지내자
<br>

![4](https://github.com/user-attachments/assets/65b9dee2-e6ea-4f00-8a44-7dd2e271de18)
<br>
결과<br>

![4-2](https://github.com/user-attachments/assets/87265214-d4d0-4aeb-a618-b38412ce4855)
<br>
<br>

**5.User의 체크리스트 삭제하기**
<br>DELETE - http://localhost:8080/list/{userId}/{number}
<br>*userid와 number는 pathvariable 사용
<br>ex- http://localhost:8080/list/hajin/4
<br>
![5](https://github.com/user-attachments/assets/f72a48b9-d6ca-4765-9f70-c1e633fdba5a)
<br>
결과<br>

![5-2](https://github.com/user-attachments/assets/a7d1ae0f-51fb-4b34-8519-ce4956ede03e)
<br>
<br>

---
**짝궁 Controller 접속하기!**

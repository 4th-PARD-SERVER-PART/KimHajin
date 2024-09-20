---

# **Hw1 - hajin**  
나만의 컨트롤러 만들기 - Checklist Controller (간단한 Checklist CRUD)  

* 임의로 리스트를 컨트롤러 내에 만들어 결과가 나오게 하였음  
* MAP 형태로 리스트를 만들지 않아 user에 대한 리스트는 나오지 않고 통일된 전체 리스트로 결과가 나옴  

---

## 1. 전체 리스트 조회  
**GET**: `http://localhost:8080/list`  
<img src="https://github.com/user-attachments/assets/76e526c7-2289-49df-992d-90609024d8c2" width="300"/>  

---

## 2. User가 체크리스트 추가하기  
**POST**: `http://localhost:8080/list/{userId}?item={content}`  
- userid는 path variable, item은 request param 사용  
- 예시: `http://localhost:8080/list/hajin?item=잘살자`  
<img src="https://github.com/user-attachments/assets/4757045a-1156-4f56-93e0-4e619d83ee03" width="300"/>  

결과:  
<img src="https://github.com/user-attachments/assets/d019b14b-0a97-497d-a82a-9c2407805e88" width="300"/>  

---

## 3. User의 체크리스트 조회하기  
**GET**: `http://localhost:8080/list/{userId}`  
- userid는 path variable 사용  
- 예시: `http://localhost:8080/list/hajin`  
<img src="https://github.com/user-attachments/assets/4ae3efba-6a15-4b4a-b938-6825f16c0a96" width="300"/>  

---

## 4. User의 체크리스트 수정하기  
**PATCH**: `http://localhost:8080/list/{userId}/{number}?newContent={content}`  
- userid와 number는 path variable, newContent는 request param 사용  
- 예시: `http://localhost:8080/list/hajin/4?newContent=잘지내자`  
<img src="https://github.com/user-attachments/assets/65b9dee2-e6ea-4f00-8a44-7dd2e271de18" width="300"/>  

결과:  
<img src="https://github.com/user-attachments/assets/87265214-d4d0-4aeb-a618-b38412ce4855" width="300"/>  

---

## 5. User의 체크리스트 삭제하기  
**DELETE**: `http://localhost:8080/list/{userId}/{number}`  
- userid와 number는 path variable 사용  
- 예시: `http://localhost:8080/list/hajin/4`  
<img src="https://github.com/user-attachments/assets/f72a48b9-d6ca-4765-9f70-c1e633fdba5a" width="300"/>  

결과:  
<img src="https://github.com/user-attachments/assets/a7d1ae0f-51fb-4b34-8519-ce4956ede03e" width="300"/>  

---

**짝궁 Controller 접속하기!**

![image](https://github.com/user-attachments/assets/376f021b-5026-43ec-a94c-695c339be367)

민규오빠의 Controller에 접속했다 왔습니다 ~

---

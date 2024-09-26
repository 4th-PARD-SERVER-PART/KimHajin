---

# **Hw2 - hajin**  
나만의 CRUD 만들기 - 수강했던 과목 리스트 만들기   

---

## 1. Create - 수강한 과목 정보 추가하기   
**POST**: `http://localhost:8080/lesson`  
<img src="https://github.com/user-attachments/assets/76e526c7-2289-49df-992d-90609024d8c2" width="300"/>  

---

## 2. Read - 수강했던 과목 정보 조회하기  
**GET**: `http://localhost:8080/lesson/1/{lessonName}`   
<img src="https://github.com/user-attachments/assets/4757045a-1156-4f56-93e0-4e619d83ee03" width="300"/>  

---

## 3. Read - 수강했던 과목 전체 정보 조회하기 
**GET**: `http://localhost:8080/lesson`  
<img src="https://github.com/user-attachments/assets/4ae3efba-6a15-4b4a-b938-6825f16c0a96" width="300"/>  

---

## 4. Read - 카테고리로 수강했던 과목 정보 조회하기  
**GET**: `http://localhost:8080/lesson/2/{lessonCategoty}`    
<img src="https://github.com/user-attachments/assets/65b9dee2-e6ea-4f00-8a44-7dd2e271de18" width="300"/>  

---

## 5. Update - 수강했던 과목 정보 수정하기  
**PATCH**: `http://localhost:8080/lesson/{lessonName}`   
<img src="https://github.com/user-attachments/assets/f72a48b9-d6ca-4765-9f70-c1e633fdba5a" width="300"/>  

---

## 5. Delete - 수강했던 과목 정보 삭제하기  
**DELETE**: `http://localhost:8080/lesson/{lessonName}`   
<img src="https://github.com/user-attachments/assets/f72a48b9-d6ca-4765-9f70-c1e633fdba5a" width="300"/>  

---
#rieview
<br> pathvariable로 했을 때 postman에서 첫번째 send된 요청에는 404 에러가 발생하고 똑같은 url로 두 번 요청을 send해야 200 ok가 뜬다. 반면 requestparam을 이용하여 하였을 때는 첫번째 요청에도 바로 결과가 뜬다.(200 ok) 특성 차이로 인한 것인지 물어봐야할 것 같다. 
<br> gpt 답변 - PathVariable을 사용하는 경우, URL이 변경되면 브라우저나 Postman에서 캐시가 발생하거나 요청 경로와 관련된 캐싱 문제가 발생할 수 있습니다. 예를 들어 /lessons/Math와 같은 경로가 첫 번째 요청에서 캐시되고, 두 번째 요청에서만 제대로 작동하는 상황이 있을 수 있습니다.
반면 RequestParam 방식 (/lessons?lessonName=Math)은 캐싱이 덜 발생할 수 있으며, 쿼리 파라미터로 데이터가 전달되기 때문에 한 번에 처리가 잘 될 가능성이 높습니다.

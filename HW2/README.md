---

# **Hw2 - hajin**  
나만의 CRUD 만들기 - 수강했던 과목 리스트 만들기   

---

## 1. Create - 수강한 과목 정보 추가하기   
**POST**: `http://localhost:8080/lesson`  
![1-1](https://github.com/user-attachments/assets/df678c04-1daf-4e09-b0dc-f42ff0d20196)
![1-2](https://github.com/user-attachments/assets/e25982ac-672a-41f5-90a8-ceefcea29347)

---

## 2. Read - 수강했던 과목 정보 조회하기  
**GET**: `http://localhost:8080/lesson/1?lessonName={lessonName}`   
![2](https://github.com/user-attachments/assets/41738607-f9b0-4c6a-8937-de4fea9e377f)

---

## 3. Read - 수강했던 과목 전체 정보 조회하기 
**GET**: `http://localhost:8080/lesson`  
![3](https://github.com/user-attachments/assets/b9f4300e-8097-4d3c-adaf-066cd6fc54de)

---

## 4. Read - 카테고리로 수강했던 과목 정보 조회하기  
**GET**: `http://localhost:8080/lesson/2?lessonCategory={lessonCategory}` 
![4](https://github.com/user-attachments/assets/97dacc0b-c0d4-4819-a702-3d8166815e2c)

---

## 5. Update - 수강했던 과목 정보 수정하기  
**PATCH**: `http://localhost:8080/lesson?lessonName={lessonName}`   
![5-1](https://github.com/user-attachments/assets/bfbc8e6d-1188-4882-912e-0f3491e83266)
![5-2](https://github.com/user-attachments/assets/484bdbe3-ff58-4379-b2e0-ce56b1c5a200)

---

## 5. Delete - 수강했던 과목 정보 삭제하기  
**DELETE**: `http://localhost:8080/lesson?lessonName={lessonName}`   
![6](https://github.com/user-attachments/assets/f363e26f-4802-4a9f-aa25-27bc9d7ff83d)
![6-2](https://github.com/user-attachments/assets/78794b80-34cb-46bc-a331-a5277bddbb91)

---
#rieview
<br> pathvariable로 했을 때 postman에서 첫번째 send된 요청에는 404 에러가 발생하고 똑같은 url로 두 번 요청을 send해야 200 ok가 뜬다. 반면 requestparam을 이용하여 하였을 때는 첫번째 요청에도 바로 결과가 뜬다.(200 ok) 특성 차이로 인한 것인지 물어봐야할 것 같다. 
<br> gpt 답변 - PathVariable을 사용하는 경우, URL이 변경되면 브라우저나 Postman에서 캐시가 발생하거나 요청 경로와 관련된 캐싱 문제가 발생할 수 있습니다. 예를 들어 /lessons/Math와 같은 경로가 첫 번째 요청에서 캐시되고, 두 번째 요청에서만 제대로 작동하는 상황이 있을 수 있습니다.
반면 RequestParam 방식 (/lessons?lessonName=Math)은 캐싱이 덜 발생할 수 있으며, 쿼리 파라미터로 데이터가 전달되기 때문에 한 번에 처리가 잘 될 가능성이 높습니다.

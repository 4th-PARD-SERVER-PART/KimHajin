---

# **Hw2 - hajin**  
나만의 CRUD 만들기 - 수강했던 과목 리스트 만들기   

---

## 1. Create - 수강한 과목 정보 추가하기   
**POST**: `http://localhost:8080/lesson`  
<p align="center">
  <img src="https://github.com/user-attachments/assets/df678c04-1daf-4e09-b0dc-f42ff0d20196" alt="1-1" width="300"/>
  <img src="https://github.com/user-attachments/assets/e25982ac-672a-41f5-90a8-ceefcea29347" alt="1-2" width="300"/>
</p>

---

## 2. Read - 수강했던 과목 정보 조회하기  
**GET**: `http://localhost:8080/lesson/1?lessonName={lessonName}`   
<p align="center">
  <img src="https://github.com/user-attachments/assets/41738607-f9b0-4c6a-8937-de4fea9e377f" alt="2" width="400"/>
</p>

---

## 3. Read - 수강했던 과목 전체 정보 조회하기  
**GET**: `http://localhost:8080/lesson`  
<p align="center">
  <img src="https://github.com/user-attachments/assets/b9f4300e-8097-4d3c-adaf-066cd6fc54de" alt="3" width="400"/>
</p>

---

## 4. Read - 카테고리로 수강했던 과목 정보 조회하기  
**GET**: `http://localhost:8080/lesson/2?lessonCategory={lessonCategory}`  
<p align="center">
  <img src="https://github.com/user-attachments/assets/97dacc0b-c0d4-4819-a702-3d8166815e2c" alt="4" width="400"/>
</p>

---

## 5. Update - 수강했던 과목 정보 수정하기  
**PATCH**: `http://localhost:8080/lesson?lessonName={lessonName}`   
<p align="center">
  <img src="https://github.com/user-attachments/assets/bfbc8e6d-1188-4882-912e-0f3491e83266" alt="5-1" width="300"/>
  <img src="https://github.com/user-attachments/assets/484bdbe3-ff58-4379-b2e0-ce56b1c5a200" alt="5-2" width="300"/>
</p>

---

## 6. Delete - 수강했던 과목 정보 삭제하기  
**DELETE**: `http://localhost:8080/lesson?lessonName={lessonName}`   
<p align="center">
  <img src="https://github.com/user-attachments/assets/f363e26f-4802-4a9f-aa25-27bc9d7ff83d" alt="6" width="300"/>
  <img src="https://github.com/user-attachments/assets/78794b80-34cb-46bc-a331-a5277bddbb91" alt="6-2" width="300"/>
</p>

---

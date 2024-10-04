---

# **Hwe3- hajin**  
버거킹CRUD + JPA 이용해서 나만의 문법 3가지 만들어보기   

---

## 1. Create - 메뉴 추가하기   
**POST**: `http://localhost:8080/burgur`  
<p align="center">
  <img src="https://github.com/user-attachments/assets/47e83962-6d62-4c6c-a00a-8b07dbd4b463" alt="1" width="300"/>
</p>

---

## 2. Read - 메뉴 하나 조회하기 
**GET**: `http://localhost:8080/burgur/{burgurId}`   
<p align="center">
  <img src="https://github.com/user-attachments/assets/cf4e5c6f-f862-4e04-9117-42b70db49a61" alt="2" width="400"/>
</p>

---

## 3. Read - 메뉴 전체 조회하기 
**GET**: `http://localhost:8080/burgur`  
<p align="center">
  <img src="https://github.com/user-attachments/assets/04a38ded-b76e-43ec-9962-c8fbb9b9dac8" alt="3" width="400"/>
</p>

---

## 4. Update - 메뉴 수정하기  
**PATCH**: `http://localhost:8080/bugur/{burgurId}`   
<p align="center">
  <img src="https://github.com/user-attachments/assets/1282375e-6294-48bf-ba50-ace6b82b1ec6" alt="4" width="300"/>
</p>

---

## 5. Delete - 메뉴 삭제하기 
**DELETE**: `http://localhost:8080/bugur/{burgurId}`   
<p align="center">
  <img src="https://github.com/user-attachments/assets/8e01efad-b29e-473c-9009-a42b71d2a7c7" alt="5" width="300"/>
  <img src="https://github.com/user-attachments/assets/7df5c552-e507-4d27-a285-a227c1128cc3" alt="5" width="300"/>
</p>

---

## 6. Read - (JPA 문법 사용)사용자가 입력한 가격 이상의 메뉴 조회하기 
**GET**: `http://localhost:8080/bugur/burgerPrice?price={입력하는 가격}`  
**List<Buger> findBurgerByBurgerPriceGreaterThan(@Param("price") Long price);**
<p align="center">
  <img src="https://github.com/user-attachments/assets/cf9f379e-cf79-4b22-ba97-3bbe6b75f52c" alt="6" width="300"/>
</p>

---

## 7. Read - (JPA 문법 사용)버거 이름에 사용자가 입력하는 문자열이 포함된 메뉴 조회하기
**GET**: `http://localhost:8080/bugur/burgerPrice?price={입력하는 가격}`  
**List<Buger> findBugerByBurgerNameContaining(@Param("name") String name);**
<p align="center">
  <img src="https://github.com/user-attachments/assets/33c9bfce-bef9-41a2-9a8a-92feed1a8e00" alt="7" width="300"/>
</p>

---

## 8. Read - (JPA 문법 사용)최신에 등록한 신메뉴 3개 조회하기
**GET**: `http://localhost:8080/bugur/recentBurgur`  
**List<Buger> findTop3ByOrderByBurgerCreateAtDesc();**
<p align="center">
  <img src="https://github.com/user-attachments/assets/691cce8d-b188-4163-ab66-d45e9ca2b9e8" alt="8" width="300"/>
</p>

---



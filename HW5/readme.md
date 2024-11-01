---

# **Hw5- hajin**  
HW4 기능에 구글 로그인 구현하기 

---
## 1. Oauth 구현 - 구글 로그인(User post)

| HTTP Method | URL                    | Description         | Image Placeholder       |
|-------------|------------------------|---------------------|-------------------------|
| GET       | /loginForm                | Create a new user  | ![loginform ](https://github.com/user-attachments/assets/448eac66-6c6b-43e9-860b-72640f3b8273) ![구글 로그인](https://github.com/user-attachments/assets/536ac83d-c57c-43a5-9314-94a875eac0d2) |
| ![로그인 정보 DB 저장](https://github.com/user-attachments/assets/5a92f0bd-48a9-42ff-9303-86a279f3d034) |
![loginfrom - swagger](https://github.com/user-attachments/assets/f614536b-d53d-4300-b23d-52efda553607) |
---

## 2. User 기능

| HTTP Method | URL                    | Description         | Request Example                 | Image Placeholder       |
|-------------|------------------------|---------------------|---------------------------------|-------------------------|
| GET         | /user/{userId}          | Get user by ID      | N/A                             | ![user 조회](https://github.com/user-attachments/assets/3f5a91b2-9e95-4733-99d1-5854077dca60) | 
| GET         | /user/{userId}/posts          | Get user post      | N/A                             | ![8  postman - userid로 조회 시 자신이 작성한 게시물](https://github.com/user-attachments/assets/972c60b5-7acd-4cc7-9f4b-2413778cb632)    |
| PATCH       | /user/{userId}          | Update user details | `{"username": "updatename"}`   | ![10 postman - userid로 User정보 수정하기](https://github.com/user-attachments/assets/8b5b9c6e-eaa6-4cfc-bb13-e66daa5a428b)  ![10 DB - data 수정 결과](https://github.com/user-attachments/assets/3e63e5f2-f7f1-42fc-8ba0-b4d95b2f130a) |
| DELETE      | /user/{userId}          | Delete user by ID   | N/A                             | ![11 postman- User delete ](https://github.com/user-attachments/assets/f1e5f6f6-781c-44ac-a274-07f27587ee72) ![11 DB - user delete data 결과](https://github.com/user-attachments/assets/6e0cd7d3-d0b8-4965-98e6-69118228b4c7) |

---

## 3. Post 기능

| HTTP Method | URL                          | Description                    | Request Example               | Image Placeholder       |
|-------------|------------------------------|--------------------------------|-------------------------------|-------------------------|
| POST        | /post/{userId}           | Create a post for a user       | `{"title": "New Post", "content": "Content here"}` | ![2 postman-post_post](https://github.com/user-attachments/assets/76ce5160-130d-40fe-a5b5-62689b6e3445) ![2 DB - post_data](https://github.com/user-attachments/assets/0e35561e-64fe-4869-acf4-17f09d392b96) |
| GET         | /post | Get All post(List)                | N/A                           | ![post list](https://github.com/user-attachments/assets/c8babb5c-2c0e-4e32-91c1-2b8db149cd17)  |
| GET         | /post/{postId} | Get post by ID                 | N/A                           | ![3 postman-post_get](https://github.com/user-attachments/assets/26ee57cc-9582-411a-a20f-3fd5fe78b61e)   |
| PATCH       | /post/{postId}/{userId}  | Update post by ID(userId-작성자 확인)            | `{"title": "Updated", "content": "New content"}` | ![7  postman - post patch 한 것](https://github.com/user-attachments/assets/9efe95f4-ba04-429d-a7df-93701424b4a3) ![7  postman - post patch 시 작성사 확인 오류](https://github.com/user-attachments/assets/a892117e-10bb-4316-9375-39362c4215a2) ![7  DB - patch 후 data](https://github.com/user-attachments/assets/00088c77-bae6-47e3-b36e-71aab6ba3c4b) |
| DELETE      | /post/{postId}/{userId}  | Delete post by ID(userId-작성자 확인)        | N/A                           | ![6  postman - post delete 한 것](https://github.com/user-attachments/assets/8e4d8544-00d8-4227-afd6-fbb87c4a8706) ![6  postman- post delete 시 작성사 확인 오류](https://github.com/user-attachments/assets/a17c7a61-1b39-4612-9ffb-92eb62e70afb) ![6  DB - post delete 후 data](https://github.com/user-attachments/assets/5f10ed8c-5e9f-4da2-833a-4bd5ebc25aee) |

---

## 4. Like 기능

| HTTP Method | URL                            | Description                    | Request Example | Image Placeholder |
|-------------|--------------------------------|--------------------------------|-----------------|-------------------|
| POST        | /like/{postId}/{userId}            | Like a post                    | N/A             | ![4 postman-like_post](https://github.com/user-attachments/assets/620b4d6a-8584-48a5-aca2-e74d56a5f66f)  ![5 postman-like 이후에 1번 게시물 결과 (count증가)](https://github.com/user-attachments/assets/1aa6d0e3-c9c2-4823-94be-1988c14be35c)   |
| DELETE      | /like/{postId}/{userId}         | Unlike a post                  | N/A             | ![5 postman- like 2번하면 취소되는 결과(count 감소)](https://github.com/user-attachments/assets/cbcfd775-4b1c-4d52-ad39-599388fff9bc) |

---



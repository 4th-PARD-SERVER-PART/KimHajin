---

# **Hw5- hajin**  
HW4 기능에 구글 로그인 구현하기 

---
## 1. Oauth 구현 - 구글 로그인(User post)

| **HTTP Method** | **URL**              | **Description**      | **Image Placeholder**                                                                                                            |
|-----------------|----------------------|----------------------|-----------------------------------------------------------------------------------------------------------------------------------|
| **GET**         | `/loginForm`         | Create a new user   | ![loginform](https://github.com/user-attachments/assets/448eac66-6c6b-43e9-860b-72640f3b8273) ![Google Login](https://github.com/user-attachments/assets/536ac83d-c57c-43a5-9314-94a875eac0d2) |

| **Additional Image**                                                                                              |
|------------------------------------------------------------------------------------------------------------------------|
| ![Login info saved to DB](https://github.com/user-attachments/assets/5a92f0bd-48a9-42ff-9303-86a279f3d034)             |
| ![LoginForm - Swagger](https://github.com/user-attachments/assets/f614536b-d53d-4300-b23d-52efda553607)               |

--- 


## 2. User 기능

| HTTP Method | URL                    | Description         | Request Example                 | Image Placeholder       |
|-------------|------------------------|---------------------|---------------------------------|-------------------------|
| GET         | /user/{userId}          | Get user by ID      | N/A                             | ![User-user 개인 정보 GET](https://github.com/user-attachments/assets/9c20761f-d780-4047-a2cd-bc7615959932) | 
| GET         | /user/{userId}/posts          | Get user post      | N/A                             |  ![User- 개인의 post get](https://github.com/user-attachments/assets/8dd2aabc-5d86-4bd3-9714-83125e0e0761) |
| PATCH       | /user/{userId}          | Update user details | `{"username": "updatename"}`   | ![User-patch](https://github.com/user-attachments/assets/36677545-4d10-4845-a4bb-4da6b4061d89) |
| DELETE      | /user/{userId}          | Delete user by ID   | N/A                             | ![User-delete](https://github.com/user-attachments/assets/964720af-3311-4582-8530-2a0a97e2f6d0) |

---

## 3. Post 기능

| HTTP Method | URL                          | Description                    | Request Example               | Image Placeholder       |
|-------------|------------------------------|--------------------------------|-------------------------------|-------------------------|
| POST        | /post/{userId}           | Create a post for a user       | `{"title": "New Post", "content": "Content here"}` | ![post-create](https://github.com/user-attachments/assets/6423c876-25ba-4441-be8d-5a705a6be94c) |
| GET         | /post | Get All post(List)                | N/A                           |![post-get 전체](https://github.com/user-attachments/assets/728a3fc4-2eb5-4563-8fbb-e884a6b6dd51)  |
| GET         | /post/{postId} | Get post by ID                 | N/A                           | ![post - get 1개](https://github.com/user-attachments/assets/9875841a-0825-405a-8407-ba895562a6aa)   |
| PATCH       | /post/{postId}/{userId}  | Update post by ID(userId-작성자 확인)            | `{"title": "Updated", "content": "New content"}` | ![post-patch](https://github.com/user-attachments/assets/54a787b6-61f8-4011-9586-85c037e3ed23) |
| DELETE      | /post/{postId}/{userId}  | Delete post by ID(userId-작성자 확인)        | N/A                           | ![post-delete](https://github.com/user-attachments/assets/2bc6d154-5aab-4a92-8aa1-b7bc0559b34e) |

---

## 4. Like 기능

| HTTP Method | URL                            | Description                    | Request Example | Image Placeholder |
|-------------|--------------------------------|--------------------------------|-----------------|-------------------|
| POST        | /like/{postId}/{userId}            | Like a post                    | N/A             | ![like post](https://github.com/user-attachments/assets/410163b9-8503-4a7b-934e-c6aa7069c0a8) 
![5 postman-like 이후에 1번 게시물 결과 (count증가)](https://github.com/user-attachments/assets/1aa6d0e3-c9c2-4823-94be-1988c14be35c)   |
| DELETE      | /like/{postId}/{userId}         | Unlike a post                  | N/A             | ![5 postman- like 2번하면 취소되는 결과(count 감소)](https://github.com/user-attachments/assets/cbcfd775-4b1c-4d52-ad39-599388fff9bc) |

---



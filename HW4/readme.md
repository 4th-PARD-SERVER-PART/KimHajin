---

# **Hw4- hajin**  
블로그 플랫폼 만들기 + 선택도 해보았습니다.  


## 목차

1. [User 기능](#1-user-기능)
2. [Post 기능](#2-post-기능)
3. [Like 기능](#3-like-기능)
4. [기타 설명](#4-기타-설명)
---

## 1. User 기능

| HTTP Method | URL                    | Description         | Request Example                 | Image Placeholder       |
|-------------|------------------------|---------------------|---------------------------------|-------------------------|
| POST        | /user                   | Create a new user   | `{"username": "name"}`          | ![1  postman-user_post](https://github.com/user-attachments/assets/726af1f2-d353-4c9b-af26-e8138876a1d6) ![1 DB - user-data](https://github.com/user-attachments/assets/459e5b11-5dbf-4eb2-b0c7-bac16b650e08)  |
| GET         | /user/{userId}          | Get user by ID      | N/A                             | ![user 조회](https://github.com/user-attachments/assets/3f5a91b2-9e95-4733-99d1-5854077dca60) | 

| GET         | /user/{userId}/posts          | Get user post      | N/A                             | ![8  postman - userid로 조회 시 자신이 작성한 게시물](https://github.com/user-attachments/assets/972c60b5-7acd-4cc7-9f4b-2413778cb632)    |
| PATCH       | /user/{userId}          | Update user details | `{"username": "updatename"}`   | ![10 postman - userid로 User정보 수정하기](https://github.com/user-attachments/assets/8b5b9c6e-eaa6-4cfc-bb13-e66daa5a428b)  ![10 DB - data 수정 결과](https://github.com/user-attachments/assets/3e63e5f2-f7f1-42fc-8ba0-b4d95b2f130a) |
| DELETE      | /user/{userId}          | Delete user by ID   | N/A                             | ![11 postman- User delete ](https://github.com/user-attachments/assets/f1e5f6f6-781c-44ac-a274-07f27587ee72) ![11 DB - user delete data 결과](https://github.com/user-attachments/assets/6e0cd7d3-d0b8-4965-98e6-69118228b4c7) |

---

## 2. Post 기능

| HTTP Method | URL                          | Description                    | Request Example               | Image Placeholder       |
|-------------|------------------------------|--------------------------------|-------------------------------|-------------------------|
| POST        | /post/{userId}           | Create a post for a user       | `{"title": "New Post", "content": "Content here"}` | ![2 postman-post_post](https://github.com/user-attachments/assets/76ce5160-130d-40fe-a5b5-62689b6e3445) ![2 DB - post_data](https://github.com/user-attachments/assets/0e35561e-64fe-4869-acf4-17f09d392b96) |
| GET         | /post | Get All post(List)                | N/A                           | ![post list](https://github.com/user-attachments/assets/c8babb5c-2c0e-4e32-91c1-2b8db149cd17)  |
| GET         | /post/{postId} | Get post by ID                 | N/A                           | ![3 postman-post_get](https://github.com/user-attachments/assets/26ee57cc-9582-411a-a20f-3fd5fe78b61e)   |
| PATCH       | /post/{postId}/{userId}  | Update post by ID(userId-작성자 확인)            | `{"title": "Updated", "content": "New content"}` | ![7  postman - post patch 한 것](https://github.com/user-attachments/assets/9efe95f4-ba04-429d-a7df-93701424b4a3) ![7  postman - post patch 시 작성사 확인 오류](https://github.com/user-attachments/assets/a892117e-10bb-4316-9375-39362c4215a2) ![7  DB - patch 후 data](https://github.com/user-attachments/assets/00088c77-bae6-47e3-b36e-71aab6ba3c4b) |
| DELETE      | /post/{postId}/{userId}  | Delete post by ID(userId-작성자 확인)        | N/A                           | ![6  postman - post delete 한 것](https://github.com/user-attachments/assets/8e4d8544-00d8-4227-afd6-fbb87c4a8706) ![6  postman- post delete 시 작성사 확인 오류](https://github.com/user-attachments/assets/a17c7a61-1b39-4612-9ffb-92eb62e70afb) ![6  DB - post delete 후 data](https://github.com/user-attachments/assets/5f10ed8c-5e9f-4da2-833a-4bd5ebc25aee) |

---

## 3. Like 기능

| HTTP Method | URL                            | Description                    | Request Example | Image Placeholder |
|-------------|--------------------------------|--------------------------------|-----------------|-------------------|
| POST        | /like/{postId}/{userId}            | Like a post                    | N/A             | ![4 postman-like_post](https://github.com/user-attachments/assets/620b4d6a-8584-48a5-aca2-e74d56a5f66f)  ![5 postman-like 이후에 1번 게시물 결과 (count증가)](https://github.com/user-attachments/assets/1aa6d0e3-c9c2-4823-94be-1988c14be35c)   |
| DELETE      | /like/{postId}/{userId}         | Unlike a post                  | N/A             | ![5 postman- like 2번하면 취소되는 결과(count 감소)](https://github.com/user-attachments/assets/cbcfd775-4b1c-4d52-ad39-599388fff9bc) |

---

## 4. 기타 설명
### DB 구조
| Schema | User | Post | Like |
| --- | --- | --- | --- |
| PK | userId(Long) | postId(Long) | likeId(Long) |
| FK |  | userId(Long) | userId(Long) |
|  |  |  | postid(Long) |
| variable | userName(String) | content(String) |  |
| | List-Post | List-Like | |

### Like - Unlike 구현 방법
like repository에서 JPA 문법을 사용해 Optional<Like> findByUserAndPost(User user, Post post); 을 만듦. -> 특정 User와 특정 Post를 기준으로 해당하는 Like를 조회하는 함수
- flow  <br>
1. like를 post할 때 userid와 postid를 path variable로 가져오기 <br>
2. 해당 id로 user와 post를 가져와 위의 문법을 사용 <br>
2-1. like가 존재하면 해당 like를 삭제하고 false를 return <br>
2-2. like가 존재하지 않으면 새롭게 like를 생성하고 ture를 return <br>



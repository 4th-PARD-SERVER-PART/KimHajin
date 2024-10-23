---

# **Hw4- hajin**  
블로그 플랫폼 만들기 + 선택도 해보았습니다.  

---

## 1. User 기능

| HTTP Method | URL                    | Description         | Request Example                 | Image Placeholder       |
|-------------|------------------------|---------------------|---------------------------------|-------------------------|
| POST        | /user                   | Create a new user   | `{"username": "강민호"}`          | ![create_user_image]()   |
| GET         | /user/{userId}          | Get user by ID      | N/A                             | ![get_user_image]()     |
| PATCH       | /user/{userId}          | Update user details | `{"username": "UpdatedName"}`   | ![update_user_image]() |
| DELETE      | /user/{userId}          | Delete user by ID   | N/A                             | ![delete_user_image]() |

---

## 2. Post 기능

| HTTP Method | URL                          | Description                    | Request Example               | Image Placeholder       |
|-------------|------------------------------|--------------------------------|-------------------------------|-------------------------|
| POST        | /user/{userId}/post           | Create a post for a user       | `{"title": "New Post", "content": "Content here"}` | ![create_post_image]()  |
| GET         | /user/{userId}/post/{postId}  | Get post by ID                 | N/A                           | ![get_post_image]()    |
| PATCH       | /user/{userId}/post/{postId}  | Update post                    | `{"title": "Updated", "content": "New content"}` | ![update_post_image]() |
| DELETE      | /user/{userId}/post/{postId}  | Delete post by ID              | N/A                           | ![delete_post_image]() |

---

## 3. Like 기능

| HTTP Method | URL                            | Description                    | Request Example | Image Placeholder |
|-------------|--------------------------------|--------------------------------|-----------------|-------------------|
| POST        | /post/{postId}/like            | Like a post                    | N/A             | ![like_post_image]()    |
| DELETE      | /post/{postId}/like            | Unlike a post                  | N/A             | ![unlike_post_image]() |

---




---

### 기머전시 - Spring Boot Survey Site

</div>

---

## 📝 프로젝트 소개
**기머전시**는 설문조사를 통해 기념일 이벤트를 위한 데이터를 수집하고 관리할 수 있는 웹 애플리케이션입니다.  
주요 기능은 다음과 같습니다:
- 유저 정보 및 답안 생성
- 유저의 답변 데이터 조회

<br />

---

## 🗂️ APIs
작성된 API는 아래에서 확인할 수 있습니다.

👉🏻 [API 설계 보기](https://sand-jaguar-c98.notion.site/api-709d39a7474843b2a0416b401536e20a?pvs=4)

---

### Back-end
<div>
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/Java.png?raw=true" width="80">
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/SpringBoot.png?raw=true" width="80">
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/SpringDataJPA.png?raw=true" width="80">
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/Mysql.png?raw=true" width="80">
</div>
<br />

---

## 🗂️ API 설계

### 1. **유저 정보 및 답안 생성**

#### **HTTP 메서드 및 URL**
| **HTTP Method** | **URL**       | **Description**                         |
|-----------------|---------------|-----------------------------------------|
| **POST**        | `/user`       | 새로운 유저와 유저의 답안을 생성합니다. |

#### **Request Body**
| **필드명**     | **타입**         | **설명**                           |
|----------------|------------------|------------------------------------|
| `name`         | `String`         | 유저의 이름                        |
| `dateinfo`     | `String`         | 유저의 날짜 정보                   |
| `answer`       | `List<String>`   | 유저의 답안 (질문에 대한 답변 목록) |

#### **Response**
- **Status Code**: `200 OK`  
  **Message**: `User created successfully!`

---

### 2. **유저 정보 및 답안 조회**

#### **HTTP 메서드 및 URL**
| **HTTP Method** | **URL**             | **Description**                         |
|-----------------|---------------------|-----------------------------------------|
| **GET**         | `/user/{userId}`     | 유저의 정보와 유저의 답안을 가져옵니다. |

#### **Path Variable**
| **필드명**     | **타입**          | **설명**                              |
|----------------|-------------------|---------------------------------------|
| `userId`       | `Integer`         | 조회할 유저의 ID                      |

#### **Response**
| **필드명**     | **타입**          | **설명**                              |
|----------------|-------------------|---------------------------------------|
| `name`         | `String`          | 유저의 이름                           |
| `dateinfo`     | `String`          | 유저의 날짜 정보                      |
| `answer`       | `List<String>`    | 유저의 답안 (질문에 대한 답변 목록)   |

---
## 아쉬웠던 점 + 추후 기대하는 점
서버를 많이 활용하지 못한 웹이라 아쉬웠지만, 가능하다면 자동 삭제 기능(30일 이후 자동 삭제)을 만들어 DB에 적용하면 좋을 것 같다.

## 💁‍♂️ 팀원
|Backend|Frontend|  
|:---:|:---:|  
|하진 | 신엽, 석영, 민찬 |  
---

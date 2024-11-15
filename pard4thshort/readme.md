
---

<div align="center">

<!-- logo -->
<img src="https://user-images.githubusercontent.com/80824750/208554611-f8277015-12e8-48d2-b2cc-d09d67f03c02.png" width="400"/>

### 기머전시 - Spring Boot Survey Site 🎉

[<img src="https://img.shields.io/badge/-readme.md-important?style=flat&logo=google-chrome&logoColor=white" />]() [<img src="https://img.shields.io/badge/-tech blog-blue?style=flat&logo=google-chrome&logoColor=white" />]() [<img src="https://img.shields.io/badge/release-v1.0.0-yellow?style=flat&logo=google-chrome&logoColor=white" />]()  
[<img src="https://img.shields.io/badge/프로젝트 기간-2024.11.01~2024.11.30-green?style=flat&logo=&logoColor=white" />]()

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

👉🏻 [API 설계 보기](#api-설계)

---

## ⚙ 기술 스택

### Back-end
<div>
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/Java.png?raw=true" width="80">
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/SpringBoot.png?raw=true" width="80">
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/SpringDataJPA.png?raw=true" width="80">
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/Mysql.png?raw=true" width="80">
</div>

### Infra
<div>
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/AWSEC2.png?raw=true" width="80">
</div>

### Tools
<div>
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/Github.png?raw=true" width="80">
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/Notion.png?raw=true" width="80">
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

## 💁‍♂️ 팀원
|Backend|Frontend|  
|:---:|:---:|  
|하진 | 신엽, 석영, 민찬 |  
|[백엔드 담당](https://github.com/backend)|[프론트엔드 담당](https://github.com/frontend)|  

---

이런 형태로 수정하시면 기존 템플릿과 "기머전시"의 정보를 효과적으로 결합할 수 있습니다. 추가로 필요한 내용이 있다면 알려주세요!

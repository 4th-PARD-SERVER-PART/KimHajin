# SpringBoot-Project-MEGABOX
스프링 부트 + 설문조사 사이트

## 🖥️ 프로젝트 소개

<br>

## 🖥️ 디렉터리 구조


### ⚙️ 개발 환경
- `Java 8`
- `JDK 1.8.0`
- **IDE** : STS 3.9
- **Framework** : Springboot(2.x)
- **Database** : Oracle DB(11xe)
- **ORM** : Mybatis


## 📌 백엔드 주요 기능
#### 설문조사 유저 정보 + 유저의 답안 추가하기
| **HTTP Method** | **URL**              | **Description**      | 
|-----------------|----------------------|----------------------|
| **POST**         | `/user`         | Create a new user and user info   |

- Reqeust body
 | String        |     name     |
 | String        |     dateinfo     |
 | List<String>        |     answer     |

 
- Response


#### 유저 정보 + 유저의 답안 가져오기
| **HTTP Method** | **URL**              | **Description**      | 
|-----------------|----------------------|----------------------|
| **GET**         | `/user/{userid}`         | Create a new user and user info   |

- Pathvariable
- Response



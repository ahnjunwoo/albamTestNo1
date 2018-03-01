**회원가입**
====
  Albam member join test
  
구현기술
----
spring boot 1.5.10.RELEASE , mysql, AWSZON ec2, JPA, lombok

* **URL**

  /members

* **Method:**

  `POST`
  
*  **URL Params**

   **Required:**
 
  	None

* **Data Params**

  `{"username":"ahnjunwoo","password":"1234","account":"cutesboy3@naver.com"}`

* **Success Response:**

  * **Code:** 200 OK<br />
    **Content:** `{ "code" : "S0001", message : "정상처리" }`
 
* **Error Response:**

  * **Code:** 400 Bad Request <br />
    **Content:** `{ "code" : "E0001", "message" : "username 길이는 최대 20자"}`

  OR

  * **Code:** 404 Not Found <br />
    **Content:** `{
	"timestamp": 1519870808649,
	"status": 404,
	"error": "Not Found",
	"message": "No message available",
	"path": "/member"
	}`

* **Sample Call:**
REST Client tool(https://insomnia.rest/download/) 을 이용하셔서 body 부분에 json 형태로 URL : /member method: POST로 요청
	```http
   /members POST
   `{"username":"ahnjunwoo","password":"1234","account":"cutesboy3@naver.com"}`
  ```

  
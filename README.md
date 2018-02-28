**회원가입**
----
  회원가입

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

  * **Code:** S200 <br />
    **Content:** `{ id : 12, name : "Michael Bloom" }`
 
* **Error Response:**

  * **Code:** E101 <br />
    **Content:** `{ error : "username 영문입력만 가능합니다" }`

  OR

  * **Code:** E001 <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`

* **Sample Call:**
REST Client tool(https://insomnia.rest/download/)을 이용하셔서 body 부분에 json 형태로 URL : /member method: POST로 요청
	```http
   /members POST
   `{"username":"ahnjunwoo","password":"1234","account":"cutesboy3@naver.com"}`
  ```

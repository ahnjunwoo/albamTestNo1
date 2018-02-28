회원 가입 REST API
JSON 값으로 REST POST 요청시 JSON 값으로 리턴해주는 API

URL

/member

Method:

POST

Required:

id=[integer]

Data Params

None

Success Response:

Code: 200 
Content: { id : 12, name : "Michael Bloom" }
Error Response:

Code: 404 NOT FOUND 
Content: { error : "User doesn't exist" }
OR

Code: 401 UNAUTHORIZED 
Content: { error : "You are unauthorized to make this request." }
Sample Call:

  $.ajax({
    url: "/users/1",
    dataType: "json",
    type : "GET",
    success : function(r) {
      console.log(r);
    }
  });
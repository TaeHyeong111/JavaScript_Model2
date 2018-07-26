<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<jsp:include page="../common/head.jsp" />
<body>
	<h1>Login</h1>
	<form id="userLoginForm" >
		User ID : <input type="text" name="userid" /> <br>
		 Password : <input	type="text" name="password" /> 
		 <input id="loginFormBtn" type="button" value="submit" />  
		 <input type="hidden" name="action"	value="login" />
		  <input type="hidden" name="page" value="mypage" />
	</form>

	<script>
	document.getElementById('loginFormBtn')
    .addEventListener('click',function(){ //클릭 했을때 일어나는 행동
    	var member = new Member();
    	alert('입력한 id : '+userid);
    	
    	var form = document.getElementById('userLoginForm');
    	form.action = "${ctx}/member.do";
    	form.method = "post";   //post는 입력값이 숨겨지고 get은 입력값이 url에 노출됨
    	var userid = form.userid.value;
    	var password = form.password.value;
    	member.setUserid(userid);
    	member.setPassword(password);
    	if(member.loginValidation()){
    		form.submit();
    	}
    });
	
	document.ElementById('loginFormBtn')
	.addEventListener('click',function(){ //이벤트가(click의미) 주도하는 콜백함수  
		
	})
    </script>
</body>
</html>


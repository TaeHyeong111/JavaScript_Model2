<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<jsp:include page="../common/head.jsp" />
<body>
	<h1>Login</h1>
	<form id="userLoginForm">
		User ID : <input type="text" name="userid" /> <br>
		 Password : <input	type="text" name="password" /> 
		 <input id="loginFormBtn" type="button" value="submit" /> 
		 <input type="hidden" name="action"	value="login" />
		  <input type="hidden" name="page" value="mypage" />
	</form>

	<script>
	document.getElementById('loginFormBtn')
    .addEventListener('click',function(){ //클릭 했을때 일어나는 행동
    	alert('입력한 id : '+userid);
    	
    	var form = document.getElementById('userLoginForm');
    	form.action = "${ctx}/member.do";
    	form.method = "post";
    	var userid = form.userid.value;
    	var password = form.password.value;
    	member.setUserid(userid);
    	member.setPassword(password);
    	if(member.loginValidation()){
    		form.submit();
    	}
    });
   /*  if(form.userLoginForm.userid.value ==='' ){
    	
	   아이디 ===
		   패스워드 ===
			   섭밋
			   숫자값은 == 
				   문자는 ===
	   
    } */
    </script>

</body>
</html>


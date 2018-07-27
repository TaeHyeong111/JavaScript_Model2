<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<jsp:include page="../common/head.jsp" />
<body>
	<h1>Login</h1>
	<form id="joinForm" name="joinForm">
		Name : <input type="text" name="name"/><br>
		User ID : <input type="text" name="userid" /> <br>
		 Password : <input	type="text" name="password" /><br>
		 SSN : <input type="text" name="ssn"/>
		 <input type="hidden" name="age"/>
		 <input type="hidden" name="gender"/> 
		 <input id="joinFormBtn" type="button" value="제출" />  
		 <input type="hidden" name="action"	value="login" />
		  <input type="hidden" name="page" value="mypage" />
		  
		  <script>
		  document.getElementById("joinFormBtn").addEventListener('click', function(){
			  var x = service.nullChecker
			  		  ([document.joinForm.name.value, 
						document.joinForm.userid.value, 
						document.joinForm.password.value,
						document.joinForm.ssn.value]);
				if(x.checker){
					var form = document.getElementById('joinForm');
					form.action = "${ctx}/member.do";
					form.method = "post";
					member.join(form.ssn.value);
					form.gender.value = member.getGender();
					form.age.value = member.getAge();
					alert(member.getGender());
					form.submit();
				}else{
					alert(x.text);
				}	
			});
    </script>
		  
		  소속팀
		  <input type="radio" name="teamid"
		  value="none" checked="checked"/> 없음
		  <input type="radio" name="teamid"
		  value="nolja"/>놀자
		  <input type="radio" name="teamid"
		  value="jieunHouse"/>지은하우스
		  <input type="radio" name="teamid"
		  value="turtleking"/>거북왕
		  <input type="radio" name="teamid"
		  value="coddingZzang"/>코딩짱
		  
		  프로젝트역할
		  <select name="roll" id="roll">
		  <option value="leader">팀장</option>
		  <option value="front">프론트개발</option>
		  <option value="back">백단개발</option>
		  <option value="android">안드로이드개발</option>
		  <option value="minfe">민폐</option>
		  </select>
		  
		  수강과목
		  <input type="checkbox" name="subject"
		  value="java" checked="checked"/> Java
		  <input type="checkbox" name="subject" value="clang"/> C언어
		  <input type="checkbox" name="subject" value="jsp"/> JSP
		  <input type="checkbox" name="subject" value="php"/> PHP
		  <input type="checkbox" name="subject" value="nodejs"/> NodsJS
		  <input type="checkbox" name="subject" value="linux"/> Linux
		  <input type="checkbox" name="subject" value="html"/> HTML
		  <input type="checkbox" name="subject" value="spring"/> Spring
	</form>

</body>
</html>


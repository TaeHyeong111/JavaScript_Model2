<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String ctx = application.getContextPath(); %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title><h3>비밀번호 변경</h3></title>
</head>
<body>
	<h3>비밀번호 변경</h3>
	<form action="updateResult.jsp">
		User ID : <br>
		<input type="text" name="userid" > <br>
		Old password : <br>
		<input type="text" name="password"> <br>
		New password : <br>
		<input type="text" name="newpassword"> <br>
		<input type="submit" value="update"> <br>
		<input type="hidden" name="action" value="UPDATE"/>
		<input type="hidden" name="page" value="updateResult"/>
	</form>

</body>
</html>






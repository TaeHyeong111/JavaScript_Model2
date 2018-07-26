<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div id="login-Box">
<a id="moveLoginForm" >LOGIN </a> &nbsp;&nbsp;&nbsp;
<a id="moveJoinForm"> JOIN </a>
</div>
<script>
	document.getElementById('moveLoginForm')
	.addEventListener('click',function() {
	alert('클릭 이벤트 체크!!');
	new Common().move('${ctx}','member','move','userLoginForm');
});
	document.getElementById('moveJoinForm')
	.addEventListener('click',function() {
	alert('클릭 이벤트 체크!!');
	new Common().move('member','move','userLoginForm');
});
</script>
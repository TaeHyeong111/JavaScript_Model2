<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<head>
	<meta charset="UTF-8" />
	<title>main</title>
	<link rel="stylesheet" href="${css}/style.css" />

<script>
var common = new(function () {
	this.move = function (domain,action,page){//프로퍼티에 메소드면 객체가됨 this.move 프로퍼티, function 메소드 
		location.href = "${ctx}/"+domain+".do?action="+action+"&page="+page;
	}
});

var member = new (function(){
	var userid, ssn, password;
	this.setUserid = function(x){
		this.userid = x;
	}
	this.setSsn = function(x){
		this.ssn = x;
	}
	this.setPassword = function(x){
		this.password = x;
	}
	this.getUserid = function(){
		return this.userid;
	}
	this.getSsn = function(){
		return this.ssn;
	}
	this.getPassword = function(){
		return this.password;
	}
	this.loginValidation = function () {
		if(this.userid===''){
			alert("ID 입력하세요");
			return false;
		}else if(this.password===''){
			alert("PASS 입력하세요");
			return false;
		} else{
			return true;
		}
	}
});
</script>
</head>

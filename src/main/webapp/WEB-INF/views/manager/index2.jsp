<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title></title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css">
  <!-- 제이쿼리 불러오기 -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	
</head>

<style>
.btn-outline-dccc{
	color:black;
	font-weight:700;
}

.btn-outline-dccc:hover{
	color:var(--sig-color);
	font-weight:900;
}

.footer-bg{
	background-color:var(--sig-color);
	margin-bottom: -15px;
}

.font-black{
	color:black;
}

.font-black:hover{
	color:inherit;
}
.font-dccc{
	color:var(--sig-color);
}
.font-dccc:hover{
	color:var(--sig-color);
	font-weight: bold;
}
.sub-footer{
	margin-top:0.5px;
}
.sub-footer-content{
	padding:0 1rem;
	color:#869099;
}

.main-content-header{
	background-color:#dfdfdf;
	height:2rem;
	line-height:2rem;
}

.aside-naming{
	border-bottom:1px solid black;
	margin-bottom:5px;
	font-size: 1.2rem;
    font-weight: bold;
}

.login-header{
	display:flex;
	margin:0 auto;
  	width:auto;
  	max-width:var(--wrap-max-width);
}

.grow-1{
	flex-grow:1;
}
.w-5rem{
	width:5rem;
}

.btn-white{
	color:white;
}
.btn-white:hover{
	color:#6c757d;
}
.btn-dccc{
	background-color:var(--sig-color);
	color:white;
}
.btn-original:hover{
	background-color:var(--sig-color);
	color:white;
}
.wrap-m-w{
	max-width:var(--wrap-max-width);
}

.user-admin-select-box{
	width: 100%;
    margin-bottom: 10px;
}

.m-50-a-50-a{
	margin: 50px auto 50px auto;
}
.border-dccc-opacity{
	border:1px solid rgba(169, 210, 180, 0.3);
}
.main-center-content-main{
	font-weight: bolder;
}
.login-header-font{
	color:var(--sig-color);
	font-weight: bolder;
	font-size: 1.5rem;
}
.width-500{
	width:500px;
}
.r-0{
	right:0;
}
.t-32-r-0{
	top:32px;
	right:0;
}

.c-red{
	color:red;
	font-weight: bold;
}
.c-dccc{
	color:var(--sig-color);
	font-weight: bold;
}
.ml-minus-40{
	margin-left:-40px;
}
.p-1_25{
	padding: 0 1.25rem;
}
.aside_menu{
	padding-left:0;
}
.aside_menu>div,.aside_menu>button{
	width:calc(100% - 1.25rem);
}
.admin_mode{
	color: white;
    line-height: 37px;
    width: 240px;
    text-align: center;
    font-weight: bolder;
}
body{
	background-image: url(/resources/images/background.png);
	background-size:cover;
}

login-1 {
	color:white;
}
a{
	text-decoration:none;
	color:#01A9DB;
	font-size:12px;
}
</style>
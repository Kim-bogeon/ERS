<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="pageTitle" value="직원 관리" />
<%@include file="../common/head.jspf" %>

<div class="container-fluid">
	<div class="row mt-4 bg-primary bg-gradient" style="height:100px; line-height:100px;">
		<div class="col-5" style="">
			<h1 class="align-self-center">직원등록현황</h1>
		</div>
		<div class="col-7" style="">
			<div class="row">
				<div class="col-4 text-center" style="line-height:normal; vertical-align:middle; display:inline-block;">
					<i class="bi bi-people-fill" style="color:white; font-size:50px; "></i>
					<div class="d-inline-block" >
						<div style="color:white; font-size:16px;">총 직원수</div>
						<div style="color:white; font-size:25px;">100명</div>
					</div>
				</div>
				<div class="col-4" >
					
				</div>
				<div class="col-4" >
					<i class="bi bi-heart-fill"></i>
				</div>
			</div>
		</div>
		
	</div>
   <div class="row">
      <div class="col-5">
         <!-- 직원목록 -->
         <div class="row" style="border:1px solid red;height:400px;">
            <div class="card card-body" style="border:1px solid red;"></div>         
         </div>
         <!-- 보고서 -->
         <div class="row" style="border:1px solid red;height:400px;">
            <div class="card card-body" style="border:1px solid red;"></div>
         </div>
      
      </div>
      <!-- 상세정보 -->
      <div class="col-7" style="border:1px solid red;height:800px;">
         <div class="card card-body" style="border:1px solid red;height:800px;"></div>
      </div>
   
   </div>
</div>
	
	
	
<%@include file="../common/foot.jspf" %>


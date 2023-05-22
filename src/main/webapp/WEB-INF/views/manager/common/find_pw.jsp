<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원 PWD 찾기</title>
</head>

<body>
<style>
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
button{

}
</style>


<div style="margin-left:20px;">
	<span style="font-size:50px; font-weight:bold; color:white;">ERS</span>
	<span style="font-size:25px; font-weight:bold; color:white;">응급안전안심서비스</span>
</div>


  <div class="hero-content flex-col lg:flex-row-reverse" style="width: 450px; margin:auto; display:flex; align-items:center; height:85vh;">
    <div class="">
      
        <div class="" style="background:#084B8A; height:80px; text-align:center;">
	    	<h2 class="login-1 item-center justify-center card-title" style="color:white; line-height:100px;">비밀번호 찾기</h2>
	  	</div>
	  	
    <div class="" style="background:#fff; width:450px; height:400px; border-radius: 0px 0px 20px 20px; padding-top:50px;">



        <div class="form-control">
       	  <div style=" width:350px; margin:0 auto;">
	          <label class="label" style="margin-top:20px;">
	            <div class="label-text" style="text-align:left;">아이디</div>
	          </label>
	          <input type="email" placeholder="아이디를 입력해주세요" class="input input-bordered" style="padding-left:10px;outline:none; border:1px solid #BDBDBD; border-radius:5px; height:30px; width:200px; "/>
          </div>
        </div>
        <form>
	         <div class="form-control">
	        	<div style=" width:350px; margin:0 auto;">
		          <label class="label">
		            <div class="label-text" style="text-align:left; margin-top:20px;">전화번호</div>
				  </label>
		          <input type="text" placeholder="전화번호를 입력해주세요" class="input input-bordered" style="outline:none;border:1px solid #BDBDBD; border-radius:5px; height:30px; width:200px; padding-left:10px;"/>
	      	</div>
	      </div>
	   
	        <div class="form-control">
	        	<div style=" width:350px; margin:0 auto;">
		          <label class="label">
		            <div class="label-text" style="text-align:left; margin-top:20px;">이메일</div>
				  </label>
		          <input type="text" placeholder="이메일을 입력해주세요" class="input input-bordered" style="outline:none;border:1px solid #BDBDBD; border-radius:5px; height:30px; width:200px; padding-left:10px;"/>
				  <button style="height:30px; background:#585858; border-radius:3px; border:0; color:white; cursor:pointer;">보내기</button>
	      	</div>
	        
	       
	        <div class="form-control">
	        	<div style=" width:350px; margin:0 auto;">
		          <label class="label">
		            <div class="label-text" style="text-align:left; margin-top:20px;">인증번호</div>
				  </label>
		          <input type="text" placeholder="인증번호를 입력해주세요" class="input input-bordered" style="outline:none;border:1px solid #BDBDBD; border-radius:5px; height:30px; width:200px; padding-left:10px;"/>
				  <button style="height:30px; background:#585858; border-radius:3px; border:0; color:white; cursor:pointer;">확인</button>
	      </div>
	      <div style="text-align:center; margin-top:40px;">
	      		<button style="height:40px; background:#585858; border-radius:5px; border:0; cursor:pointer; background:#F2F2F2; border:1px solid #848484;">뒤로가기</button>
				<button style="height:40px; background:#585858; border-radius:5px; border:0; color:white; cursor:pointer; background:#084B8A;">다음으로</button>
	      </div>
	    </div>
    </form>
    
    
  </div>
</div>
</div>




</body>
</html>
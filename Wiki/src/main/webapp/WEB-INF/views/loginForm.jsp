<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Team 2 : Wiki Project</title>

<!-- <meta charset="UTF-8" /> -->

<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="description" content="Wiki Project" />
<link rel="shortcut icon" href="../favicon.ico">
<link href='http://fonts.googleapis.com/css?family=Terminal+Dosis' rel='stylesheet' type='text/css' />
<script type="text/javascript" src="resources/js/jquery-1.10.2.min.js"></script>

</head>
<body>
<jsp:include page="header.jsp" flush="true"/>
<div class="login-form">
	<section>
		<div id="login_demo">

			<a class="hiddenanchor" id="toregister"></a> 
			<a class="hiddenanchor"	id="tologin"></a>
			
			<div id="wrapper">
				<div id="login" class="loginContainer">
					<form name="login_form" method="post" action="login.do">
						<h1>Log in</h1>
						<p>
							<label for="username" class="uname" data-icon="u"> 
								Email </label> <input id="useremail" maxlength="30" size="30" name="email"
								required="required" type="email" placeholder="mymail@mail.com" />
						</p>
						<p>
							<label for="password" class="youpasswd" data-icon="p">
								Password </label> <input id="password" maxlength="30" size="20"
								name="pw" required="required" type="password"
								placeholder="eg. X8df!90EO" />
						</p>
						<p class="login button">
							<!-- <input class="submit" type="submit" value="Login" onclick="javascript:loginProcess" /> -->
							<input class="submit" type="submit" value="Login" />
						</p>
						<p class="change_link">
							Not a member yet ? <a href="joinForm.do">Join us</a>
						</p>
					</form>

				</div>
		
			</div>
		</div>
	</section>
</div>

</body>
</html>
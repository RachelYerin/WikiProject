<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Team 2 : Wiki Project</title>

<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Wiki Project" />
<meta name="keywords"
	content="menu, navigation, animation, transition, transform, rotate, css3, web design, component, icon, slide" />
<meta name="author" content="Codrops" />
<link rel="shortcut icon" href="../favicon.ico">
<link rel="stylesheet" type="text/css" href="resources/css/demo.css" />
<link rel="stylesheet" type="text/css" href="resources/css/style10.css" />
<link rel="stylesheet" type="text/css" href="resources/css/animate-custom.css" />
<link href='http://fonts.googleapis.com/css?family=Terminal+Dosis' rel='stylesheet' type='text/css' />
<script type="text/javascript" src="resources/js/jquery-1.10.2.min.js"></script>

<script type="text/javascript">
function loginProcess(){
	document.login_form.action = "login.do";
	document.login_form.submit();
}
</script>

</head>
<body>
	<!-- <form action="login.do">
		<table>
			<tr>
				<td width="150px" align="center">EMAIL :</td>
				<td width="150px" align="center">
					<input type="text" name="email">
				</td>
			</tr>
			<tr>
				<td width="150px" align="center">PW :</td>
				<td width="150px" align="center">
					<input type="password" name="pw">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="login">
				</td>
			</tr>
		</table>
	
	</form> -->

<div class="login-form">
	<section>
		<div id="login_demo">
			<!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4 -->

			<a class="hiddenanchor" id="toregister"></a> 
			<a class="hiddenanchor"	id="tologin"></a>
			
			<div id="wrapper">
				<div id="login" class="animate form">
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
							Not a member yet ? <a href="#toregister" class="to_register">Join us</a>
						</p>
					</form>

				</div>
				<div id="register" class="animate form">
					<form name="join_form" action="joinProcess" method="post" onSubmit="return checkAll(this);">
						<h1>Sign up</h1>
						<p>
							<label for="usernamesignup" class="uname" data-icon="u">Your
								username</label> 
								<input id="usernamesignup" maxlength="30" size="20" name="name" required="required" type="text"
								placeholder="mysuperusername690" />
							<input type="button" onclick="chk_name()" id="name_chk" value="double check"/>
						</p>
						<p>
							<label for="emailsignup" class="youmail" data-icon="e">
								Your email</label> <input id="emailsignup" maxlength="30" size="30"
								name="id" required="required" type="email"
								placeholder="mysupermail@mail.com" />
							<input type="button" onclick="chk_id()" id="id_chk" value="double check"/>
						</p>
						<p>
							<label for="passwordsignup" class="youpasswd" data-icon="p">Your
								password </label> <input id="passwordsignup" maxlength="30" size="20"
								name="pw" required="required" type="password"
								placeholder="eg. X8df!90EO" />
						</p>
						<p>
							<label for="passwordsignup_confirm" class="youpasswd"
								data-icon="p">Please confirm your password </label> <input
								id="passwordsignup_confirm" maxlength="30" size="20"
								name="pw_check" required="required"
								type="password" placeholder="eg. X8df!90EO" />
						</p>
						<p class="signin button">
							<input type="submit" value="Sign up" />
						</p>
						<p class="change_link">
							Already a member ? <a href="#tologin" class="to_register">
								Go and log in </a>
						</p>
					</form>
				</div>
			</div>
		</div>
	</section>
</div>

</body>
</html>
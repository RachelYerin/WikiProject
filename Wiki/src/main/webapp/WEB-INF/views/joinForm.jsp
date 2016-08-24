<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>Team 2 : Wiki Project</title>
   <meta charset="UTF-8" />
   
   <script type="text/javascript">
   function check_email(){
      if(document.login_form.email.value == "") alert("There's no input");
      else {
         window.open("check_email.do?id="+document.login_form.email.value,"","scrollbars=no,width=5,height=5,left=0,top=0");
      }
   }
   </script>
</head>
<body>
<jsp:include page="header.jsp" flush="true"/>
<div class="login-form">
	<section>
		<div id="login_demo">

			<a class="hiddenanchor" id="toregister"></a> 
			<a class="hiddenanchor"	id="tologin"></a>
			
			<div id="wrapper">
				<div id="login" class="animate form">
					<form name="login_form" method="post" action="join.do">
						<h1>Sign up</h1>
						<p>
							<label for="usernamesignup" class="uname" data-icon="u">Your username</label> 
								<input id="username" maxlength="30" size="20" name="username" required="required" type="text"
								placeholder="mysuperusername690" />
						</p>
						<p>
							<label for="emailsignup" class="youmail" data-icon="e">Your email</label>
							<input id="email" maxlength="30" size="30" name="email" required="required" type="email" placeholder="mysupermail@mail.com" />
							<input type="button" onclick="check_email()" id="id_chk" value="double check"/>
						</p>
						<p>
							<label for="passwordsignup" class="youpasswd" data-icon="p">Your password </label>
							<input id="pw" maxlength="30" size="20"	name="pw" required="required" type="password" placeholder="eg. X8df!90EO" />
						</p>
						<p>
							<label for="passwordsignup_confirm" class="youpasswd" data-icon="p">Please confirm your password </label>
							<input id="passwordsignup_confirm" maxlength="30" size="20"	name="pw_check" required="required"	type="password" placeholder="eg. X8df!90EO" />
						</p>
						<p class="signin button">
							<input type="submit" value="Sign up" />
						</p>
						<p class="change_link">
							Already a member ? <a href="loginForm.do">Go and log in </a>
						</p>
					</form>
				</div>
			</div>
		</div>
	</section>
</div>
</body>
</html>
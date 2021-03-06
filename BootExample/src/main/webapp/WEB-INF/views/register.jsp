<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap Styles-->
<link href="css/bootstrap.css" rel="stylesheet" />
<!-- FontAwesome Styles-->
<link href="css/font-awesome.css" rel="stylesheet" />
<!-- Morris Chart Styles-->
<link href="js/morris/morris-0.4.3.min.css" rel="stylesheet" />
<!-- Custom Styles-->
<link href="css/custom-styles.css" rel="stylesheet" />
<link href="css/login.css" rel="stylesheet" />
<!-- Google Fonts-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
</head>
<body>

	<div class="container">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">
								<a href="login" id="login-form-link">Login</a>
							</div>
							<div class="col-xs-6">
								<a href="register"class="active"  id="register-form-link">Register</a>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
						
								<form:form id="register-form" commandName="userForm" action="registerForm" method="post" style="display: block;">
									
									<div><form:errors path="name" class="text-danger"/></div>
									<div class="form-group">
									
										<form:input path="name" type="text" class="form-control" placeholder="Username" ></form:input>
									</div>
									<div><form:errors path="email" class="text-danger"/></div>
									<div class="form-group">
										<form:input path="email" type="email" class="form-control" placeholder="Email Address"></form:input>
									</div>
									<div><form:errors path="password" class="text-danger"/></div>
									<div class="form-group">
										<form:password path="password"  class="form-control" placeholder="Password"></form:password>
									</div>
								<%-- 	<div class="form-group">
										<form:input path="" type="password" name="confirm-password" id="confirm-password" tabindex="2" class="form-control" placeholder="Confirm Password"></form:input>
									</div> --%>
									<div><form:errors path="password" class="text-danger"/></div>
									<div class="form-group">
                                            <label>Selects</label>
                                            <form:select path="userType" class="form-control" items="${selectValue}">
                                               
                                            </form:select>
                                        </div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Register Now">
											</div>
										</div>
									</div>
								</form:form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="js/jquery-1.10.2.js"></script>
	<!-- Bootstrap Js -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Metis Menu Js -->
	<script src="js/jquery.metisMenu.js"></script>
	<!-- Morris Chart Js -->
	<script src="js/morris/raphael-2.1.0.min.js"></script>
	<script src="js/morris/morris.js"></script>
	<!-- Custom Js -->
	<script src="js/custom-scripts.js"></script>
	<script src="js/login.js"></script>
</body>
</html>
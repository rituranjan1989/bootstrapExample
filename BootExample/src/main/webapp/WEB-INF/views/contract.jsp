<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<!-- Google Fonts-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />



</head>
<body>
	<div id="wrapper">
		<jsp:include page="header.jsp" />
		<jsp:include page="leftmenubar.jsp" />
		<div id="page-wrapper">
			<div id="page-inner">
				<jsp:include page="tabMenu.jsp"></jsp:include>
				<div class="row">
					<div class="col-md-12">
						<div class="panel panel-default">
							<div class="panel-heading">Form Heading</div>
							<div class="panel-body">
								<div class="row">
									<div class="col-md-12">
										<form>
											<div class="form-group">
												<div class="row">
													<div class="col-md-6">
														<input class="form-control" type="text"
															id="example-text-input" placeholder="Name">
													</div>
													<div class="col-md-6">
														<input class="form-control" type="text"
															id="example-text-input" placeholder="Address">
													</div>
												</div>
											</div>


											<div class="form-group">

												<div class="row">
													<div class="col-md-6">
														<input class="form-control" type="tel"
															placeholder="Telephone" id="example-tel-input">
													</div>

													<div class="col-md-6">
														<input class="form-control" type="email"
															placeholder="Email" value="bootstrap@example.com"
															id="example-email-input">
													</div>
												</div>
											</div>

											<div class="form-group">
												<div class="row">
													<div class="col-md-6">
														<div class='input-group date' id='datetimepicker1'>
															<input type='text' class="form-control" /> <span
																class="input-group-addon"> <span
																class="glyphicon glyphicon-calendar"></span>
															</span>
														</div>
													</div>
													<div class="col-md-6">
														<div class='input-group date' id='datetimepicker2'>
															<input type='text' class="form-control" /> <span
																class="input-group-addon"> <span
																class="glyphicon glyphicon-calendar"></span>
															</span>
														</div>
													</div>
												</div>
											</div>

											<div class="form-group">

												<div class="row">
													<div class="col-md-6">
														<input class="form-control" type="number"
															placeholder="Number Of Service/year"
															id="example-number-input">
													</div>
													<div class="col-md-6">
														<input class="form-control" type="number"
															placeholder="Area" id="example-number-input">
													</div>
												</div>
											</div>

											<div class="form-group">
												<input class="form-control" type="text"
													id="example-text-input" placeholder="Technecian Name">
											</div>

											<div class="form-group">

												<!-- <div class="row">
											  <div class="col-md-6">
											    <label for="image">Image (in JPEG format only):</label>
											    <input name="image" type="file"/>
											  </div>
											 </div> -->

											</div>
										</form>
										<form method="POST"
											action="${pageContext.request.contextPath}/uploadFile"
											enctype="multipart/form-data">
										
											File to upload: <input type="file" name="file">
											
											 Name: <input type="text" name="name">
											<input type="submit" value="Upload"> Press here to
											upload the file!
										</form>

									</div>
								</div>
							</div>
						</div>
					</div>
				</div>




			</div>
			<!-- /. PAGE INNER  -->
		</div>
	</div>

	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.6/moment.min.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>


	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.js"></script>

	<script type="text/javascript">
		$(function() {
			$('#datetimepicker2').datetimepicker('show');
		});
	</script>
</body>
</html>
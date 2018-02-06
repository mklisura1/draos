<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Admin | User edit</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- Bootstrap 3.3.5 -->
<link rel="stylesheet"
	href="/OrderingSystem/resources/bootstrap/css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<!-- jvectormap -->
<link rel="stylesheet"
	href="/OrderingSystem/resources/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
<!-- Theme style -->
<link rel="stylesheet"
	href="/OrderingSystem/resources/bootstrap/dist/css/AdminLTE.min.css">
<!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet"
	href="/OrderingSystem/resources/bootstrap/dist/css/skins/_all-skins.min.css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<style type="text/css">
.jqstooltip {
	position: absolute;
	left: 0px;
	top: 0px;
	visibility: hidden;
	background: rgb(0, 0, 0) transparent;
	background-color: rgba(0, 0, 0, 0.6);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr=#99000000,
		endColorstr=#99000000);
	-ms-filter:
		"progid:DXImageTransform.Microsoft.gradient(startColorstr=#99000000, endColorstr=#99000000)";
	color: white;
	font: 10px arial, san serif;
	text-align: left;
	white-space: nowrap;
	padding: 5px;
	border: 1px solid white;
	z-index: 10000;
}

.jqsfield {
	color: white;
	font: 10px arial, san serif;
	text-align: left;
}
</style>
</head>
<body class="sidebar-mini skin-yellow fixed">
	<div class="wrapper">

		<header class="main-header">

			<!-- Logo -->
			<a href="index" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
				<span class="logo-mini"><b>O</b>Sys</span> <!-- logo for regular state and mobile devices -->
				<span class="logo-lg"><b>Order</b>System</span>
			</a>

			<!-- Header Navbar: style can be found in header.less -->
			<nav class="navbar navbar-static-top" role="navigation">
				<!-- Sidebar toggle button-->
				<a href="#" class="sidebar-toggle" data-toggle="offcanvas"
					role="button"> <span class="sr-only">Toggle navigation</span>
				</a>
				<!-- Navbar Right Menu -->
				<div class="navbar-custom-menu">
					<ul class="nav navbar-nav">

						<li class="dropdown user user-menu"><a href="#"
							class="dropdown-toggle" data-toggle="dropdown"
							aria-expanded="false"> <img
								src="../../dist/img/user2-160x160.jpg" class="user-image"
								alt="User Image"> <span class="hidden-xs">Alexander
									Pierce</span>
						</a>
							<ul class="dropdown-menu">
								<!-- User image -->
								<li class="user-header"><img
									src="../../dist/img/user2-160x160.jpg" class="img-circle"
									alt="User Image">
									<p>
										Alexander Pierce - Web Developer <small>Member since
											Nov. 2012</small>
									</p></li>
								<!-- Menu Footer-->
								<li class="user-footer">
									<div class="pull-left">
										<a href="#" class="btn btn-default btn-flat">Profile</a>
									</div>
									<div class="pull-right">
										<a href="#" class="btn btn-default btn-flat">Sign out</a>
									</div>
								</li>
							</ul></li>

					</ul>
				</div>

			</nav>
		</header>
		<!-- Left side column. contains the logo and sidebar -->
		<aside class="main-sidebar">
			<!-- sidebar: style can be found in sidebar.less -->
			<section class="sidebar" style="height: auto;">
				<!-- sidebar menu: : style can be found in sidebar.less -->
				<ul class="sidebar-menu">
					<li class="header">MAIN NAVIGATION</li>

					<li><a href="#"> <i class="fa fa-dashboard"></i> <span>Dashboard</span>
					</a></li>
					<li><a href="#"> <i class="fa fa-home"></i> <span>Home
								content</span>
					</a></li>
					<li><a href="#"> <i class="fa fa-calendar"></i> <span>About
								us content</span>
					</a></li>
					<li><a href="#"> <i class="fa fa-circle-o"></i> <span>General
								information</span>
					</a></li>
					<li class="treeview active"><a href="#"> <i
							class="fa fa-users"></i> <span>Users</span> <i
							class="fa fa-angle-left pull-right"></i>
					</a>
						<ul class="treeview-menu">
							<li><a href="/OrderingSystem/admin/user/add"><i
									class="fa fa-user-plus"></i>Add new user</a></li>
							<li><a href="/OrderingSystem/admin/user/list"><i
									class="fa fa-list-ul"></i>Show all users</a></li>
						</ul></li>
				</ul>
			</section>
			<!-- /.sidebar -->
		</aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>User edit</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Admin</a></li>
					<li>Users</li>
					<li class="active">User edit</li>
				</ol>
			</section>

			<!-- Main content -->
			<section class="content">
				<!-- Info boxes -->
				<div class="row">
					<!-- Lijevi dio kolone za user details -->
					<form:form method="POST"
						action="/OrderingSystem/admin/user/edit/${user_id}"
						modelAttribute="userWrapper">
						<div class="col-md-6">
							<div class="box box-primary">
								<div class="box-header with-border">
									<h3 class="box-title">User details</h3>
								</div>
								<div class="box-body">

									<spring:bind path="user.user_first_name">
										<div class="form-group ${status.error ? 'has-error' : ''}">
											<form:label path="user.user_first_name">First name</form:label>
											<form:input type="text" path="user.user_first_name"
												placeholder="First name" class="form-control" />
											<div class="has-error">
												<form:errors path="user.user_first_name"
													cssStyle="color: #ff0000;" />
											</div>
										</div>
									</spring:bind>
									
									<spring:bind path="user.user_last_name">
										<div class="form-group ${status.error ? 'has-error' : ''}">
											<form:label path="user.user_last_name">Last name</form:label>
											<form:input type="text" path="user.user_last_name"
												placeholder="Last name" class="form-control" />
											<div class="has-error">
												<form:errors path="user.user_last_name"
													cssStyle="color: #ff0000;" />
											</div>
										</div>
									</spring:bind>
									
									<spring:bind path="user.user_name">
										<div class="form-group ${status.error ? 'has-error' : ''}">
											<form:label path="user.user_name">Username</form:label>
											<form:input type="text" path="user.user_name"
												placeholder="Username" class="form-control" />
											<div class="has-error">
												<form:errors path="user.user_name"
													cssStyle="color: #ff0000;" />
											</div>
										</div>
									</spring:bind>
									
									<spring:bind path="user.mobile_phone">
										<div class="form-group ${status.error ? 'has-error' : ''}">
											<form:label path="user.mobile_phone">Mobile phone</form:label>
											<form:input type="text" path="user.mobile_phone"
												placeholder="Mobile phone" class="form-control" />
											<div class="has-error">
												<form:errors path="user.mobile_phone"
													cssStyle="color: #ff0000;" />
											</div>
										</div>
									</spring:bind>
									
									<spring:bind path="user.user_email">
										<div class="form-group ${status.error ? 'has-error' : ''}">
											<form:label path="user.user_email">Email</form:label>
											<form:input type="text" path="user.user_email"
												placeholder="Email" class="form-control" />
											<div class="has-error">
												<form:errors path="user.user_email"
													cssStyle="color: #ff0000;" />
											</div>
										</div>
									</spring:bind>

								</div>
							</div>

							<!-- Lijevi dio kolone za user type privilege -->
							<div class="box box-primary">
								<div class="box-header with-border">
									<h3 class="box-title">Type and privilege details</h3>
								</div>
								<div class="box-body">

									<spring:bind path="userType.user_type_name">
										<div class="form-group ${status.error ? 'has-error' : ''}">
											<form:label path="userType.user_type_name">User type</form:label>
											<form:select path="userType.user_type_name"
												class="form-control">
												<form:option value="${userType.user_type_id}"
													name="userType" label="${userType.user_type_name}" />

												<c:forEach var="userTypes" items="${userTypes}">
													<option value="${userTypes.user_type_id}"
														name="userType">${userTypes.user_type_name}</option>
												</c:forEach>

											</form:select>
											<div class="has-error">
												<form:errors path="userType.user_type_name"
													cssStyle="color: #ff0000;" />
											</div>
										</div>
									</spring:bind>

									<spring:bind path="userPrivilege.privilege_name">
										<div class="form-group ${status.error ? 'has-error' : ''}">
											<form:label path="userPrivilege.privilege_name">User privilege</form:label>
											<form:select path="userPrivilege.privilege_name"
												class="form-control">
												<form:option value="${userPrivilege.privilege_id}"
													name="userPrivilege"
													label="${userPrivilege.privilege_name}" />

												<c:forEach var="userPrivileges" items="${userPrivileges}">
													<option value="${userPrivilege.privilege_id}"
														name="userClass">${userPrivileges.privilege_name}</option>
												</c:forEach>

											</form:select>
											<div class="has-error">
												<form:errors path="userPrivilege.privilege_name"
													cssStyle="color: #ff0000;" />
											</div>
										</div>
									</spring:bind>
								</div>
							</div>
						</div>


						<!-- Desni dio kolone za adresu -->
						<div class="col-md-6">
							<div class="box box-primary">
								<div class="box-header with-border">
									<h3 class="box-title">Address details</h3>
								</div>
								<div class="box-body">

									<spring:bind path="address.address_id">
										<form:input type="hidden" path="address.address_id"
											class="form-control" />
									</spring:bind>

									<spring:bind path="address.state">
										<div class="form-group ${status.error ? 'has-error' : ''}">
											<form:label path="address.state">State</form:label>
											<form:input type="text" path="address.state"
												placeholder="State" class="form-control" />
											<div class="has-error">
												<form:errors path="address.state" cssStyle="color: #ff0000;" />
											</div>
										</div>
									</spring:bind>

									<spring:bind path="address.city">
										<div class="form-group ${status.error ? 'has-error' : ''}">
											<form:label path="address.city">City</form:label>
											<form:input type="text" path="address.city" name="city"
												placeholder="City" class="form-control" />
											<div class="has-error">
												<form:errors path="address.city" cssStyle="color: #ff0000;" />
											</div>
										</div>
									</spring:bind>

									<spring:bind path="address.street">
										<div class="form-group ${status.error ? 'has-error' : ''}">
											<form:label path="address.street">Street</form:label>
											<form:input type="text" path="address.street"
												name="street" placeholder="Street"
												class="form-control" />
											<div class="has-error">
												<form:errors path="address.street"
													cssStyle="color: #ff0000;" />
											</div>
										</div>
									</spring:bind>

									<spring:bind path="address.street_number">
										<div class="form-group ${status.error ? 'has-error' : ''}">
											<form:label path="address.street_number">Street number</form:label>
											<form:input type="text" path="address.street_number"
												name="street_number" placeholder="Street number"
												class="form-control" />
											<div class="has-error">
												<form:errors path="address.street_number"
													cssStyle="color: #ff0000;" />
											</div>
										</div>
									</spring:bind>
								</div>
							</div>
						</div>
						
						<!-- Desni dio kolone za password -->
						<div class="col-md-6">
							<div class="box box-primary">
								<div class="box-header with-border">
									<h3 class="box-title">Security details</h3>
								</div>
								<div class="box-body">
								
									<label>Password</label>
									<input type="text" placeholder="Password">
									
									<label>Repeat password</label>
									<input type="text" placeholder="Repeat Password">

								</div>
								<div class="box-footer">
									<button type="submit" class="btn btn-primary"
										style="float: right;">Submit</button>
								</div>
							</div>
						</div>
					</form:form>
				</div>
				<!-- /.row -->
			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->

		<footer class="main-footer">
			<div class="pull-right hidden-xs">
				<b>Version</b> 1.0.0
			</div>
			<strong>Copyright © 2017-2018 <a
				href="https://www.facebook.com/mklisura1">DRAOS2</a>.
			</strong> All rights reserved.
		</footer>

	</div>
	<!-- ./wrapper -->

	<!-- jQuery 2.1.4 -->
	<script
		src="/OrderingSystem/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
	<!-- Bootstrap 3.3.5 -->
	<script src="/OrderingSystem/resources/bootstrap/js/bootstrap.min.js"></script>
	<!-- FastClick -->
	<script
		src="/OrderingSystem/resources/plugins/fastclick/fastclick.min.js"></script>
	<!-- AdminLTE App -->
	<script src="/OrderingSystem/resources/bootstrap/dist/js/app.min.js"></script>
	<!-- Sparkline -->
	<script
		src="/OrderingSystem/resources/plugins/sparkline/jquery.sparkline.min.js"></script>
	<!-- jvectormap -->
	<script
		src="/OrderingSystem/resources/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
	<script
		src="/OrderingSystem/resources/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
	<!-- SlimScroll 1.3.0 -->
	<script
		src="/OrderingSystem/resources/plugins/slimScroll/jquery.slimscroll.min.js"></script>
	<!-- ChartJS 1.0.1 -->
	<script src="/OrderingSystem/resources/plugins/chartjs/Chart.min.js"></script>
</body>
</html>

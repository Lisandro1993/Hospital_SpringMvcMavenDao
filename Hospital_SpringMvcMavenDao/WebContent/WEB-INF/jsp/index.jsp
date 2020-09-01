<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Log In Form</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!--    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">-->
<link href="${pageContext.request.contextPath}/resources/css/style.css"
	rel="stylesheet">
</head>

<body>

	<div class="container" id="log-in-form">
		<div class="heading">
			<h2>Login</h2>
		</div>
		<form method="post" action="index" >
		<div class="form-group">
			<input type="text" class="form-control" name="email"
				placeholder="Enter username" >
		</div>
		<div class="form-group">
			<input type="password" class="form-control" name="password"
				placeholder="Enter password" >
		</div>
		<div class="form-group form-group-btn">
			<button type="submit" class="btn btn-success btn-lg">Acceder</button>
		</div>
		<div class="clearfix"></div>
	
			<label>Registro de nuevos usuarios</label> <a href="registro">
				Registro de usuarios</a>
			</form>
		</div>
</body>

</html>

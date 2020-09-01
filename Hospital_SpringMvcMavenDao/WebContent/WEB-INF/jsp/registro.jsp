<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">

<title>Registration Form</title>

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link
	href="${pageContext.request.contextPath}/resources/css/stylereg.css"
	rel="stylesheet">

</head>

<body>
	<div class="container" id="registration-form">
		<div class="image"></div>
		<div class="frm">
			<h3>Registro de usuarios</h3>
			<form:form method="post" modelAttribute="usuario">
				<div class="form-group">
					<label>Nombre:</label>
					<form:input type="text" class="form-control" path="nombre"
						placeholder="Nombre completo" />
				</div>
				<div class="form-group">
					<label>Edad:</label>
					<form:input type="text" class="form-control" path="edad"
						placeholder="Edad" />
				</div>
				<div class="form-group">
					<label>Direccion:</label>
					<form:input type="text" class="form-control" path="direccion"
						placeholder="Direccion" />
				</div>
				<div class="form-group">
					<label>Especialidad:</label>
					<form:input type="text" class="form-control" path="especialidad"
						placeholder="Especialidad" />
				</div>
				<div class="form-group">
					<label>Sexo:</label>
					<form:input type="text" class="form-control" path="sexo"
						placeholder="Sexo" />
				</div>
				<div class="form-group">
					<label>Email:</label>
					<form:input type="email" class="form-control" path="email"
						placeholder="Email" />
				</div>
				<div class="form-group">
					<label>Password:</label>
					<form:input type="password" class="form-control" path="password"
						placeholder="Password" />
				</div>
				<div class="form-group">
					<input type="submit" class="form-control btn btn-success btn-lg"
						placeholder="Enviar">

				</div>
			</form:form>
		</div>
	</div>
</body>

</html>

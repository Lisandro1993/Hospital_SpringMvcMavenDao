<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%
	Date dNow = new Date();
	SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy");
	String currentDate = ft.format(dNow);
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"
	integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ=="
	crossorigin="anonymous">
<!-- Tema opcional -->
<!--  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">-->
<!-- JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"
	integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ=="
	crossorigin="anonymous"></script>
<title>Hospital</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<h4>${usuario.nombre }@Doctor</h4>
			</div>
			<div class="col-md-6">
				<h4>${usuario.especialidad }
					${usuario.id }
					<p>
						Fecha actual:
						<%=currentDate%></p>
				</h4>
			</div>
		</div>
		<form action="bienvenida" method="post">
			<input type="hidden" name="id" value="${usuario.id }">
			<div class="row">
				<div class="col-md-6">
					<div class="form-group">
						<label for="mes">Selecciona mes</label> <select
							class="form-control" name="mes">
							<option value="1">Enero</option>
							<option value="2">Febrero</option>
							<option value="3">Marzo</option>
							<option value="4">Abril</option>
							<option value="5">Mayo</option>
							<option value="6">Junio</option>
							<option value="7">Julio</option>
							<option value="8">Agosto</option>
							<option value="9">Septiembre</option>
							<option value="10">Octubre</option>
							<option value="11">Noviembre</option>
							<option value="12">Diciembre</option>
						</select>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<label for="semana">Selecciona Semana</label> <select
							class="form-control" name="semana">
							<option value="1">Semana 1</option>
							<option value="2">Semana 2</option>
							<option value="3">Semana 3</option>
							<option value="4">Semana 4</option>
						</select>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-6">
					<div class="form-group">
						<div class="checkbox">
							<label> <input type="checkbox" name="lunes" value="1">Lunes
							</label>
						</div>
					</div>
					<div class="form-group">
						<div class="checkbox">
							<label> <input type="checkbox" name="martes" value="2">Martes
							</label>
						</div>
					</div>
					<div class="form-group">
						<div class="checkbox">
							<label> <input type="checkbox" name="miercoles" value="3">Miercoles
							</label>
						</div>
					</div>
					<div class="form-group">
						<div class="checkbox">
							<label> <input type="checkbox" name="jueves" value="4">Jueves
							</label>
						</div>
					</div>
					<div class="form-group">
						<div class="checkbox">
							<label> <input type="checkbox" name="viernes" value="5">Viernes
							</label>
						</div>
					</div>
				</div>
				<div class="col-md-6">
					<div class="col-md-6">
						<label>Hora Inicio</label>
						<div class="form-group">
							<input name="lunesHI" type="time"> <input name="martesHI"
								type="time"> <input name="miercolesHI" type="time">
							<input name="juevesHI" type="time"> <input
								name="viernesHI" type="time">

						</div>
					</div>
					<div class="col-md-6">
						<label>Hora Final</label>
						<div class="form-group">
							<input name="lunesF" type="time"> <input name="martesF"
								type="time"> <input name="miercolesF" type="time">
							<input name="juevesF" type="time"> <input name="viernesF"
								type="time">
						</div>
					</div>
				</div>
			</div>
			<div>
				<input type="submit" value="registrar">
			</div>
		</form>

	</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>ToDoList - EITIE</title>
</head>
<body>
	<div class="container">
		<div class="containerHead" >
			ToDoList
			<html:link action="/listaTareas">
				<img alt="atras" src="img/back.png">
			</html:link>
		</div>
		<div class="containerBody">
			<html:form action="/crearTarea" focus="titulo">
				<div class="tarea">
					Título
					<div class="tituloTarea"><html:text property="titulo"/></div>
					Descripción
					<div class="descripcionTarea"><html:textarea property="descripcion"/></div>
					<div><html:image alt="guardar tarea" src="img/save.png" ></html:image></div>
				</div>
			</html:form>
		</div>
		
		<div class="containerFoot">
			<img alt="Logo EITIE" src="img/logo.png">
		</div>
	</div>

</body>
</html>
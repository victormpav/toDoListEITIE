<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
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
			<html:link href="crearTarea.jsp">
				<img alt="nueva tarea" src="img/add.png">
			</html:link>
		</div>
		
		<div class="containerBody">
			<logic:iterate id="tarea" name="listaTareas">
				<div class="tarea">
					<div class="tituloTarea"><bean:write name="tarea" property="titulo"/></div>
					<div class="descripcionTarea"><bean:write name="tarea" property="descripcion"/></div>
					<html:link action="/rellenarEdicionTarea" paramName="tarea" paramProperty="id" paramId="id"><img alt="editar tarea" src="img/edit.png"></html:link>
					<html:link action="/borrarTarea" paramName="tarea" paramProperty="id" paramId="id"><img alt="borrar tarea" src="img/delete.png"></html:link>
				</div>
			</logic:iterate>
		</div>
		
		<div class="containerFoot">
			<img alt="Logo EITIE" src="img/logo.png">
		</div>
	</div>
</body>
</html>
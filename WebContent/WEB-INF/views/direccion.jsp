<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript"  src='<c:url value="/res/js/jquery.js" />'></script>
</head>
<body>
	<h1>Direccion.jsp</h1>
	<!-- pruebas session controler. -->
	<!-- <c:out value="${mensaje}"/> 
	<br>
	<c:out value="${resultado}"/> -->
	
	<sf:form action="${pageContext.request.contextPath}/direccion/save" method="post" commandName="direccion">
		<table>
		<%-- <c:if test="${admin.idAd ne 0 }">
		<sf:input path="idAd" type="hidden"/>
		<sf:input path="fechaCreacion" type="hidden"/>
		</c:if> --%>
		<tr>
			<td>Calle</td>
			<td><sf:input path="calle" type="text"/></td>
		</tr>
		<tr>
			<td>C.P.</td>
			<td><sf:input path="cp" type="text"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Guardar Cambios" /></td>
		</tr>
	</table>
	</sf:form>
	<br>
	<c:out value="${resultado}"></c:out><br><br>
	<c:forEach items="${direcciones}" var="direccion"> <!-- tener presenta que funciona con el toString Direccion -->
	 	<c:out value="${direccion}"/>
	 	<%-- <a href='<c:url value="/admin/${admin.idAd}/update"></c:url>'>Actualizar</a>
	 	<a class="confirm" href='<c:url value="/admin/${admin.idAd}/delete"></c:url>'>Eliminar</a> --%>
	 	<br>
	</c:forEach>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Prueba:</h1>
	<!-- pruebas session controler. -->
	<!-- <c:out value="${mensaje}"/> 
	<br>
	<c:out value="${resultado}"/> -->
	
	<sf:form action="${pageContext.request.contextPath}/admin/save" method="post" commandName="admin">
		<table>
		<tr>
			<td>Nombre</td>
			<td><sf:input path="nombre" type="text"/></td>
		</tr>
		<tr>
			<td>Cargo</td>
			<td><sf:input path="cargo" type="text"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Guardar Cambios" /></td>
		</tr>
	</table>
	</sf:form>
	<br>
	<%
	//	for(Admin admin: listAdmin){
		//	out.print(admin);
		// }
	%>
	<c:out value="${resultado}"></c:out>
	<c:forEach items="${listAdmin}" var="admin">
	 	<c:out value="${admin}"></c:out><br>
	</c:forEach>
</body>
</html>
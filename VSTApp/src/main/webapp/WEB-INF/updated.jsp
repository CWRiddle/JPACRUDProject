<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update status</title>
</head>
<body>

<c:choose>
	<c:when test="${not empty synth}">
		Synth successfully updated.
	</c:when>
	<c:otherwise>
		Error. Synth not updated.
		<form action="home.do" method="GET">
			<input type="submit" value="OK"/>
		</form>
	</c:otherwise>
</c:choose>

</body>
</html>
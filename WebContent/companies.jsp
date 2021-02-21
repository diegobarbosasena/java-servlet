<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.List, br.com.diego.manager.servlet.Company"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Standard Tag Library</title>
</head>
<body>

	<h2>Companies</h2>

	<ul>
		<c:forEach items="${companies }" var="company">
			<li>${company.name } <fmt:formatDate value="${ company.openingDate }" pattern="dd/MM/yyyy"/> </li>
		</c:forEach>
	</ul>

</body>
</html>
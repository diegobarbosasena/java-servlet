
<%
String companyName = (String) request.getAttribute("company");
System.out.println(companyName);
%>

<html>
<body>

	<h2>
		<%=companyName%>
		company successfully registered
	</h2>

</body>
</html>


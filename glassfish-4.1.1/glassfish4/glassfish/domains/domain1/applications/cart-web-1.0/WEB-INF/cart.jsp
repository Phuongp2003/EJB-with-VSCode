<%@page contentType="text/html" pageEncoding="UTF-8"%> <%@taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta
			http-equiv="Content-Type"
			content="text/html; charset=UTF-8" />
		<title>Cart Contents</title>
	</head>
	<body>
		<h1>Cart Contents</h1>
		<c:if test="${not empty products}">
			<ul>
				<c:forEach
					var="product"
					items="${products}">
					<li>${product}</li>
				</c:forEach>
			</ul>
		</c:if>
		<c:if test="${empty products}">
			<p>Cart is empty</p>
		</c:if>
		<a href="${pageContext.request.contextPath}/">Back to Home</a>
	</body>
</html>

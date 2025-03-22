<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta
			http-equiv="Content-Type"
			content="text/html; charset=UTF-8" />
		<title>Error</title>
	</head>
	<body>
		<h1>Error</h1>
		<p style="color: red">${error}</p>
		<a href="${pageContext.request.contextPath}/">Back to Home</a>
	</body>
</html>

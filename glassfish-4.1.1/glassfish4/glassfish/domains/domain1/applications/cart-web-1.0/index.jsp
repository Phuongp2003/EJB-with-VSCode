<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta
			http-equiv="Content-Type"
			content="text/html; charset=UTF-8" />
		<title>Shopping Cart Demo</title>
		<style>
			body {
				font-family: Arial, sans-serif;
				margin: 20px;
				padding: 20px;
			}
			.form-section {
				margin-bottom: 30px;
				padding: 20px;
				border: 1px solid #ddd;
				border-radius: 5px;
			}
			.form-section h2 {
				margin-top: 0;
			}
			input[type='text'] {
				padding: 5px;
				margin: 5px;
			}
			input[type='submit'] {
				padding: 5px 15px;
				background-color: #4caf50;
				color: white;
				border: none;
				border-radius: 3px;
				cursor: pointer;
			}
			input[type='submit']:hover {
				background-color: #45a049;
			}
		</style>
	</head>
	<body>
		<h1>Shopping Cart Management</h1>

		<div class="form-section">
			<h2>Initialize Cart</h2>
			<form
				action="${pageContext.request.contextPath}/cart/init"
				method="post">
				Person Name:
				<input
					type="text"
					name="person"
					required /><br />
				ID (optional):
				<input
					type="text"
					name="id" /><br />
				<input
					type="submit"
					value="Initialize Cart" />
			</form>
		</div>

		<div class="form-section">
			<h2>Add Book to Cart</h2>
			<form
				action="${pageContext.request.contextPath}/cart/add"
				method="post">
				Book Title:
				<input
					type="text"
					name="title"
					required />
				<input
					type="submit"
					value="Add Book" />
			</form>
		</div>

		<div class="form-section">
			<h2>Remove Book from Cart</h2>
			<form
				action="${pageContext.request.contextPath}/cart/remove"
				method="post">
				Book Title:
				<input
					type="text"
					name="title"
					required />
				<input
					type="submit"
					value="Remove Book" />
			</form>
		</div>

		<div class="form-section">
			<h2>View Cart Contents</h2>
			<form
				action="${pageContext.request.contextPath}/cart"
				method="get">
				<input
					type="submit"
					value="View Cart" />
			</form>
		</div>
	</body>
</html>

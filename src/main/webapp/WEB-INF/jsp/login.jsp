<html>
<head>
<title>First Web Application</title>
</head>
<body>
	<font color="red">${errorMessage}</font> Add User
	<form method="post" action="login">
		emailid : <input type="text" name="emailid" /> 
		phone : <input type="text" name="phone" /> 
		<input type="submit" value="Add user" />
	</form>

	<br> Check User
	<form method="post" action="check">
		emailid : <input type="text" name="emailid" /> 
		phone : <input type="text" name="phone" /> 
		 <input type="submit"	value="check user" />
	</form>
</body>
</html>
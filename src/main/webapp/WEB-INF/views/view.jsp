<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Spring Intro site</title>
</head>
<body>

	<h1>Welcome ${user.firstname}</h1>

	<div>
		<p>You have successfully logged in. You details are: <span>${user.firstname} ${user.lastname}</span></p>
	</div>

</body>
</html>
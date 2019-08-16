<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>

	<h1>Welcome ${userObj.name}</h1>
	<h2>Your username is ${userObj.username}</h2>
	
	<h2>Your user type is: ${userTypeObj.description}</h2>
	<h2>You Address is</h2>
	<h3>City ${addressObj.city}</h3>
	<h3>House number ${addressObj.house_number}</h3>
	<h3>Street ${addressObj.street}</h3>
	<h3>Postcode ${addressObj.postcode}</h3>
	
	<h2>Your user details are</h2>
	<h3>Your email is ${userDetailsObj.email}</h3>
	<h3>Your Phone Number is ${userDetailsObj.phoneNumber}</h3>
	
	<h2>Your parcel info</h2>
	<h3>Tracking number ${parcelObj.tracking_number}</h3>
	<h3>Parcel status ${statusObj.description}</h3>
	<h3>Coming from ${fromCityObj.city_name}</h3>
	<h3>Going to ${destinationCityObj.city_name}</h3>
	
	
	
</body>
</html>
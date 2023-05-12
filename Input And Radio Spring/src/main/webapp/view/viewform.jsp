<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Form</title>
</head>
<body>

<form:form action="formsubmit" modelAttribute="user">
	Name:<form:input path="name"/>
	<p/>
	Gender: Male<form:radiobutton path="gender" value="male"/>
			Female<form:radiobutton path="gender" value="female"/>
			<p/>
			Gen:
			<form:radiobuttons path="gen" items="${map}"/>
			<input type="submit" value="Submit">
</form:form>

</body>
</html>
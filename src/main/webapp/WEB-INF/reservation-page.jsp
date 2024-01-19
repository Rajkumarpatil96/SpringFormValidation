<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"  %>
<html>
<title>Reservation page</title>
<body>
<h1>Reservation-page</h1>
<form:form action="submitform" modelAttribute="reservation">
FirstName :<form:input path="firstName"/><br>
LastName  :<form:input path="lastName"/><br>
Gender :
male :<form:radiobutton path="Gender" value="male"/>
Female :<form:radiobutton path="Gender" value="female"/><br>
meals:
Breakfast:<form:checkbox path="Food" value="Breakfast"/>
lunch:<form:checkbox path="Food" value="lunch"/>
Dinner :<form:checkbox path="Food" value="Dinner"/><br>
Leaving From :<form:select path="cityFrom">
				<form:option value="mirzapur"></form:option>
				<form:option value="daultabad"></form:option>
				<form:option value="sangli"></form:option>
				<form:option value="miraj"></form:option>
				<form:option value="kolhapur"></form:option>
			</form:select><br>
Going To :<form:select path="cityTo">
			<form:option value="karnatak"></form:option>
			<form:option value="hydrabad"></form:option>
			<form:option value="saswad"></form:option>
			<form:option value="Nagpur"></form:option>
			</form:select><br>
			
			<input type="submit" value="submit">

</form:form>
</body>
</html>
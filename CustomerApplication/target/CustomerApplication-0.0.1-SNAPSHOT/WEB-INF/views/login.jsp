 <!DOCTYPE form:form PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <form:form action="logincheck.form" method="post" commandName="log">
 	<table align="center" border="1">
 		<tr>
 			<td>User name:<form:input path="userName" /></td>
 			<td style='color:red'><form:errors path="userName" /></td>
 		</tr>
 		<tr>
 			<td>Password:<form:password path="password" /></td>
 			<td style='color:red'><form:errors path="password" /></td>
 		</tr>
 	</table>
 	<h2 align="center"><input type="submit" value="Login"></h2>
 </form:form>
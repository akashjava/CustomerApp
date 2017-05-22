 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <h1 align="center">Enter Student Details</h1>
 <form:form action="register.form"  method="POST" commandName="student">
 <table>
 	<tr>
 		<td>*First Name:</td>
 		<td><form:input path="firstName"/><br><form:errors path="firstName"/>
 		</td><td>Last Name:</td>
 		<td><form:password path="lastName"/><br><form:errors path="lastName"/></td>
 	</tr>
 	<tr>
 		<td>*Date of Birth:</td>
 		<td><form:input path="dateOfBirth"/><br><form:errors path="dateOfBirth"/></td>
 		 <td>Gender</td>
 		<td> <form:radiobutton path="gender" value="MALE" label="Male"/>
 		 <form:radiobutton path="gender" value="FEMALE" label="Female"/><br><form:errors path="gender"/>
 		 </td>
 	</tr>
 	<tr>
 		<td>*Mobile No:</td>
 		<td><form:input path="mobileNo"/><br><form:errors path="mobileNo"/></td>
 		<td>*Email ID: </td>
 		<td><form:input path="email"/><br><form:errors path="email"/></td>
 	</tr>
 	<tr>
 		<td>*Stream</td>
 		<td> <form:radiobutton path="stream" value="ARTS" label="ARTS"/>
 		 <form:radiobutton path="stream" value="SCIENCE" label="SCIENCE"/>
 		  <form:radiobutton path="stream" value="COMMERCE" label="COMMERCE"/></td>
 		  <td>*Skill Set(Multiple)</td>
 		<td> <form:select path="cource" multiple="">
 					<form:option value="JAVA">JAVA</form:option>
 					<form:option value="DOTNET">.NET</form:option>
 					<form:option value="ORACLE">ORACLE</form:option>
 					<form:option value="HADOOP">HADOOP</form:option>
 					<form:option value="PHP">PHP</form:option>
 					<form:option value="PYTHON">PYTHON</form:option>
 					<form:option value="C/C++">C/C++</form:option>
 		</form:select>
 		
</td>
 	</tr>
 	
 	<tr><td align="center"><input type="submit" value="submit"></td></tr>
 	</table>
 </form:form>